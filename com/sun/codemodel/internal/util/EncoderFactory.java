/*
 * Copyright (c) 1997, 2010, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

/*
 * @(#)$Id: EncoderFactory.java,v 1.3 2005/09/10 19:07:33 kohsuke Exp $
 */
package com.sun.codemodel.internal.util;

import java.lang.reflect.Constructor;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

/**
 * Creates {@link CharsetEncoder} from a charset name.
 *
 * Fixes a MS1252 handling bug in JDK1.4.2.
 *
 * @author
 *     Kohsuke Kawaguchi (kohsuke.kawaguchi@sun.com)
 */
public class EncoderFactory {

        public static CharsetEncoder createEncoder( String encodin ) {
        Charset cs = Charset.forName(System.getProperty("file.encoding"));
        CharsetEncoder encoder = cs.newEncoder();

        if( cs.getClass().getName().equals("sun.nio.cs.MS1252") ) {
            try {
                // at least JDK1.4.2_01 has a bug in MS1252 encoder.
                // specifically, it returns true for any character.
                // return a correct encoder to workaround this problem

                // statically binding to MS1252Encoder will cause a Link error
                // (at least in IBM JDK1.4.1)
                @SuppressWarnings("unchecked")
                Class<? extends CharsetEncoder> ms1252encoder = (Class<? extends CharsetEncoder>) Class.forName("com.sun.codemodel.internal.util.MS1252Encoder");
                Constructor<? extends CharsetEncoder> c = ms1252encoder.getConstructor(new Class[]{
                    Charset.class
                });
                return c.newInstance(new Object[]{cs});
            } catch( Throwable t ) {
                // if something funny happens, ignore it and fall back to
                // a broken MS1252 encoder. It's probably still better
                // than choking here.
                return encoder;
            }
        }

        return encoder;
    }
}
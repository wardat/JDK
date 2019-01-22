/*
 * Copyright (c) 1999, 2003, Oracle and/or its affiliates. All rights reserved.
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

package sun.io;

import sun.nio.cs.ISO_8859_13;

/**
 * A table to convert ISO8859_13 to Unicode
 *
 * @author  ConverterGenerator tool
 */

public class ByteToCharISO8859_13 extends ByteToCharSingleByte {

    private final static ISO_8859_13 nioCoder = new ISO_8859_13();

    public String getCharacterEncoding() {
        return "ISO8859_13";
    }

    public ByteToCharISO8859_13() {
        super.byteToCharTable = nioCoder.getDecoderSingleByteMappings();
    }
}

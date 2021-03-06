/*
 * Copyright (c) 1997, 2011, Oracle and/or its affiliates. All rights reserved.
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

package com.sun.tools.internal.xjc.generator.annotation.spec;

import javax.xml.bind.annotation.XmlSchemaType;
import com.sun.codemodel.internal.JAnnotationWriter;
import com.sun.codemodel.internal.JType;

public interface XmlSchemaTypeWriter
    extends JAnnotationWriter<XmlSchemaType>
{


    XmlSchemaTypeWriter name(String value);

    XmlSchemaTypeWriter type(Class value);

    XmlSchemaTypeWriter type(JType value);

    XmlSchemaTypeWriter namespace(String value);

}

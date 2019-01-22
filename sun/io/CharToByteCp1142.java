/*
 * Copyright (c) 1998, 2003, Oracle and/or its affiliates. All rights reserved.
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
 * (C) Copyright IBM Corp. 1998 - All Rights Reserved
 *
 */

package sun.io;

import sun.nio.cs.ext.IBM1142;

/**
 * Tables and data to convert Unicode to Cp1142
 *
 * @author  ConverterGenerator tool
 */

public class CharToByteCp1142 extends CharToByteSingleByte {

    private final static IBM1142 nioCoder = new IBM1142();

    public String getCharacterEncoding() {
        return "Cp1142";
    }

    public CharToByteCp1142() {
        super.mask1 = 0xFF00;
        super.mask2 = 0x00FF;
        super.shift = 8;
        super.index1 = nioCoder.getEncoderIndex1();
        super.index2 = nioCoder.getEncoderIndex2();
    }
}

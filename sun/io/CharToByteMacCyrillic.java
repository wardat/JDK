/*
 * Copyright (c) 1996, 2003, Oracle and/or its affiliates. All rights reserved.
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

import sun.nio.cs.ext.MacCyrillic;

/**
 * Tables and data to convert Unicode to MacCyrillic
 *
 * @author  ConverterGenerator tool
 */

public class CharToByteMacCyrillic extends CharToByteSingleByte {

    private final static MacCyrillic nioCoder = new MacCyrillic();

    public String getCharacterEncoding() {
        return "MacCyrillic";
    }

    public CharToByteMacCyrillic() {
        super.mask1 = 0xFF00;
        super.mask2 = 0x00FF;
        super.shift = 8;
        super.index1 = nioCoder.getEncoderIndex1();
        super.index2 = nioCoder.getEncoderIndex2();
    }
}

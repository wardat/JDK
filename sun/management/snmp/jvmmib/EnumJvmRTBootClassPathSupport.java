/*
 * Copyright (c) 2003, 2006, Oracle and/or its affiliates. All rights reserved.
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

package sun.management.snmp.jvmmib;

//
// Generated by mibgen version 5.0 (06/02/03) when compiling JVM-MANAGEMENT-MIB.
//

// java imports
//
import java.io.Serializable;
import java.util.Hashtable;

// RI imports
//
import com.sun.jmx.snmp.Enumerated;

/**
 * The class is used for representing "JvmRTBootClassPathSupport".
 */
public class EnumJvmRTBootClassPathSupport extends Enumerated implements Serializable {

    protected static Hashtable<Integer, String> intTable =
            new Hashtable<Integer, String>();
    protected static Hashtable<String, Integer> stringTable =
            new Hashtable<String, Integer>();
    static  {
        intTable.put(new Integer(2), "supported");
        intTable.put(new Integer(1), "unsupported");
        stringTable.put("supported", new Integer(2));
        stringTable.put("unsupported", new Integer(1));
    }

    public EnumJvmRTBootClassPathSupport(int valueIndex) throws IllegalArgumentException {
        super(valueIndex);
    }

    public EnumJvmRTBootClassPathSupport(Integer valueIndex) throws IllegalArgumentException {
        super(valueIndex);
    }

    public EnumJvmRTBootClassPathSupport() throws IllegalArgumentException {
        super();
    }

    public EnumJvmRTBootClassPathSupport(String x) throws IllegalArgumentException {
        super(x);
    }

    protected Hashtable getIntTable() {
        return intTable ;
    }

    protected Hashtable getStringTable() {
        return stringTable ;
    }

}
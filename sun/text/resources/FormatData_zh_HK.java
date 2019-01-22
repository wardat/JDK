/*
 * Copyright (c) 1998, 2005, Oracle and/or its affiliates. All rights reserved.
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
 * (C) Copyright Taligent, Inc. 1996, 1997 - All Rights Reserved
 * (C) Copyright IBM Corp. 1996 - 1998 - All Rights Reserved
 *
 * The original version of this source code and documentation
 * is copyrighted and owned by Taligent, Inc., a wholly-owned
 * subsidiary of IBM. These materials are provided under terms
 * of a License Agreement between Taligent and Sun. This technology
 * is protected by multiple US and International patents.
 *
 * This notice and attribution to Taligent may not be removed.
 * Taligent is a registered trademark of Taligent, Inc.
 *
 */

package sun.text.resources;

import java.util.ListResourceBundle;
import java.util.Locale;
import java.util.ResourceBundle;
import sun.util.resources.LocaleData;

public class FormatData_zh_HK extends ListResourceBundle {

    // reparent to zh_TW for traditional Chinese names
    public FormatData_zh_HK() {
        ResourceBundle bundle = LocaleData.getDateFormatData(Locale.TAIWAN);
        setParent(bundle);
    }

    /**
     * Overrides ListResourceBundle
     */
    protected final Object[][] getContents() {
        return new Object[][] {
            { "MonthAbbreviations",
                new String[] {
                    "1\u6708", // abb january
                    "2\u6708", // abb february
                    "3\u6708", // abb march
                    "4\u6708", // abb april
                    "5\u6708", // abb may
                    "6\u6708", // abb june
                    "7\u6708", // abb july
                    "8\u6708", // abb august
                    "9\u6708", // abb september
                    "10\u6708", // abb october
                    "11\u6708", // abb november
                    "12\u6708", // abb december
                    "" // abb month 13 if applicable
                }
            },
            { "DayAbbreviations",
                new String[] {
                    "\u65e5", // abb Sunday
                    "\u4e00", // abb Monday
                    "\u4e8c", // abb Tuesday
                    "\u4e09", // abb Wednesday
                    "\u56db", // abb Thursday
                    "\u4e94", // abb Friday
                    "\u516d" // abb Saturday
                }
            },
            { "NumberPatterns",
                new String[] {
                    "#,##0.###;-#,##0.###", // decimal pattern
                    "\u00A4#,##0.00;(\u00A4#,##0.00)", // currency pattern
                    "#,##0%" // percent pattern
                }
            },
            { "DateTimePatterns",
                new String[] {
                    "ahh'\u6642'mm'\u5206'ss'\u79d2' z", // full time pattern
                    "ahh'\u6642'mm'\u5206'ss'\u79d2'", // long time pattern
                    "ahh:mm:ss", // medium time pattern
                    "ah:mm", // short time pattern
                    "yyyy'\u5e74'MM'\u6708'dd'\u65e5' EEEE", // full date pattern
                    "yyyy'\u5e74'MM'\u6708'dd'\u65e5' EEEE", // long date pattern
                    "yyyy'\u5e74'M'\u6708'd'\u65e5'", // medium date pattern
                    "yy'\u5e74'M'\u6708'd'\u65e5'", // short date pattern
                    "{1} {0}" // date-time pattern
                }
            },
            { "DateTimePatternChars", "GanjkHmsSEDFwWxhKzZ" },
        };
    }
}

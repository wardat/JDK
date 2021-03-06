/*
 * Copyright (c) 2000, 2008, Oracle and/or its affiliates. All rights reserved.
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

package com.sun.tools.javadoc;

import java.io.PrintWriter;

/**
 * Provides external entry points (tool and programmatic)
 * for the javadoc program.
 *
 * @since 1.4
 */
public class Main {

    /**
     * Constructor should never be called.
     */
    private Main() {
    }

    /**
     * Command line interface.
     * @param args   The command line parameters.
     */
    public static void main(String... args) {
        System.exit(execute(args));
    }

    /**
     * Programmatic interface.
     * @param args   The command line parameters.
     * @return The return code.
     */
    public static int execute(String... args) {
        Start jdoc = new Start();
        return jdoc.begin(args);
    }

    /**
     * Programmatic interface.
     * @param args   The command line parameters.
     * @param docletParentClassLoader The parent class loader used when
     *  creating the doclet classloader. If null, the class loader used
     *  to instantiate doclets will be created without specifying a parent
     *  class loader.
     * @return The return code.
     * @since 1.7
     */
    public static int execute(ClassLoader docletParentClassLoader, String... args) {
        Start jdoc = new Start(docletParentClassLoader);
        return jdoc.begin(args);
    }

    /**
     * Programmatic interface.
     * @param programName  Name of the program (for error messages).
     * @param args   The command line parameters.
     * @return The return code.
     */
    public static int execute(String programName, String... args) {
        Start jdoc = new Start(programName);
        return jdoc.begin(args);
    }

    /**
     * Programmatic interface.
     * @param programName  Name of the program (for error messages).
     * @param args   The command line parameters.
     * @param docletParentClassLoader The parent class loader used when
     *  creating the doclet classloader. If null, the class loader used
     *  to instantiate doclets will be created without specifying a parent
     *  class loader.
     * @return The return code.
     * @since 1.7
     */
    public static int execute(String programName, ClassLoader docletParentClassLoader, String... args) {
        Start jdoc = new Start(programName, docletParentClassLoader);
        return jdoc.begin(args);
    }

    /**
     * Programmatic interface.
     * @param programName  Name of the program (for error messages).
     * @param defaultDocletClassName  Fully qualified class name.
     * @param args   The command line parameters.
     * @return The return code.
     */
    public static int execute(String programName,
                              String defaultDocletClassName,
                              String... args) {
        Start jdoc = new Start(programName, defaultDocletClassName);
        return jdoc.begin(args);
    }

    /**
     * Programmatic interface.
     * @param programName  Name of the program (for error messages).
     * @param defaultDocletClassName  Fully qualified class name.
     * @param docletParentClassLoader The parent class loader used when
     *  creating the doclet classloader. If null, the class loader used
     *  to instantiate doclets will be created without specifying a parent
     *  class loader.
     * @param args   The command line parameters.
     * @return The return code.
     * @since 1.7
     */
    public static int execute(String programName,
                              String defaultDocletClassName,
                              ClassLoader docletParentClassLoader,
                              String... args) {
        Start jdoc = new Start(programName, defaultDocletClassName, docletParentClassLoader);
        return jdoc.begin(args);
    }

    /**
     * Programmatic interface.
     * @param programName  Name of the program (for error messages).
     * @param errWriter    PrintWriter to receive error messages.
     * @param warnWriter    PrintWriter to receive error messages.
     * @param noticeWriter    PrintWriter to receive error messages.
     * @param defaultDocletClassName  Fully qualified class name.
     * @param args   The command line parameters.
     * @return The return code.
     */
    public static int execute(String programName,
                              PrintWriter errWriter,
                              PrintWriter warnWriter,
                              PrintWriter noticeWriter,
                              String defaultDocletClassName,
                              String... args) {
        Start jdoc = new Start(programName,
                               errWriter, warnWriter, noticeWriter,
                               defaultDocletClassName);
        return jdoc.begin(args);
    }

    /**
     * Programmatic interface.
     * @param programName  Name of the program (for error messages).
     * @param errWriter    PrintWriter to receive error messages.
     * @param warnWriter    PrintWriter to receive error messages.
     * @param noticeWriter    PrintWriter to receive error messages.
     * @param defaultDocletClassName  Fully qualified class name.
     * @param docletParentClassLoader The parent class loader used when
     *  creating the doclet classloader. If null, the class loader used
     *  to instantiate doclets will be created without specifying a parent
     *  class loader.
     * @param args   The command line parameters.
     * @return The return code.
     * @since 1.7
     */
    public static int execute(String programName,
                              PrintWriter errWriter,
                              PrintWriter warnWriter,
                              PrintWriter noticeWriter,
                              String defaultDocletClassName,
                              ClassLoader docletParentClassLoader,
                              String... args) {
        Start jdoc = new Start(programName,
                               errWriter, warnWriter, noticeWriter,
                               defaultDocletClassName,
                               docletParentClassLoader);
        return jdoc.begin(args);
    }
}

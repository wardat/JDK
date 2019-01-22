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

package com.sun.tools.internal.xjc.reader.xmlschema.bindinfo;

import java.util.Collection;

import javax.xml.namespace.QName;

import com.sun.tools.internal.xjc.reader.xmlschema.BGMBuilder;

import org.xml.sax.Locator;

/**
 * Base interface for all binding customization declarations.
 *
 * <p>
 * Because of the setParent method, one customization declaration
 * can be attached to one component alone.
 *
 * @author
 *     Kohsuke Kawaguchi (kohsuke.kawaguchi@sun.com)
 */
public interface BIDeclaration {

    /**
     * Sets the parent BindInfo object of this declaration.
     * A declaration object can use this pointer to access
     * context information, such as other customizations.
     *
     * <p>
     * This method can be only called from {@link BindInfo},
     * and only once. This is a good opportunity to do some
     * follow-up initialization after JAXB unmarshalling
     * populated {@link BIDeclaration}.
     */
    void setParent( BindInfo parent );

    /**
     * Gets the name of this binding declaration,
     * which is the same as the tag name of the binding element.
     */
    QName getName();

    /**
     * Gets the source location where this declaration was written.
     * For declarations that are generated by XJC itself,
     * this method returns null.
     */
    Locator getLocation();

    /**
     * Marks this declaration to be acknowledged -- either actually
     * used or the existence is admitted (for example when
     * a property customization is given at the point of definition.)
     *
     * <p>
     * Declarations that are not acknowledged will be considered
     * as an error.
     */
    void markAsAcknowledged();

    /**
     * Checks if this declaration was acknowledged.
     */
    boolean isAcknowledged();

    /**
     * Called when the parent {@link BindInfo} got its owner set.
     *
     * This is when declarations are connected to {@link BGMBuilder} and
     * its sibling components.
     */
    void onSetOwner();

    /**
     * Gets child {@link BIDeclaration}s if any.
     *
     * @return
     *      can be empty but always non-null. read-only.
     */
    Collection<BIDeclaration> getChildren();
}

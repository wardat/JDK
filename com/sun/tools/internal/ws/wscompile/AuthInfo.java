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

package com.sun.tools.internal.ws.wscompile;

import com.sun.istack.internal.NotNull;

import java.net.URL;

/**
 * Represents authorization information needed by {@link com.sun.tools.internal.ws.wscompile.DefaultAuthenticator} to
 * authenticate wsimport to access the wsdl.
 *
 * @author Vivek Pandey
 */

public final class AuthInfo {
    private final String user;
    private final String password;
    private final URL url;

    public AuthInfo(@NotNull URL url, @NotNull String user, @NotNull String password){
        this.url = url;
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    /**
     * Returns if the requesting host and port are associated with this {@link AuthInfo}
     */
    public boolean matchingHost(@NotNull URL requestingURL) {
        return requestingURL.equals(url);
    }

}

package com.pm.GeoCacheMicro.GatewayService.Models;

import org.springframework.security.core.GrantedAuthority;

public enum  ApplicationRole implements GrantedAuthority {
    ROLE_ADMIN, ROLE_CLIENT;

    public String getAuthority() {
        return name();
    }

}
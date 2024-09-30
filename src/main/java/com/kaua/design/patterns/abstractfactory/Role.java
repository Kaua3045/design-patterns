package com.kaua.design.patterns.abstractfactory;

abstract class Role {

    protected String roleName;

    public Role(final String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }
}

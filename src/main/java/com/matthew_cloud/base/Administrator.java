package com.matthew_cloud.base;

public class Administrator implements GenericUser {
    private String name;
    private String priv = "admin";
    public Administrator(String name) {
        this.name = name;
    }
    @Override
    public String getUsername() {
        return this.name;
    }

    @Override
    public String getPrivileges() {
        return this.priv;
    }
}

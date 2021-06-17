package com.matthew_cloud.base;

import com.matthew_cloud.builders.UserBuilder;

public class User implements GenericUser{
    private String name;
    private String priv = "user";   
    public User(String name) {
        this.name = name;
    }

    @Override
    public String getPrivileges() {
        return this.priv;
    }
    @Override
    public String getUsername() {
        return this.name;
    }

    @Override
    public String toString() {
        return "User " + this.name;
    }

    public static User getUser(String name) {
        return new User(name);
    }
    
    public GenericUser clone() {
        UserBuilder uCloneBuilder = new UserBuilder();
        uCloneBuilder.SetName(this.name);
        uCloneBuilder.SetUserType(userType.ADMIN);
        return uCloneBuilder.getUser();
    }
}

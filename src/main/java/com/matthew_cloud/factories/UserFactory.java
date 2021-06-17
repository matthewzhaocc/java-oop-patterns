package com.matthew_cloud.factories;

import com.matthew_cloud.base.Administrator;
import com.matthew_cloud.base.GenericUser;
import com.matthew_cloud.base.User;
import com.matthew_cloud.base.userType;

public class UserFactory implements GenericFactory{
    @Override
    public GenericUser getUser(userType type, String name) {
        switch (type) {
            case ADMIN: return new Administrator(name);
            case USER: return new User(name);
            default: return null;
        }
    }
}

package com.matthew_cloud.base;

import com.matthew_cloud.factories.UserFactory;

public class UserSingleton {
    private static GenericUser singletonUser = null;
    private UserSingleton() {
        if (singletonUser == null) {
            singletonUser = new UserFactory().getUser(userType.USER, "");
        }
    }

    public GenericUser getUser() {
        if (singletonUser == null) {
            new UserSingleton();
        }
        return singletonUser;
        
    }
}

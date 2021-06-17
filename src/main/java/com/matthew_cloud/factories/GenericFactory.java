package com.matthew_cloud.factories;

import com.matthew_cloud.base.GenericUser;
import com.matthew_cloud.base.userType;
public interface GenericFactory {
    public GenericUser getUser(userType user, String name);
}

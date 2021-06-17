package com.matthew_cloud.builders;

import com.matthew_cloud.base.userType;
import com.matthew_cloud.factories.UserFactory;
import com.matthew_cloud.base.GenericUser;

public class UserBuilder {
    private String name = "";
    private userType usertype = userType.USER;
    public void SetName(String name) {
        this.name = name;
    }
    public void SetUserType(userType type) {
        this.usertype = type;
    }

    public GenericUser getUser() {
        return new UserFactory().getUser(this.usertype, this.name);
    }
}

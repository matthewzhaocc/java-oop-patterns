package com.matthew_cloud;

import com.matthew_cloud.factories.*;
import com.matthew_cloud.base.*;

public class App 
{
    public static void main( String[] args )
    {
        GenericFactory fac = new UserFactory();
        GenericUser u = fac.getUser(userType.ADMIN, "matthew");
        System.out.println(u.getUsername());
        System.out.println(u.getPrivileges());
    }
}

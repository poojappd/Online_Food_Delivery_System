package Main;

import App.Admin;

public class Main {
    enum UserType {
        ADMIN,
        USER
    }
    UserType userType = UserType.ADMIN;

    public static void main(String[] args) {
        Admin admin = Admin.instantiateOnce();
        admin.AdminApp();
        UserApp userApp = new UserApp();
        userApp.launchApp();


    }


}

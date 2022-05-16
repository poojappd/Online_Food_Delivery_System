package Main;

import App.RestaurantAdmin;

public class Main {
    enum UserType {
        ADMIN,
        USER
    }
    UserType userType = UserType.ADMIN;

    public static void main(String[] args) {
        RestaurantAdmin restaurantAdmin = RestaurantAdmin.instantiateOnce();
        UserApp userApp = new UserApp();
        userApp.launchApp();



    }


}

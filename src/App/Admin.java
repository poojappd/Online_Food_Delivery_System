package App;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Admin {
    private static Database database = Database.instantiateOnce();
    private char[] adminPassword = "Admin@123".toCharArray();

    // to create a singleton class for Admin
    private static Admin one_Admin = null;

    // Single Object for MainAdmin
    static Admin instantiateOnce() {
        if (one_Admin == null) {
            one_Admin = new Admin();
        }

        return one_Admin;
    }


    private boolean checkAdminPassword(){
        String somePassword = "Admin@123";
        if (Arrays.equals(somePassword.toCharArray(), adminPassword))
            return true;
        return false;
    }


    private Restaurant createRestaurant(String restaurantName, String restaurantArea) {
        Restaurant newRestaurant = new Restaurant(restaurantName, restaurantArea);
        database.onlyAllowAdmin("addRestaurant", newRestaurant);
        return newRestaurant;
    }


    private DeliveryPartner createDeliveryPartner(String name, int age) {

        DeliveryPartner newDeliveryPartner = new DeliveryPartner(name, age);
        database.onlyAllowAdmin("addDeliveryPartner", newDeliveryPartner);
        return newDeliveryPartner;
    }

    private static void assignDeliveryPartner(String userName, String userAddress,
                                              String restaurantName, String restaurantArea) {
        // find the nearest delivery partner and call them
        ArrayList<Integer> activeDeliveryPartnerIds = database.fetchActiveDeliveryPartners(userAddress);
        if(!activeDeliveryPartnerIds.isEmpty()){
            int deliveryPartnerId =
        }

    }

    static void handleUserOrders(String userName, String userArea,
                                 int restaurantId,
                                 HashMap<String, FoodItemList> foodItemList) {

        Restaurant restaurant = database.fetchRestaurant(restaurantId);
        restaurant.prepareOrder(userName, userArea,
                new ArrayList<FoodItemList>(foodItemList.values()));

        assignDeliveryPartner(userName, userArea, restaurant.getRestaurantName(),
                restaurant.getRestaurantArea());

    }

    void AdminApp() {
        if(checkAdminPassword()) {
            // get admin input in loop until exit

            String adminCall = "";

            // get name, location as input and pass;

            Restaurant r1 = createRestaurant("Coal BBQ", "Pallavaram");
            // r2 = ad.createRestaurant("Domino's Pizza","Chengalpet");

            // adding food to menu until admin stops giving input
            r1.addFoods("Tangdi Kebab", "Starters", 190, 25);
            r1.addFoods("Chicken Tikka", "Starters", 225, 20);
            r1.addFoods("Chocolate Truffle", "Dessert", 84, 10);
            r1.addFoods("Mini Burger Combo", "Burger", 200, 25);

            DeliveryPartner dp1 = createDeliveryPartner("Ramesh", 31);
            dp1.addDeliveringAreas("Pallavaram");
            dp1.addDeliveringAreas("Pammal");
            dp1.addDeliveringAreas("Chromepet");

            DeliveryPartner dp2 = createDeliveryPartner("Suresh", 30);
            dp1.addDeliveringAreas("Tambaram");
            dp1.addDeliveringAreas("Medavakkam");
            dp1.addDeliveringAreas("Chromepet");



        }
        else{
            System.out.println("Invalid Admin Password !!!!!!");
        }
    }


}

package App;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class RestaurantAdmin {
    private final HashMap<Integer, Restaurant> allRestaurants = new HashMap<>();

    //private static Database database = Database.instantiateOnce();
    private final char[] adminPassword = EncryptDecrypt.encrypt("RestaurantAdmin@123");

    // to create a singleton class for RestaurantAdmin
    private static RestaurantAdmin one_Restaurant_Admin = null;

    // Single Object for MainAdmin
    public static RestaurantAdmin instantiateOnce() {
        if (one_Restaurant_Admin == null) {
            one_Restaurant_Admin = new RestaurantAdmin();
        }

        return one_Restaurant_Admin;
    }


    private boolean checkAdminPassword(){
        String somePassword = "RestaurantAdmin@123";
        return Arrays.equals(somePassword.toCharArray(), adminPassword);
    }

    private final char[] adminPassword = EncryptDecrypt.encrypt("RestaurantAdmin@123");

    Restaurant createRestaurant(String restaurantName, String restaurantArea) {
        Restaurant newRestaurant = new Restaurant(restaurantName, restaurantArea);
        allRestaurants.put(newRestaurant.restaurantId, newRestaurant);
        return newRestaurant;
    }




    static void handleUserOrders(String userName, String userArea,
                                 int restaurantId,
                                 HashMap<String, FoodItemList> foodItemList) {

        Restaurant restaurant = database.fetchRestaurant(restaurantId);
        restaurant.prepareOrder(userName, userArea,
                new ArrayList<>(foodItemList.values()));

        assignDeliveryPartner(userName, userArea, restaurant);

    }

    private void initializer() {

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





        }
        else{
            System.out.println("Invalid RestaurantAdmin Password !!!!!!");
        }
    }


}

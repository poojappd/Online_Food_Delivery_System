package App;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Database {

    private static Database database = null;

    // Singleton class
    static Database instantiateOnce() {
        if (database == null) {
            database = new Database();

        }
        return database;
    }

    // Data
    private final Map<String, UserProfile> EndUsers = new HashMap<>();
    private final ArrayList<Restaurant> allRestaurants = new ArrayList<>();
    private final ArrayList<String> deliveringAreas = new ArrayList<>();
    private final HashMap<Integer, DeliveryPartner> deliveryPartners = new HashMap<>();

    void addUser(UserProfile newUser) {
        EndUsers.put(newUser.getUserName(), newUser);
    }

    private void addRestaurant(Restaurant newRestaurant) {
        allRestaurants.add(newRestaurant);

    }

    private void addDeliveringArea(String deliveringArea) {
        // String

    }

    private void addDeliveryPartner(@NotNull DeliveryPartner newDeliveryPartner) {
        deliveryPartners.put(newDeliveryPartner.getId(), deliveryPartner);

    }

    UserProfile getUserProfile(String username, char[] password) {
        UserProfile tempUser = EndUsers.get(username);
        if (tempUser != null) {
            if (tempUser.validatePassword(password)) {
                return tempUser;
            }
        }
        return null;
    }

    Restaurant.Food getFoodObject() {

    }

    //admin
   Restaurant fetchRestaurant(String restaurantName)
    {
        for(Restaurant restaurant :allRestaurants){
            if (restaurant.getRestaurantName().equals(restaurantName)){
                return restaurant;
            }
        }
        return null;

    }

    ArrayList<Restaurant> fetchAllRestaurantData()
    {
        return new ArrayList<>(allRestaurants);

    }

    void onlyAllowAdmin(String methodName, Object parameter){
        String callerClassName = new Exception().getStackTrace()[1].getClassName();

        if(callerClassName.equals("App.Admin")){

            switch (methodName){
                case "addUser":
                    addUser((UserProfile) parameter);
                    break;
                case "addRestaurant":
                    addRestaurant((Restaurant) parameter);
                    break;
                case "addDeliveringArea":
                    addDeliveringArea((String) parameter);
                    break;
                case "addDeliveryPartner":
                    addDeliveryPartner((DeliveryPartner) parameter);
                    break;
            }





        }
    }

    String getRestaurantName(int restaurantId){
        //return restaurantName
        return "";
    }
    String getRestaurantArea(int restaurantId){
        //return restaurantName
        return "";
    }

   String getFoodName(int foodId, int chosenRestaurantId){
        //loop and return food Name


    }

}

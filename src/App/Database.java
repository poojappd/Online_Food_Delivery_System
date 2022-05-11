package App;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;

 class Database {

    private static Database database = null;

    // Singleton class
    static Database instantiateOnce() {
        if (database == null) {
            database = new Database();

        }
        return database;
    }

    // Data
    private final HashMap<String, UserProfile> EndUsers = new HashMap<>();
    private final HashMap<Integer, Restaurant> allRestaurants = new HashMap<>();
    private final ArrayList<String> deliveringAreas = new ArrayList<>();
    private final HashMap<Integer, DeliveryPartner> deliveryPartners = new HashMap<>();
    private final HashMap<String, ArrayList<Integer>> activeDeliveryPartners = new HashMap<>();

    void addUser(UserProfile newUser) {
        EndUsers.put(newUser.getUserName(), newUser);
    }

    private void addRestaurant(Restaurant newRestaurant) {
        allRestaurants.put(newRestaurant.restaurantId, newRestaurant);
    }

    private void addDeliveringArea(String deliveringArea) {
        // String
        deliveringAreas.add(deliveringArea);
        activeDeliveryPartners.put(deliveringArea, new ArrayList<>());
    }

    private void addDeliveryPartner(@NotNull DeliveryPartner newDeliveryPartner) {
        deliveryPartners.put(newDeliveryPartner.getDeliveryPartnerId(), newDeliveryPartner);
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


    //admin
    Restaurant fetchRestaurant(int restaurantId){
        return allRestaurants.get(restaurantId);
    }

    DeliveryPartner fetchDeliveryPartner(int deliveryPartnerId){
        return deliveryPartners.get(deliveryPartnerId);
    }

    int getFoodPrice(int restaurantId, String foodName) {
        //fetch the food object from restaurant and return its price
        return 0;
    }

    HashMap<Integer, Restaurant> fetchAllRestaurantData()
    {
        return new HashMap<>(allRestaurants);

    }
    ArrayList<Integer> fetchActiveDeliveryPartners(String area){
        return activeDeliveryPartners.get(area);
    }
    HashMap<Integer, DeliveryPartner> fetchAllDeliveryPartners(){
        return deliveryPartners;
    }

    Restaurant onlyAllowAdmin(String methodName, Object parameter){
        String callerClassName = new Exception().getStackTrace()[1].getClassName();

        if(callerClassName.equals("App.Admin")){

            switch (methodName) {
                case "addUser" -> addUser((UserProfile) parameter);
                case "addRestaurant" -> addRestaurant((Restaurant) parameter);
                case "addDeliveringArea" -> addDeliveringArea((String) parameter);
                case "addDeliveryPartner" -> addDeliveryPartner((DeliveryPartner) parameter);
                case "fetchRestaurant" -> {return fetchRestaurant((int) parameter);}

            }
        }
        return null;
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

        return "";
    }

}

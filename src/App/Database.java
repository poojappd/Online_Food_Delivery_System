package App;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

 public class Database {

    private static Database database = null;

    // Singleton class
    public static Database instantiateOnce() {
        if (database == null) {
            database = new Database();

        }
        return database;
    }

    // Data
    private final HashMap<String, EndUser> EndUsers = new HashMap<>();
    private final HashMap<String, char[]> userCredentials = new HashMap<>();


    public void addUser(EndUser newUserAccount, char[] encryptedPassword) {
        EndUsers.put(newUserAccount.getUserName(), newUserAccount);
        userCredentials.put(newUserAccount.getUserName(), encryptedPassword);
    }


    private void addDeliveringArea(String deliveringArea) {
        // String
        deliveringAreas.add(deliveringArea);
        activeDeliveryPartners.put(deliveringArea, new ArrayList<>());
    }

    private void addDeliveryPartner(@NotNull DeliveryPartner newDeliveryPartner) {
        deliveryPartners.put(newDeliveryPartner.getDeliveryPartnerId(), newDeliveryPartner);
    }

    public EndUser getUser(String username, String checkPassword) {
        char[] actualPassword = EncryptDecrypt.decrypt(userCredentials.get(username));
        if (Arrays.equals(actualPassword, checkPassword.toCharArray())) {
                return EndUsers.get(username);
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

        if(callerClassName.equals("App.RestaurantAdmin")){

            switch (methodName) {
                case "addRestaurant" -> addRestaurant((Restaurant) parameter);
                case "addDeliveringArea" -> addDeliveringArea((String) parameter);
                case "addDeliveryPartner" -> addDeliveryPartner((DeliveryPartner) parameter);
                case "fetchRestaurant" -> {return fetchRestaurant((int) parameter);}

            }
        }
        return null;
    }

    public String getRestaurantName(int restaurantId){
        //return restaurantName
        return "";
    }
    public String getRestaurantArea(int restaurantId){
        //return restaurantName
        return "";
    }



   public String getFoodName(int foodId, int chosenRestaurantId){
        //loop and return food Name

        return "";
    }

}

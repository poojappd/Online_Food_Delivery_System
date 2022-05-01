package App;

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
    private final HashMap<String, Restaurant> allRestaurants = new HashMap<>();
    private final ArrayList<String> deliveringAreas = new ArrayList<>();
    private final ArrayList<DeliveryPartner> deliveryPartners = new ArrayList<>();

    void addUser(UserProfile newUser) {

    }

    void addRestaurant() {

    }

    void addDeliveringArea() {

    }

    void addDeliveryPartner() {

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

}

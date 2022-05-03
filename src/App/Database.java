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
    private final HashMap<Integer, DeliveryPartner> deliveryPartners = new HashMap();

    void addUser(UserProfile newUser) {
        EndUsers.put(newUser.getUserName(), newUser);
    }

    void addRestaurant(Restaurant newRestaurant) {
        allRestaurants.add(newRestaurant);

    }

    void addDeliveringArea() {
        // String

    }

    void addDeliveryPartner(@NotNull DeliveryPartner newDeliveryPartner) {
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

    ArrayList<Restaurant> fetchAllRestaurantData() {
        return new ArrayList<>(allRestaurants);
    }

}

package App;

import java.util.ArrayList;

public class DisplayData {
    private Database database = Database.instantiateOnce();

    void showRestaurants() {
        ArrayList<Restaurant> allRestaurants = database.fetchAllRestaurantData();
        int restaurantIndex = 1;
        for (Restaurant currentRestaurant : allRestaurants) {

            System.out.println(restaurantIndex + ". " +
                    currentRestaurant.getRestaurantName() + " \n" +
                    currentRestaurant.getRestaurantLocation());

        }
    }

}

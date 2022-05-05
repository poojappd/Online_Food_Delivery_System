package App;

import java.util.ArrayList;

public class DisplayData {
    private final Database database = Database.instantiateOnce();

    void showRestaurants() {
        ArrayList<Restaurant> allRestaurants = database.fetchAllRestaurantData();
        int restaurantIndex;
        for (Restaurant currentRestaurant : allRestaurants) {
            restaurantIndex = currentRestaurant.restaurantId;
            System.out.println(restaurantIndex + ". " +
                    currentRestaurant.getRestaurantName() + " \n" +
                    currentRestaurant.getRestaurantLocation());

        }
    }

    void showRestaurantMenu(int chosenRestaurantId){
        //print the restaurant menu


    }

    void showUserCart(Cart currentUserCart){
        //show user's Cart items;
    }


}

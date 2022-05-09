package App;

import java.util.HashMap;

public class DisplayData {
    private final Database database = Database.instantiateOnce();

    void showRestaurants() {
        HashMap<Integer, Restaurant> allRestaurants = database.fetchAllRestaurantData();
        int restaurantIndex;

        allRestaurants.forEach((key, currentRestaurant) -> {
            System.out.println(currentRestaurant.restaurantId + ". " +
                    currentRestaurant.getRestaurantName() + " \n" +
                    currentRestaurant.getRestaurantArea());

        });
    }

    void showRestaurantMenu(int chosenRestaurantId){
        //print the restaurant menu


    }

    void showUserCart(Cart currentUserCart){
        //show user's Cart items;
    }



}

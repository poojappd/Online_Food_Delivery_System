package App;

import java.util.HashMap;

public class DisplayData {
    private Database database = Database.instantiateOnce();

    void showRestaurants(){
        HashMap<String, Restaurant> allRestaurants = database.fetchRestaurant();
        for(String restaurantName:allRestaurants.keySet())
        {
            Restaurant currentRestaurant = allRestaurants.get(restaurantName);
            System.out.println(currentRestaurant.getRestaurantName() +" \n"+
                    currentRestaurant.getRestaurantLocation());

        }
    }

    void
}

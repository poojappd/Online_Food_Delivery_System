package App;


import java.util.HashMap;

public class PrintData {
    private static final Database database = Database.instantiateOnce();

    public static void showRestaurants() {
        HashMap<Integer, Restaurant> allRestaurants = database.fetchAllRestaurantData();
        int restaurantIndex;

        allRestaurants.forEach((key, currentRestaurant) -> {
            System.out.println(currentRestaurant.restaurantId + ". " +
                    currentRestaurant.getRestaurantName() + " \n" +
                    currentRestaurant.getRestaurantArea());

        });
    }

    public static void showRestaurantMenu(int chosenRestaurantId){
        //print the restaurant menu


    }

    public static void showUserCart(Cart currentUserCart){
        //show user's Cart items;
    }

    public static void showUserProfile(EndUser userAccount){
        //Print userAccount data
    }

    public static void showUserCoupons(EndUser userAccount){

    }


}

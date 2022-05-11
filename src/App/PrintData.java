package App;


import java.util.HashMap;

class PrintData {
    private static final Database database = Database.instantiateOnce();

    static void showRestaurants() {
        HashMap<Integer, Restaurant> allRestaurants = database.fetchAllRestaurantData();
        int restaurantIndex;

        allRestaurants.forEach((key, currentRestaurant) -> {
            System.out.println(currentRestaurant.restaurantId + ". " +
                    currentRestaurant.getRestaurantName() + " \n" +
                    currentRestaurant.getRestaurantArea());

        });
    }

    static void showRestaurantMenu(int chosenRestaurantId){
        //print the restaurant menu


    }

    static void showUserCart(Cart currentUserCart){
        //show user's Cart items;
    }

    static void showUserProfile(UserProfile user){
        //Print user data
    }

    static void showUserCoupons(UserProfile user){

    }


}

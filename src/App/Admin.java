package App;

public class Admin {
    Database database = Database.instantiateOnce();

    private void createRestaurant(String restaurantName, String restaurantArea) {
        Restaurant newRestaurant = new Restaurant(restaurantName, restaurantArea);
        database.onlyAllowAdmin("addRestaurant", newRestaurant);
    }

    private void addFoodToRestaurant() {
        // get restaurant from arraylist
        // and add new food items to menu
    }

    private void createDeliveryPartner(String name, int age) {

        DeliveryPartner newDeliveryPartner = new DeliveryPartner(name, age);
        database.onlyAllowAdmin("addDeliveryPartner", newDeliveryPartner);
    }

    private void assignDeliveryPartner() {
        // find nearest delivery partner and call them

    }

    static void giveRestaurantOrder() {

    }

}

package App;

public class Admin {
    Database database = Database.instantiateOnce();

    void createRestaurant(String restaurantName, String restaurantArea){
        Restaurant newRestaurant = new Restaurant(restaurantName, restaurantArea);
        database.addRestaurant(newRestaurant);
    }
    private void addFoodToRestaurant(){
        //get restaurant from arraylist
        // and add new food items to menu
    }

    void createDeliveryPartner(String name, int age){

        DeliveryPartner newDeliveryPartner = new DeliveryPartner(name, age);
    }

    void assignDeliveryPartner(){
        //find nearest delivery partner and call them

    }
    void giveRestaurantOrder(){

    }



}

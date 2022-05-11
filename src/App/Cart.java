package App;

import java.util.ArrayList;
import java.util.HashMap;

class Cart {
    private int restaurantId;
    private String restaurantName;
    private String restaurantArea;
    private HashMap<String, FoodItemList> cartItems = new HashMap<>();

    // set restaurant name of the corresponding food items
    void setRestaurantData(String restaurantName, String restaurantArea, int restaurantId) {
        this.restaurantArea = restaurantArea;
        this.restaurantName = restaurantName;
        this.restaurantId = restaurantId;

    }

    String[] getRestaurantData() {
        return new String[] { restaurantName, restaurantArea };
    }
    int getRestaurantId(){
        return restaurantId;
    }

    void addItems(String foodName, int foodPrice) {
        Integer quantity;
        if (cartItems.containsKey(foodName)) {
            cartItems.get(foodName).quantity++;

        } else {
            cartItems.put(foodName, new FoodItemList(foodName, foodPrice));
        }
    }

    // remove the food object
    void removeItems(String foodName) {
            cartItems.remove(foodName);
    }

    // replace quantity of existing foods
    void changeQuantity(String foodName, int quantity) {
        FoodItemList list = cartItems.get(foodName);
        if (list != null) {
            list.quantity = quantity;
        }
    }

    // remove all food objects
    void emptyCart() {
        cartItems.clear();
        restaurantName = null;
        restaurantArea = null;
    }

    String getRestaurantName(){
        return restaurantName;
    }

    HashMap<String, FoodItemList> getCartItems(){
        return new HashMap<>(cartItems);
    }
}
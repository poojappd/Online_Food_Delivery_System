package App;

import java.util.HashMap;

public class Cart {
    private String restaurantName;
    private String restaurantArea;
    private HashMap<String, Integer> cartItems;

    // set restaurant name of the corresponding food items
    void setRestaurantData(String restaurantName, String restaurantArea) {
        this.restaurantArea = restaurantArea;
        this.restaurantName = restaurantName;
    }

    String[] getRestaurantData() {
        return new String[] { restaurantName, restaurantArea };
    }

    void addItems(String foodName) {
        Integer quantity;
        if (cartItems.containsKey(foodName)) {
            quantity = cartItems.get(foodName);
            cartItems.put(foodName, quantity + 1);
        } else {
            cartItems.put(foodName, 1);
        }
    }

    // remove the food object
    void removeItems(String foodName) {
            cartItems.remove(foodName);
    }

    // replace quantity of existing foods
    void changeQuantity(String foodName, int quantity) {
        if (cartItems.containsKey(foodName)) {
            cartItems.put(foodName, quantity);
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

}
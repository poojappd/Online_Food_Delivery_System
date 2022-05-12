package App;

import App.FoodItemList;

import java.util.ArrayList;
import java.util.HashMap;

public class Cart {
    private int restaurantId;
    private String restaurantName;
    private String restaurantArea;
    private HashMap<String, FoodItemList> cartItems = new HashMap<>();

    // set restaurant name of the corresponding food items
    public void setRestaurantData(String restaurantName, String restaurantArea, int restaurantId) {
        this.restaurantArea = restaurantArea;
        this.restaurantName = restaurantName;
        this.restaurantId = restaurantId;

    }

    private String[] getRestaurantData() {
        return new String[] { restaurantName, restaurantArea };
    }
    public int getRestaurantId(){
        return restaurantId;
    }

    public void addItems(String foodName, int foodPrice) {
        int quantity;
        if (cartItems.containsKey(foodName)) {
            quantity = cartItems.get(foodName).getQuantity();
            cartItems.get(foodName).setQuantity(quantity++);

        } else {
            cartItems.put(foodName, new FoodItemList(foodName, foodPrice));
        }
    }

    // remove the food object
    public void removeItems(String foodName) {
            cartItems.remove(foodName);
    }

    // replace quantity of existing foods
    public void changeQuantity(String foodName, int quantity) {
        FoodItemList list = cartItems.get(foodName);
        if (list != null) {
            list.setQuantity(quantity);
        }
    }

    // remove all food objects
    public void emptyCart() {
        cartItems.clear();
        restaurantName = null;
        restaurantArea = null;
    }

    public String getRestaurantName(){
        return restaurantName;
    }

    public String getRestaurantArea(){
        return restaurantArea;
    }

    //TODO here cart is passed by reference and this
    // method is public
    // check
    HashMap<String, FoodItemList> getCartItems(){
        return new HashMap<>(cartItems);
    }
}
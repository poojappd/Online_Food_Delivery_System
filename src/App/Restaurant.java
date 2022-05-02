package App;

import java.util.ArrayList;
import java.util.HashMap;

public class Restaurant {
    private final String restaurantName;
    private final String restaurantArea;
    private HashMap<String, Food> menu = new HashMap<>();
    private ArrayList<Bill> OrderHistory;

    Restaurant(String restaurantName, String restaurantArea) {
        this.restaurantName = restaurantName;
        this.restaurantArea = restaurantArea;
    }

    class Food {
        final String foodName;
        final String foodType;
        final int foodPrice;
        final int preparingTime;

        Food(String foodName, String foodType, int foodPrice, int preparingTime) {
            this.foodName = foodName;
            this.foodType = foodType;
            this.foodPrice = foodPrice;
            this.preparingTime = preparingTime;
        }
    }
    //admin
    void addFoods(String foodName, String foodType, int foodPrice, int preparingTime) {
        menu.put(foodName, new Food(foodName, foodType, foodPrice, preparingTime));
    }

    // Displays Food objects as Menu
    void showMenu() {

    }

    String getRestaurantName() {
        return restaurantName;
    }

    String getRestaurantLocation() {
        return restaurantArea;
    }

    int getFoodId() {
        return 0;
    }

    void prepareOrder(UserProfile user, ArrayList<Food> foodItems, ArrayList<Integer> quantity) {

    }

}

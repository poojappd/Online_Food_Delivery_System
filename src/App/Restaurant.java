package App;

import java.util.ArrayList;
import java.util.HashMap;

public class Restaurant {
    final int restaurantId = IdGenerator.generateRestaurantId();
    private final String restaurantName;
    private final String restaurantArea;
    private final HashMap<String, Food> menu = new HashMap<>();
    private ArrayList<Bill> OrderHistory = new ArrayList<>();

    Restaurant(String restaurantName, String restaurantArea) {
        this.restaurantName = restaurantName;
        this.restaurantArea = restaurantArea;
    }

    class Food {
        final int foodId = IdGenerator.generateFoodId();
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

    // admin
    private void addFoods(String foodName, String foodType, int foodPrice, int preparingTime) {
        menu.put(foodName, new Food(foodName, foodType, foodPrice, preparingTime));
    }

    // Displays Food objects as Menu
    HashMap<String, Food> getMenu() {
        return new HashMap(menu);
    }

    String getRestaurantName() {
        return restaurantName;
    }

    String getRestaurantLocation() {
        return restaurantArea;
    }

    private Food getFood(String foodName) {
        if (menu.containsKey(foodName)) {
            Food orderedFood = menu.get(foodName);
            return new Food(orderedFood.foodName, orderedFood.foodType,
                    orderedFood.foodPrice, orderedFood.preparingTime);
        }
        return null;
    }


    void waitForPickup(ArrayList<Food> foodItems) {
    }


    void prepareOrder(String userName, String userAddress, ArrayList<FoodItemList> foodItemsList) {
        ArrayList<Food> foodItems = new ArrayList<>();
        Food food;
        boolean checkFood = true;
        for (FoodItemList foodItemList : foodItemsList) {
            food = getFood(foodItemList.foodName);
            if (food != null) {
                foodItems.add(food);
            } else {
                checkFood = false;
            }
        }

        if (checkFood) {
            OrderHistory.add(new Bill(restaurantName,
                    restaurantArea, userName, userAddress, foodItemsList));
            waitForPickup(foodItems);

        }
    }

}

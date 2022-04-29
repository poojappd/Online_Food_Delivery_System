package App;

import java.util.ArrayList;
import java.util.HashMap;

public class Restaurant {
    private final String restaurantName;
    private final String restaurantArea;
    private HashMap<Food> menu = new ArrayList<>();
    private ArrayList<Bill> OrderHistory;

     Restaurant(String restaurantName, String restaurantArea){
        this.restaurantName = restaurantName;
        this.restaurantArea = restaurantArea;
    }

      class Food{
        final String foodName;
        final String foodType;
        final int foodPrice;
        final int preparingTime;

         Food(String foodName, String foodType, int foodPrice, int preparingTime){
            this.foodName = foodName;
            this.foodType = foodType;
            this.foodPrice = foodPrice;
            this.preparingTime = preparingTime;
        }
    }

    void addFoods(String foodName, String foodType, int foodPrice, int preparingTime){
        menu.add(new Food(foodName, foodType, foodPrice, preparingTime));
    }

    //Displays Food objects as Menu
    void showMenu(){

    }

    String getRestaurantName(){
        return restaurantName;
    }
    String getRestaurantLocation(){
        return restaurantArea;
    }

    int getFoodId(){

    }

    void prepareOrder(UserProfile user, ArrayList<>){}





}

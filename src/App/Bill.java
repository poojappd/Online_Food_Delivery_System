package App;

import java.util.ArrayList;



public class Bill {
    int billId;
    String restaurantName;
    String restaurantArea;
    String userName;
    String userAddress;
    float totalPrice;
    ArrayList<FoodItemList> foodItemsList;
    enum OrderStatus {
        CONFIRMED,
        CANCELLED,
    }

    OrderStatus orderStatus;

    Bill() {
    }

    Bill(String restaurantName, String restaurantArea, String userName, String userAddress,
            ArrayList<FoodItemList> foodItemsList) {
        this.restaurantName = restaurantName;
        this.restaurantArea = restaurantArea;
        this.userName = userName;
        this.userAddress = userAddress;
        this.orderStatus = OrderStatus.CONFIRMED;
        this.foodItemsList = foodItemsList;
        this.totalPrice = setTotalPrice(foodItemsList);

    }

    float setTotalPrice(ArrayList<FoodItemList> foodItemsList) {
        totalPrice = 0;

        // iterate over the itemsList and increment totalPrice
        return totalPrice;
    }

}

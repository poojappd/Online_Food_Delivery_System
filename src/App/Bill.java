package App;

import java.util.ArrayList;



public class Bill {
    final int billId;
    final String restaurantName;
    final String restaurantArea;
    final String userName;
    final String userAddress;
    float totalPrice;
    ArrayList<FoodItemList> foodItemsList;
    enum OrderStatus {
        CONFIRMED,
        CANCELLED,
    }

    OrderStatus orderStatus;

    Bill(String restaurantName, String restaurantArea, String userName, String userAddress,
            ArrayList<FoodItemList> foodItemsList) {
        this.billId = IdGenerator.generateBillId();
        this.restaurantName = restaurantName;
        this.restaurantArea = restaurantArea;
        this.userName = userName;
        this.userAddress = userAddress;
        this.orderStatus = OrderStatus.CONFIRMED;
        this.foodItemsList = foodItemsList;
        setTotalPrice(foodItemsList);

    }

    void setTotalPrice(ArrayList<FoodItemList> foodItemsList) {
        totalPrice = 0;

        // iterate over the itemsList and increment totalPrice

    }

}

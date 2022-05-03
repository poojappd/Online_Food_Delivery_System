package App;

import java.util.ArrayList;

enum OrderStatus {
    CONFIRMED,
    CANCELLED,
}

public class Bill {
    int billId;
    String restaurantName;
    String restaurantArea;
    String userName;
    String userAddress;
    int totalPrice;
    ArrayList<ItemList> foodItemsList;
    OrderStatus orderStatus;

    Bill() {
    }

    Bill(String restaurantName, String restaurantArea, String userName, String userAddress,
            ArrayList<ItemList> foodItemsList) {
        this.restaurantName = restaurantName;
        this.restaurantArea = restaurantArea;
        this.userName = userName;
        this.userAddress = userAddress;
        this.orderStatus = OrderStatus.CONFIRMED;
        this.foodItemsList = foodItemsList;
        this.totalPrice = findTotalPrice(foodItemsList);

    }

    int findTotalPrice(ArrayList<ItemList> foodItemsList) {
        int totalPrice = 0;

        // iterate over the itemsList and increment totalPrice
        return totalPrice;
    }

}

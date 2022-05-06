package App;

import java.util.ArrayList;

public class UserBill extends Bill {
    int deliveryCharges;
    int offerReductionAmount;

    UserBill(String restaurantName, String restaurantArea, String userName, String userAddress,
             ArrayList<FoodItemList> foodItemsList, int deliveryCharges) {
        super(restaurantName, restaurantArea, userName, userAddress, foodItemsList);
        this.deliveryCharges = deliveryCharges;

    }

    @Override
    float setTotalPrice(ArrayList<FoodItemList> foodItemsList) {
        this.totalPrice -= offerReductionAmount + deliveryCharges;
        return totalPrice;
    }

    static float calculateTotalPrice(ArrayList<FoodItemList> foodItemsList){
        int totalAmount;
        totalAmount = 0;
        return totalAmount;
    }

}

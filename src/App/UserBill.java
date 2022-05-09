package App;

import java.util.ArrayList;

public class UserBill extends Bill {
    private int deliveryCharges;
    private int offerReductionAmount;

    UserBill(String restaurantName, String restaurantArea, String userName, String userAddress,
             ArrayList<FoodItemList> foodItemsList, int deliveryCharges) {
        super(restaurantName, restaurantArea, userName, userAddress, foodItemsList);
        this.deliveryCharges = deliveryCharges;
        setTotalPrice(foodItemsList);

    }

    @Override
    void setTotalPrice(ArrayList<FoodItemList> foodItemsList) {
        totalPrice = this.totalPrice - offerReductionAmount + deliveryCharges;

    }

    static float calculateTotalPrice(ArrayList<FoodItemList> foodItemsList){
        int totalAmount;
        totalAmount = 0;
        return totalAmount;
    }

}

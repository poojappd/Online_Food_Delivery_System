package App;

import java.util.ArrayList;

public class UserBill extends Bill {
    private float deliveryCharges;
    private int offerReductionAmount;

    public UserBill(String restaurantName, String restaurantArea, String userName, String userArea,
             ArrayList<FoodItemList> foodItemsList, float deliveryCharges) {
        super(restaurantName, restaurantArea, userName, userArea, foodItemsList);
        this.deliveryCharges = deliveryCharges;
        setTotalPrice(foodItemsList);

    }

    @Override
    public void setTotalPrice(ArrayList<FoodItemList> foodItemsList) {
        totalPrice = this.totalPrice - offerReductionAmount + deliveryCharges;

    }

    int calculateDeliveryCharge(){
        return 0;
    }

    static float calculateTotalPrice(ArrayList<FoodItemList> foodItemsList){
        int totalAmount;
        totalAmount = 0;
        return totalAmount;
    }

}

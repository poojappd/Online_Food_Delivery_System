package App;

import java.util.ArrayList;

class UserBill extends Bill {
    private float deliveryCharges;
    private int offerReductionAmount;

    UserBill(String restaurantName, String restaurantArea, String userName, String userArea,
             ArrayList<FoodItemList> foodItemsList, float deliveryCharges) {
        super(restaurantName, restaurantArea, userName, userArea, foodItemsList);
        this.deliveryCharges = deliveryCharges;
        setTotalPrice(foodItemsList);

    }

    @Override
    void setTotalPrice(ArrayList<FoodItemList> foodItemsList) {
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

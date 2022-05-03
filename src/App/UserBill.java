package App;

import java.util.ArrayList;

public class UserBill extends Bill {
    int deliveryCharges;
    int offerReductionAmount;

    UserBill(String restaurantName, String restaurantArea, String userName, String userAddress,
            ArrayList<ItemList> foodItemsList, int deliveryCharges) {
        super(restaurantName, restaurantArea, userName, userAddress, foodItemsList);
        this.deliveryCharges = deliveryCharges;
        this.totalPrice -= offerReductionAmount + deliveryCharges;
    }

}

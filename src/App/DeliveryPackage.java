package App;

import java.util.ArrayList;

public class DeliveryPackage {
    String userName;
    String userLocation;
    int deliveryId;
    ArrayList<Restaurant.Food> foodItems;

    DeliveryPackage(String userName, String userLocation, ArrayList<Restaurant.Food> foodItems) {
        this.userName = userName;
        this.userLocation = userLocation;
        this.foodItems = foodItems;
        this.deliveryId = IdGenerator.generateDeliveryPackageId();
    }

}

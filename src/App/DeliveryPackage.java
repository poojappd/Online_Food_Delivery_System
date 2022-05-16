package App;

import java.util.ArrayList;

class DeliveryPackage {
    String userName;
    String userArea;
    int deliveryId;
    ArrayList<Restaurant.Food> foodItems;

    DeliveryPackage(String userName, String userLocation, ArrayList<Restaurant.Food> foodItems) {
        this.userName = userName;
        this.userLocation = userLocation;
        this.foodItems = foodItems;
        this.deliveryId = IdGenerator.generateDeliveryPackageId();
    }

}

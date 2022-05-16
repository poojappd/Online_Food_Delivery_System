package App;

import java.util.ArrayList;

class DeliveryPackage {
    String userName;
    String userArea;
    int deliveryId;
    ArrayList<Restaurant.Food> foodItems;

    DeliveryPackage(String userName, String userArea, ArrayList<Restaurant.Food> foodItems) {
        this.userName = userName;
        this.userArea = userArea;
        this.foodItems = foodItems;
        this.deliveryId = IdGenerator.generateDeliveryPackageId();
    }

}

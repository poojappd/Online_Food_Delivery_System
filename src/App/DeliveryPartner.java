package App;

import java.util.ArrayList;

public class DeliveryPartner {
    String deliveryPartnerName;
    int deliveryPartnerAge;
    String currentArea;
    ArrayList<DeliveringAreas>;

    DeliveryPartner(String deliveryPartnerName, int deliveryPartnerAge){
        this.deliveryPartnerName = deliveryPartnerName;
        this.deliveryPartnerAge = deliveryPartnerAge;
    }

    void updateCurrentLocation(String updatedArea){
        this.currentArea = updatedArea;
    }

    void pickupOrder(String restaurantName, String restaurantLocation){

    }
}

package App;

import java.util.ArrayList;

public class DeliveryPartner {
    String deliveryPartnerName;
    int deliveryPartnerAge;
    String currentArea;
    ArrayList<DeliveryPackage> deliveryPackages;
    ArrayList<DeliveringAreas>;

    DeliveryPartner(String deliveryPartnerName, int deliveryPartnerAge){
        this.deliveryPartnerName = deliveryPartnerName;
        this.deliveryPartnerAge = deliveryPartnerAge;
    }

    void updateCurrentArea(String updatedArea){
        this.currentArea = updatedArea;
    }

    void pickupOrder(String restaurantName, String restaurantArea){

    }
    void deliverOrder(){
        //remove package from deliveryPackages
    }

}

package App;

import java.util.ArrayList;

class DeliveryPartner {
    private int deliveryPartnerId;
    private String deliveryPartnerName;
    private int deliveryPartnerAge;
    private String currentArea;
    private ArrayList<DeliveryPackage> deliveryPackages;
    private ArrayList<String> deliveringAreas = new ArrayList<>();

    DeliveryPartner(String deliveryPartnerName, int deliveryPartnerAge){
        this.deliveryPartnerName = deliveryPartnerName;
        this.deliveryPartnerAge = deliveryPartnerAge;
        this.deliveryPartnerId = IdGenerator.generateDeliveryPartnerId();
    }

    int getDeliveryPartnerId(){
        return deliveryPartnerId;
    }

    void updateCurrentArea(String updatedArea){
        this.currentArea = updatedArea;
    }

    void pickupOrder(Restaurant currentRestaurant, String userName,
                     String userArea){
        currentRestaurant.deliveryPartnerPickup(userName);
    }

    void deliverOrder(){
        //remove package from deliveryPackages
    }
    void addDeliveringAreas(String area){
        deliveringAreas.add(area);
    }

}

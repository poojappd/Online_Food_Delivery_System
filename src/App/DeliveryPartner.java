package App;

import java.util.ArrayList;

class DeliveryPartner {
    private int deliveryPartnerId;
    private String deliveryPartnerName;
    private int deliveryPartnerAge;
    private String currentArea;
    private String primaryArea;
    private ArrayList<DeliveryPackage> deliveryPackages;
    private ArrayList<String> deliveringAreas = new ArrayList<>();

    DeliveryPartner(String deliveryPartnerName, int deliveryPartnerAge, String primaryArea ){
        this.deliveryPartnerName = deliveryPartnerName;
        this.deliveryPartnerAge = deliveryPartnerAge;
        this.primaryArea = primaryArea;
        this.currentArea = primaryArea;
        this.deliveryPartnerId = IdGenerator.generateDeliveryPartnerId();
    }

    void addDeliveringAreas(String area){
        deliveringAreas.add(area);
    }

    int getDeliveryPartnerId(){
        return deliveryPartnerId;
    }

    String getCurrentArea(){
        return currentArea;
    }

    void updateCurrentArea(String updatedArea){
        this.currentArea = updatedArea;
    }

    private void addToDeliveryPackage(DeliveryPackage deliveryPackage){
        deliveryPackages.add(deliveryPackage);
    }

    void pickupOrder(Restaurant currentRestaurant, String userName,
                     String userArea){
        ArrayList<Restaurant.Food> foodItems = currentRestaurant.deliveryPartnerPickup(userName);
        DeliveryPackage newDeliveryPackage = new DeliveryPackage(userName, userArea, foodItems);
        addToDeliveryPackage(newDeliveryPackage);
    }

    void deliverOrder(){
        //remove package from deliveryPackages
    }
    

}

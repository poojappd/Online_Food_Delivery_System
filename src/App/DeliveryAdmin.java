package App;

import java.util.ArrayList;
import java.util.HashMap;

class DeliveryAdmin extends Admin{

    private static final ArrayList<String> deliveringAreas = new ArrayList<>();
    private static final HashMap<Integer, DeliveryPartner> deliveryPartners = new HashMap<>();
    private static final HashMap<String, ArrayList<Integer>> activeDeliveryPartners = new HashMap<>();
    private static DeliveryAdmin SingletonDeliveryAdmin = null;


    static DeliveryAdmin instantiateOnce() {
        if(SingletonDeliveryAdmin == null){
            SingletonDeliveryAdmin = new DeliveryAdmin();
        }
        return SingletonDeliveryAdmin;
    }

    private DeliveryAdmin(){
    }

    private void initializer(){

        DeliveryPartner dp1 = createDeliveryPartner("Ramesh", 31);
        dp1.addDeliveringAreas("Pallavaram");
        dp1.addDeliveringAreas("Pammal");
        dp1.addDeliveringAreas("Chromepet");

        dp1.addDeliveringAreas("Tambaram");
        dp1.addDeliveringAreas("Medavakkam");
        dp1.addDeliveringAreas("Chromepet");
    }


    void addDeliveringAreas(String deliveringArea){
        deliveringAreas.add(deliveringArea);
    }

    DeliveryPartner createDeliveryPartner(String name, int age) {

        DeliveryPartner newDeliveryPartner = new DeliveryPartner(name, age);
        database.onlyAllowAdmin("addDeliveryPartner", newDeliveryPartner);
        return newDeliveryPartner;
    }

     static void assignDeliveryPartner(String userName, String userArea,
                                              Restaurant restaurant) {
        // find the nearest delivery partner and call them
        ArrayList<Integer> activeDeliveryPartnerIds = activeDeliveryPartners.get(userArea);

        if(!activeDeliveryPartnerIds.isEmpty()){
            //assigning random dp nearby restaurant's location
            int deliveryPartnerId = (int)((Math.random() * 10) % activeDeliveryPartnerIds.size());
            DeliveryPartner chosenDeliveryPartner = deliveryPartners.get(deliveryPartnerId);
            chosenDeliveryPartner.pickupOrder(restaurant, userName, userArea);
        }

    }


}

package App;

import java.util.HashMap;

class IdGenerator {
    static int bill_Id = 1;
    static HashMap<String, Integer> restaurantOrderIds;

    static int generateBillId() {
        return 0;
    }

    static int generateRestaurantId(){
        return 3;
    }
    static int generateFoodId(){
        return 8;
    }

    static int generateRestaurantOrderId(String restaurantName){
        //temporary int orderId
        int orderId;
        if (restaurantOrderIds.containsKey(restaurantName)){
            orderId = restaurantOrderIds.get(restaurantName);
            restaurantOrderIds.put(restaurantName, orderId++);
            
        }
        else{
            orderId = 1;
            restaurantOrderIds.put(restaurantName, orderId);
        }

        return orderId;
    }

    static int generateDeliveryPartnerId(){
        return 2;
    }

    static int generateDeliveryPackageId(){
        return 1;
    }
}

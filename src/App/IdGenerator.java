package App;

import java.util.HashMap;

public class IdGenerator {
    static int bill_Id = 1;
    static HashMap<String, Integer> restaurantOrderIds;

    public static int generateBillId() {
        return 0;
    }

    public static int generateRestaurantId(){
        return 3;
    }
    public static int generateFoodId(){
        return 8;
    }

    public static int generateRestaurantOrderId(String restaurantName){
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

    public static int generateDeliveryPartnerId(){
        return 2;
    }

    public static int generateDeliveryPackageId(){
        return 1;
    }
}

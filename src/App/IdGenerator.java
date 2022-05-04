package App;

import java.util.HashMap;

public class IdGenerator {
    static int bill_Id = 1;
    static HashMap<String, Integer> restaurantOrderIds;

    int generateBillId() {

    }

    int generateRestaurantOrderId(String restaurantName){
        //temporary int orderId
        int orderId;
        if (restaurantOrderIds.containsKey(restaurantName)){
            orderId = restaurantOrderIds.get(restaurantName);
            restaurantOrderIds.put(restaurntName, orderId++);
            
        }
        else{
            orderId = 1;
            restaurantOrderIds.put(restaurantName, orderId);
        }
    return orderId;
    }

    int generate(){}
}

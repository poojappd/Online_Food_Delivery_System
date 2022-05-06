package App;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

class DiscountCoupon {
    private enum status{
        ACTIVE,
        EXPIRED
    }
    private status couponStatus;
    private int minimumOrderPrice;
    private float discountPercent;
    private Calendar offerValidity;

    boolean checkCouponApplicable(){
        //if current dateTime is within the validity;
        //and if it exceeds minimumOrderPrice

        return true;
    }
    int applyCoupon(int totalAmount){
        int netPrice;
        //apply discount and return new price

        return netPrice;
    }
}

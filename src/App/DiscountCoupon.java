package App;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

class DiscountCoupon {

    enum CouponStatus{
        ACTIVE,
        EXPIRED
    }
    private CouponStatus couponStatus;
    private int minimumOrderPrice;
    private float discountPercent;
    private Calendar offerValidity;

    DiscountCoupon(){
        this.couponStatus = CouponStatus.ACTIVE;


    }
    boolean checkCouponApplicable(){
        //if current dateTime is within the validity;
        //and if it exceeds minimumOrderPrice

        return true;
    }
    int applyCoupon(int totalAmount){
        int netPrice=0;
        //apply discount and return new price

        return netPrice;
    }
    CouponStatus getCouponStatus(){
        return couponStatus;
    }

}

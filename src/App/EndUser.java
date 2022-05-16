package App;

import java.util.ArrayList;

public class EndUser extends User {
    private String userArea;
    private int pinCode;
    private Cart myCart;
    private ArrayList<DiscountCoupon> myCoupons;

    public EndUser(String userName, char[] userPassword, String userArea, int pinCode) {
        super(userName, userPassword);
        this.userArea = userArea;
        this.pinCode = pinCode;
        myCart = new Cart();

    }

    public String getUserArea() {
        return userArea;
    }

    public void changeUserArea(String newArea, int pinCode, char[] userPassword) {
            this.userArea = newArea;
            this.pinCode = pinCode;
    }

    public Cart getUserCart() {
            return myCart;
    }

    public ArrayList<DiscountCoupon> getUserDiscountCoupons(){
            return myCoupons;
    }

}

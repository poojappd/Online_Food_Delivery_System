package App;

import java.util.ArrayList;

public class User {
    private String userName;
    private String userArea;
    private char[] userPassword;
    private int pinCode;
    private Cart myCart;
    private ArrayList<DiscountCoupon> myCoupons;

    public User(String userName, char[] userPassword, String userArea, int pinCode) {
        this.userName = userName;
        this.userArea = userArea;
        this.pinCode = pinCode;
        this.userPassword = userPassword;
        myCart = new Cart();
    }

    public String getUserName() {
        return userName;
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

    public DiscountCoupon getUserDiscountCoupons(){
            return myCoupons;
    }

}

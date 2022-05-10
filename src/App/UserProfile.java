package App;

import java.util.Arrays;

public class UserProfile {
    private String userName;
    private String userArea;
    private char[] userPassword;
    private int[] pinCode;
    private Cart myCart;
    private DiscountCoupon myCoupons;

    UserProfile(String userName, char[] userPassword, String userArea, int[] pinCode) {
        this.userName = userName;
        this.userArea = userArea;
        this.pinCode = pinCode;
        this.userPassword = userPassword;
        myCart = new Cart();
    }

    String getUserName() {
        return userName;
    }

    String getUserArea() {
        return userArea;
    }

    void changeUserArea(String newArea, int[] pinCode, char[] userPassword) {
        if (validatePassword(userPassword)) {
            this.userArea = newArea;
            this.pinCode = pinCode;
        }
    }

    boolean validatePassword(char[] userPassword) {
        return (Arrays.equals(this.userPassword, userPassword));
    }

    Cart getCart(char[] userPassword) {
        if (validatePassword(userPassword)) {
            return myCart;
        }
        return null;
    }

    DiscountCoupon getDiscountCoupons(char[] userPassword){
        if (validatePassword(userPassword)) {
            return myCoupons;
        }
        return null;
    }

}

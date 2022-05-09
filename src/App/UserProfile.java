package App;

import java.util.Arrays;

public class UserProfile {
    private final String userName;
    private String userAddress;
    private char[] userPassword;
    private int[] pinCode;
    private Cart myCart;
    private DiscountCoupon myCoupons;

    UserProfile(String userName, char[] userPassword, String userAddress, int[] pinCode) {
        this.userName = userName;
        this.userAddress = userAddress;
        this.pinCode = pinCode;
        this.userPassword = userPassword;
        myCart = new Cart();
    }

    String getUserName() {
        return userName;
    }

    String getUserAddress() {
        return userAddress;
    }

    void changeUserAddress(String newAddress, int[] pinCode, char[] userPassword) {
        if (validatePassword(userPassword)) {
            this.userAddress = newAddress;
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

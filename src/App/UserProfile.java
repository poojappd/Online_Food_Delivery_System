package App;

import java.util.Arrays;

public class UserProfile {
    private final String userName;
    private String userAddress;
    private char[] userPassword;
    private int[] pinCode;
    private Cart myCart;

    UserProfile(String userName, char[] userPassword, String userAddress, int[] pinCode) {
        this.userName = userName;
        this.userAddress = userAddress;
        this.pinCode = pinCode;
        this.userPassword = userPassword;
    }

    String getUserName() {
        return userName;
    }

    String getUserAddress() {
        return userAddress;
    }

    private void changeUserAddress(String newAddress, int[] pinCode) {
        this.userAddress = newAddress;
        this.pinCode = pinCode;
    }

    boolean validatePassword(char[] userPassword) {
        return (Arrays.equals(this.userPassword, userPassword));
    }

    // private
    void setCart(Cart myCart) {
        this.myCart = myCart;
    }

    Cart getCart() {
        return myCart;
    }

}

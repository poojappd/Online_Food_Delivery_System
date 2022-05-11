package Main;

import App.*;

import java.util.ArrayList;
import java.util.Scanner;

public class UserApp {
    private UserProfile currentAppUser;
    private Database database = Database.instantiateOnce();
    private Cart currentUserCart;
    private DiscountCoupon currentUserCoupons;
    private char[] currentUserPassword;
    private int chosenRestaurantId;
    private boolean couponApplied;




    private void goToLoginPage() {
        String loginType = "login"; //login or signup
        String userName = "";
        char[] userPassword = {};


        // existing user
        if (loginType.equals("login")) {
            // get userName, password and fetch from db
            currentAppUser = database.getUserProfile(userName, userPassword);

        }

        // new user
        else {
            //create new username, password and
            int pinCode = 0;
            String userArea = "";

            // handlers for illegal inputs

            currentAppUser = new UserProfile(userName, userPassword, userArea, pinCode);
            database.addUser(currentAppUser);
        }
        currentUserPassword = userPassword;
    }

    private void goToHomepage() {
        PrintData.showRestaurants();

        // waiting for user to pick a restaurant
        // if user pick a restaurant and if cart is empty
        // else user will be prompted whether to remove the cart items
        chosenRestaurantId = 0;
        PrintData.showRestaurantMenu(chosenRestaurantId);

        //if user clicks on any food - add it to cart
        //this loops until user stops adding to cart

        currentUserCart.addItems("", 0 );

        //setting the restaurant name of the food items chosen
        currentUserCart.setRestaurantData(database.getRestaurantName(chosenRestaurantId),
                database.getRestaurantArea(chosenRestaurantId),
                currentUserCart.getRestaurantId());

    }

    private void goToCart() {
        //if cart not empty
        PrintData.showUserCart(currentUserCart);

        //if user wants to modify cart:
        currentUserCart.changeQuantity("",1);
        currentUserCart.removeItems("");
        currentUserCart.emptyCart();

        //if user wants to place order
        //only if cart not null
        goToBookingPage();
    }
    private void goToBookingPage(){
        float deliveryCharges = 0;
        String restaurantName = currentUserCart.getRestaurantData()[0],
                restaurantArea = currentUserCart.getRestaurantData()[1];

        Admin.handleUserOrders(currentAppUser.getUserName(),
                currentAppUser.getUserArea(), currentUserCart.getRestaurantId(),
                currentUserCart.getCartItems()
                );
        UserBill newBill = new UserBill(restaurantName, restaurantArea, currentAppUser.getUserName(),
                currentAppUser.getUserArea(), new ArrayList<>(currentUserCart.getCartItems().values()),
                deliveryCharges );


    }

    private void goToProfile() {
        PrintData.showUserProfile(currentAppUser);
    }

    public void launchApp() {
        goToLoginPage(); //get userProfile object
        if (currentAppUser != null) {

            // load their pre-saved cart
            currentUserCart = currentAppUser.getCart(currentUserPassword);
            currentUserCoupons = currentAppUser.getDiscountCoupons(currentUserPassword);
            // else create a new Cart

            goToHomepage();

            // user chooses the below options
            int navigateTo = 2;
            switch (navigateTo){
                case 1 -> goToCart();
                case 2 -> goToProfile();
                case 3 -> goToHomepage();
                default -> System.out.println("Invalid option");
            }
            }

            goToProfile();

    }

}

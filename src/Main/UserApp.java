package Main;

import App.*;

import java.util.ArrayList;

public class UserApp {
    private EndUser currentAppUserAccount;
    private Database database = Database.instantiateOnce();
    private Cart currentUserCart;
    private ArrayList<DiscountCoupon> currentUserCoupons;
    private int chosenRestaurantId;
    private boolean couponApplied;



    private void goToLoginPage() {
        String loginType = "login"; //login or signup
        String userName = "";
        String userPassword = ""; //get username n password from user;

        // existing user
        if (loginType.equals("login")) {
            // get userName, password and fetch from db
            currentAppUserAccount = database.getUserProfile(userName, userPassword);
        }

        // new user
        else {
            //create new username, password and
            int pinCode = 0;
            String userArea = "";
            char[] encryptedPassword = EncryptDecrypt.encrypt(userPassword);
            // handlers for illegal inputs

            currentAppUserAccount = new EndUser(userName, encryptedPassword, userArea, pinCode);
            database.addUser(currentAppUserAccount, encryptedPassword);
        }
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
        String restaurantName = currentUserCart.getRestaurantName(),
                restaurantArea = currentUserCart.getRestaurantArea();

        RestaurantAdmin.handleUserOrders(currentAppUserAccount.getUserName(),
                currentAppUserAccount.getUserArea(), currentUserCart.getRestaurantId(),
                currentUserCart.getCartItems()
                );
        UserBill newBill = new UserBill(restaurantName, restaurantArea, currentAppUserAccount.getUserName(),
                currentAppUserAccount.getUserArea(), new ArrayList<>(currentUserCart.getCartItems().values()),
                deliveryCharges );


    }

    private void goToProfile() {
        PrintData.showUserProfile(currentAppUserAccount);
    }
    private void goToOrders(){

    }

    public void launchApp() {
        goToLoginPage(); //get user object
        if (currentAppUserAccount != null) {

            // load their pre-saved cart
            currentUserCart = currentAppUserAccount.getUserCart();
            currentUserCoupons = currentAppUserAccount.getUserDiscountCoupons();
            // else create a new Cart

            goToHomepage();

            // user chooses the below options
            int navigateTo = 2;
            switch (navigateTo){
                case 1 -> goToCart();
                case 2 -> goToProfile();
                case 3 -> goToHomepage();
                case 4 -> goToOrders();
                default -> System.out.println("Invalid option");
            }
            }

            goToProfile();

    }

}

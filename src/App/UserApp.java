package App;

public class UserApp {
    private UserProfile currentAppUser;
    private Database database = Database.instantiateOnce();
    private Cart currentUserCart;
    private DiscountCoupon currentUserCoupons;
    private char[] currentUserPassword;
    private DisplayData display = new DisplayData();
    private int chosenRestaurantId;
    boolean couponApplied;



    private void goToLoginPage(String loginType) {
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
            int[] pinCode = new int[6];
            String userAddress = "";

            // handlers for illegal inputs

            currentAppUser = new UserProfile(userName, userPassword, userAddress, pinCode);
            database.addUser(currentAppUser);
        }
        currentUserPassword = userPassword;
    }

    private void goToHomepage() {
        display.showRestaurants();

        // waiting for user to pick a restaurant
        // if user pick a restaurant and if cart is empty
        // else user will be prompted whether to remove the cart items
        chosenRestaurantId = 0;
        display.showRestaurantMenu(chosenRestaurantId);

        //if user clicks on any food - add it to cart
        //this loops until user stops adding to cart
        currentUserCart.addItems("");

        //setting the restaurant name of the food items chosen
        currentUserCart.setRestaurantData(database.getRestaurantName(chosenRestaurantId),
                database.getRestaurantArea(chosenRestaurantId));

    }

    private void goToCart() {
        //if cart not null
        display.showUserCart(currentUserCart);

        //if user wants to modify cart:
        currentUserCart.changeQuantity("",1);
        currentUserCart.removeItems("");
        currentUserCart.emptyCart();

        //if user wants to place order
        //only if cart not null
        goToBookingPage();
    }
    private void goToBookingPage(){



    }

    private void goToProfile() {

    }

    void callerMethod() {
        goToLoginPage("login");
        if (currentAppUser != null) {
            // load their pre-saved cart
            currentUserCart = currentAppUser.getCart(currentUserPassword);
            currentUserCoupons = currentAppUser.getDiscountCoupons(currentUserPassword);
            // else create a new Cart

            goToHomepage();
        }

        // user chooses the below options
        goToCart();
        goToProfile();

    }

}

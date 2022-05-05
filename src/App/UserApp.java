package App;

public class UserApp {
    private UserProfile currentAppUser;
    private Database database = Database.instantiateOnce();
    private Cart currentUserCart;
    private DisplayData display = new DisplayData();
    int chosenRestaurantId;

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
            int[] pinCode = new int[6];
            String userAddress = "";

            // handlers for illegal inputs
            currentAppUser = new UserProfile(userName, userPassword, userAddress, pinCode);
            database.addUser(currentAppUser);
        }

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
    }

    private void goToProfile() {

    }

    void callerMethod() {
        goToLoginPage("login");
        if (currentAppUser != null) {
            // load their pre-saved cart
            currentUserCart = currentAppUser.getCart();
            // else create a new Cart

            goToHomepage();
        }

        // user chooses the below options
        goToCart();
        goToProfile();

    }

}

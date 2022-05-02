package App;

public class UserApp {
    UserProfile currentAppUser;
    Database database = Database.instantiateOnce();
    Cart currentUserCart;
    DisplayData display = new DisplayData();


    private void goToLoginPage(String loginType) {
        String userName = "";
        char[] userPassword = {};

        //existing user
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
//aa

    }

    private void goToCart() {

    }

    private void goToProfile() {

    }

    void callerMethod() {
        goToLoginPage("login");
        if (currentAppUser != null) {
            // if existing user, load their pre-saved cart
            currentUserCart = currentAppUser.getCart();
            //else create a new Cart

            goToHomepage();
        }
        // user chooses the below options
        goToCart();
        goToProfile();

    }

}

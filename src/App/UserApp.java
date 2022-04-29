package App;

public class UserApp {
    UserProfile currentAppUser;
    Database database = Database.instantiateOnce();

    private void goToLoginPage(String loginType){
        String userName = "";
        char[] userPassword = {};

        //if new user
        if(loginType.equals("login")){
            //get userName, password and fetch from db
            currentAppUser = database.getUserProfile(userName, userPassword);
        }

        //existing user
        else{
            int[] pinCode = new int[6];
            String userAddress = "";

            //handlers for illegal inputs
            currentAppUser = new UserProfile(userName, userPassword, userAddress, pinCode);
            database.addUser(currentAppUser);
        }

    }

    private void goToHomepage(){


    }
    private void goToCart(){

    }
    private void goToProfile(){

    }

    void callerMethod(){
        goToLoginPage("login");
        if (currentAppUser != null){
            goToHomepage();
        }


    }

}

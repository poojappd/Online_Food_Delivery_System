package App;

import java.util.Arrays;

class User {
    private String userName;
    private char[] password;

    User(String userName, char[] password){
        this.userName = userName;
        this.password = password;
    }

    String getUserName(){
        return userName;
    }

    boolean verifyPassword(char[] somePassword){
        return Arrays.equals(somePassword, password);
    }
}

package App;

public class Admin {

    private static Admin one_Admin = null;

    // Single Object for MainAdmin
     static Admin instantiateOnce() {
        if (one_Admin == null) {
            one_Admin = new Admin();
        }

        return one_Admin;
    }

    String getUserName(){
         return userName;
    }
}

package Main;

import App.Admin;
import App.Restaurant;

public class Main {
    public static void main(String[] args) {
        Admin admin = Admin.instantiateOnce();
        admin.AdminApp();

    }


}

package App;

import org.jetbrains.annotations.NotNull;

public class EncryptDecrypt {
    public static char[] encrypt(String s) {
        //return char[] array of encrypted password
        char[] temp = new char[s.length()];
        //return temp;
        return s.toCharArray();
    }
    public static char[] decrypt(char @NotNull [] s){
        char[] temp = new char[s.length];
        //return temp;
        return s;
    }
}

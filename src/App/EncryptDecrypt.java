package App;

class EncryptDecrypt {
    static char[] encrypt(String s) {
        //return char[] array of encrypted password
        char[] temp = new char[s.length()];
        //return temp;
        return s.toCharArray();
    }
    static char[] decrypt(char[] s){
        char[] temp = new char[s.length];
        //return temp;
        return s;
    }
}

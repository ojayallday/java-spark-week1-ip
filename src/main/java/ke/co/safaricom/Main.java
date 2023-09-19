package ke.co.safaricom;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String message = "";
        int key = 0;
        int process = 1;

        Cipher cipher = new Cipher();
        cipher.setMessage(message);
        cipher.setKey(key);
        if (process == 1){
            cipher.encrypt(plainText: "" );
        } else if (process==2) {
            cipher.decrypt(encryptedText "");
        }else {
            System.out.println("Invalid process");
        }

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }
    }
}
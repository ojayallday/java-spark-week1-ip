package ke.co.safaricom;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        //message
        while (true) {
            System.out.print("Enter your message: ");
            String message = scanner.next();
            //process
            System.out.print("Choose your process e/d: ");
            String process = scanner.next();
            //key
            System.out.print("Select your key: ");
            int key = scanner.nextInt();
            //Next step
            System.out.print("Do you want to continue? c/q: ");
            String nextStep = scanner.next();
            if(!nextStep.startsWith("c")){
                System.out.print("Thank you and goodbye!!");
                break;
            }
        }
        /*
        Cipher cipher = new Cipher();
        cipher.setMessage(message);
        cipher.setKey(key);
        if (process == 1){
            cipher.encrypt(plainText "" );
        } else if (process==2) {
            cipher.decrypt(encryptedText "");
        }else {
            System.out.println("Invalid process");
        }
        */
        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        /*for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }*/
    }
}
package ke.co.safaricom;

public class Cipher {
    private String message;
    private int key;

    public Cipher() {
    }
    public String encrypt(String plainText){ return "";}
    public String decrypt(String encryptedText){ return "";}

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }
}

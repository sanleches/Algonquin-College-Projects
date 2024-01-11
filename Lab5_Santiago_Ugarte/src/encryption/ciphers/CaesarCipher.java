package encryption.ciphers;

import encryption.Encryptable;

/**
 * An Encryptable class that uses Caesar cipher to encrypt/decrypt strings.
 */
public class CaesarCipher implements Encryptable {
    private final int key;

    /**
     * Key to determine the shift
     */
    public CaesarCipher(int shift) {
        this.key = shift;
    }

    /*
     * encrypt method
     */
    @Override
    public String encrypt(String input) {
    	//we use this API that provides a mutable sequence of characters
        StringBuilder encrypted = new StringBuilder();
      //then we create an array based on the single chars we obtain from the string
        for (char c : input.toCharArray()) {
                
                encrypted.append((char) ((c + key) ));//this line adds the shift to each char of the array
        }
        return encrypted.toString();// we return the array with a tostring method that transforms it into a string
    }

    
    /**
     * Decryption method
     */
    @Override
    public String decrypt(String input) {
    	//we use this API that provides a mutable sequence of characters
        StringBuilder decrypted = new StringBuilder();
        //then we create an array based on the single chars we obtain from the string
        for (char c : input.toCharArray()) {
                
                decrypted.append((char) ((c  - key )));//this line substracts the provided key from the string
        }
        return decrypted.toString();// we return the array with a tostring method that transforms it into a string
    }
}
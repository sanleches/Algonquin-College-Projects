package encryption.ciphers;

import encryption.Encryptable;

/**
 * An Encryptable class that uses Vigenere to encrypt and decrypt strings.
 */
public class VigenereCipher implements Encryptable {
	
    // The secret key used for the Vigenere cipher
    private final String key;
    // The length of the secret key
    private final int keyLength;

    // The constructor of the class which takes a password as a parameter
    public VigenereCipher(String password) {
        // Converts the password to uppercase and initializes the key
        //this.key = password.toUpperCase();
        // Initializes the length of the key
        key = password;
    	this.keyLength = password.length();
    }

    // Method to encrypt a string using the Vigenere cipher
    @Override
    public String encrypt(String input) {
    	
        // String builder to hold the encrypted text
        StringBuilder encrypted = new StringBuilder();
        
        // Length of the input string
        int inputLength = input.length();

        // Loop over each character in the input string
        for (int i = 0; i < inputLength; i++) {
            // Get the character at the current position in the input string
            char inputChar = input.charAt(i);
            // Get the corresponding character in the key, wrapping around if necessary
            char keyChar = key.charAt(i % keyLength);

            // Check if the character is a letter
            if (Character.isLetter(inputChar)) {
            	
                // Get the base ASCII value ('A' for uppercase letters, 'a' for lowercase letters)
                char base = Character.isUpperCase(inputChar) ? 'A' : 'a';
                base = inputChar;          
                // Calculate the zero-based position of the input and key characters in the alphabet
                int inputIndex = inputChar - base;
                
                //test inputIndex using the encryptable base
                //int inputIndex = inputChar - START_CHAR;
                
                int keyIndex = keyChar - 'A';
                
                //  keyindex using the start char
                //int keyIndex = keyChar - START_CHAR;

                // Calculate the encrypted character and append it to the encrypted string
                 char encryptedChar = (char) ((inputIndex + keyIndex) % 26 + base);
                 
                // encryptedchar with the encryptable range
                //char encryptedChar = (char) ((inputIndex + keyIndex) % RANGE + base);
                
                encrypted.append(encryptedChar);
            } else {
                // If the character is not a letter, append it to the encrypted string without modification
                encrypted.append(inputChar);
            }
        }

        // Return the encrypted string
        return encrypted.toString();
    }

    // Method to decrypt a string using the Vigenere cipher
    @Override
    public String decrypt(String input) {
        // String builder to hold the decrypted text
        StringBuilder decrypted = new StringBuilder();
        // Length of the input string
        int inputLength = input.length();

        // Loop over each character in the input string
        for (int i = 0; i < inputLength; i++) {
            // Get the character at the current position in the input string
            char inputChar = input.charAt(i);
            // Get the corresponding character in the key, wrapping around if necessary
            char keyChar = key.charAt(i % keyLength);

            // Check if the character is a letter
            if (Character.isLetter(inputChar)) {
                // Get the base ASCII value ('A' for uppercase letters, 'a' for lowercase letters)
                char base = Character.isUpperCase(inputChar) ? 'A' : 'a';
                // Calculate the zero-based position of the input and key characters in the alphabet
                int inputIndex = inputChar - base;
                int keyIndex = keyChar - 'A';
                // keyindez using the start char
                // int keyIndex = keyChar - START_CHAR;

                // Calculate the decrypted character and append it to the decrypted string
                char decryptedChar = (char) ((inputIndex - keyIndex + 26) % 26 + base);
                
                // decryptedchar with the encryptable range
                // char decryptedChar = (char) ((inputIndex - keyIndex + RANGE) % RANGE + base);
                
                decrypted.append(decryptedChar);
            } else {
                // If the character is not a letter, append it to the decrypted string without modification
                decrypted.append(inputChar);
            }
        }

        // Return the decrypted string
        return decrypted.toString();
    }
}

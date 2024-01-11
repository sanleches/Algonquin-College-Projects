import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import encryption.Encryptable;
import encryption.ciphers.CaesarCipher;
import encryption.ciphers.VigenereCipher;

/**
 * A brief description of the role of this class
 * Student Name: Santiago Ugarte
 * Student Number:0401090463
 * Course: CST8132 Object Oriented Programming
 * Program: CET-CS-Level 2
 * Professor:  James Mwangi PhD.
 */

/**
 * The program that tests the encryption methods.
 */
public class Lab5Test {
    private final Scanner input;

    /*
     * We create a new scanner 
     */
    public Lab5Test() {
        this.input = new Scanner(System.in);
    }

    /*
     * this code will make sure to get the correct selecton for the menu
     */
    private int getMenuItem(int optns) {
    	
        while (true) {
        	
            System.out.print("Select action:");
            // if that checks if the selection its between the correct bounds
            if (input.hasNextInt()) {
                int selection = input.nextInt();
                if (selection >= 1 && selection <= optns) {
                    input.nextLine(); // Consume the remaining newline character
                    return selection;
                }
                else {
                	System.out.println("Please select a number in the range");
                }
            }
            //in case of an invalid input
            else {
            input.nextLine(); // Consume the invalid input
            System.out.println("Please enter an integer");//error message
            }
        }
    }
    
    /*
     * 
     */
    private String getString(String prompt) {
        System.out.println(prompt);
        return input.nextLine();
    }

    private int getInt(String prompt, int min, int max) {
        while (true) {
            System.out.println(prompt);
            if (input.hasNextInt()) {
                int value = input.nextInt();
                if (value >= min && value <= max) {
                    input.nextLine(); // Consume the remaining newline character
                    return value;
                }
                else {
                	System.out.println("Please select a number in the range");
                }
            }
            else {
            input.nextLine(); // Consume the invalid input
            System.out.println("Please enter an integer");
            }
        }
    }

    private Encryptable getMethod() {
    	/*
    	 * This method called getMethod displays the method selection sub menu
    	 */
        System.out.println("Encryption method");
        System.out.println("	1 - Caesar");
        System.out.println("	2 - Vigenere");
        
        int selection = getMenuItem(2); // gets the selection from the user and handles exeptions
        
        if (selection == 1) {
            int shift = getInt("Shift value:", 0, 25);
            return new CaesarCipher(shift);
        } else {
            String password = getString("Password:");
            return new VigenereCipher(password);
        }
    }

    public static void main(String[] args) {
        
        List<String> encryptedText = new ArrayList<>();
        Lab5Test tester = new Lab5Test();

        int selection;
        
        do {
        	System.out.println("Encryption tester");
            System.out.println("	1 - Encrypt text");
            System.out.println("	2 - Decrypt text");
            System.out.println("	3 - Display encrypted list");
            System.out.println("	4 - Exit");

            selection = tester.getMenuItem(4);
            
            switch (selection) {
                case 1:
                    String textToEncrypt = tester.getString("Please enter text to be encrypted:");
                    Encryptable encryptionMethod = tester.getMethod();
                    String encrypted = encryptionMethod.encrypt(textToEncrypt);
                    encryptedText.add(encrypted);
                    System.out.println("Encrypted value #" + encryptedText.size() + " is: " + encrypted);
                    break;
                case 2:
                    if (encryptedText.isEmpty()) {
                        System.out.println("Nothing to decrypt");
                        break;
                    }
                    int messageNumber = tester.getInt("Message number you want to decrypt:", 1, encryptedText.size());
                    encryptionMethod = tester.getMethod();
                    String decrypted = encryptionMethod.decrypt(encryptedText.get(messageNumber - 1));
                    System.out.println("Decrypted value #" + messageNumber + " is: " + decrypted);
                    break;
                case 3:
                    if (encryptedText.isEmpty()) {
                        System.out.println("Nothing to display");
                        break;
                    }
                    System.out.println("------------");
                    for (int i = 0; i < encryptedText.size(); i++) {
                        System.out.println("#" + (i + 1) + ": " + encryptedText.get(i));
                    }
                    System.out.println("------------");
                    break;
                case 4:
                    break;
            }
        } while (selection != 4);

        System.out.println("Good bye");
    }
}
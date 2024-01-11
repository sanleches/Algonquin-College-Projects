package encryption;

/**
 * The required methods for all the encryption classes.
 */

/*
 * Interface
 */
public interface Encryptable {
	/*
	 * Static variables
	 */
	final int START_CHAR = 'a';
	final int END_CHAR = 'z';
	final int RANGE = START_CHAR - END_CHAR;
	
	
	//END_CHAR - START_CHAR
	
	String encrypt(String input);
    String decrypt(String input);
}
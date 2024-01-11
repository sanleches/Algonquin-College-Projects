/*
 * Student Name: Santiago Ugarte
 * Lab Professor: Teddy Yap
 * Due Date: 2023-02-17
 * Modified: 2023-02-17
 * Description:  Lab exercise 03 
 */
public class Main {
	   public static void main(String[] args) {
	        Character charObj = 'a';
	        Double doubleObj = 3.14;
	        Float floatObj = 1.23f;
	        Long longObj = 123456789L;
	        Integer intObj = 42;
	        Short shortObj = 100;
	        Byte byteObj = 127;

	        System.out.printf("Character: SIZE=%d, BYTES=%d, MIN_VALUE=%d, MAX_VALUE=%d%n",
	                Character.SIZE, Character.BYTES, (int)Character.MIN_VALUE, (int)Character.MAX_VALUE);
	        System.out.printf("Double: SIZE=%d, BYTES=%d, MIN_VALUE=%f, MAX_VALUE=%f%n",
	                Double.SIZE, Double.BYTES, Double.MIN_VALUE, Double.MAX_VALUE);
	        System.out.printf("Float: SIZE=%d, BYTES=%d, MIN_VALUE=%f, MAX_VALUE=%f%n",
	                Float.SIZE, Float.BYTES, Float.MIN_VALUE, Float.MAX_VALUE);
	        System.out.printf("Long: SIZE=%d, BYTES=%d, MIN_VALUE=%d, MAX_VALUE=%d%n",
	                Long.SIZE, Long.BYTES, Long.MIN_VALUE, Long.MAX_VALUE);
	        System.out.printf("Integer: SIZE=%d, BYTES=%d, MIN_VALUE=%d, MAX_VALUE=%d%n",
	                Integer.SIZE, Integer.BYTES, Integer.MIN_VALUE, Integer.MAX_VALUE);
	        System.out.printf("Short: SIZE=%d, BYTES=%d, MIN_VALUE=%d, MAX_VALUE=%d%n",
	                Short.SIZE, Short.BYTES, Short.MIN_VALUE, Short.MAX_VALUE);
	        System.out.printf("Byte: SIZE=%d, BYTES=%d, MIN_VALUE=%d, MAX_VALUE=%d%n",
	                Byte.SIZE, Byte.BYTES, Byte.MIN_VALUE, Byte.MAX_VALUE);
	        System.out.printf("Program By Santiago Ugarte");
	    }

}

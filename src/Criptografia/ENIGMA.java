package Criptografia;

public class ENIGMA {
	public static int[] Algoritm(String Plaintext) {
		final int key = 10;
		char [] breakout = Plaintext.toCharArray();
		int [] ascvalues = new int[breakout.length];;
		
		for(int i = 0; i <= breakout.length-1;i++) {
			ascvalues[i] = breakout[i];
			
		}
		
		for(int i = 0; i <= ascvalues.length-1;i++) {
			ascvalues[i] = (int)ascvalues[i]+key;
			
		}
		
		return ascvalues;
	}
}

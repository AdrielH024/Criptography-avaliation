package Criptografia;


public class ENIGMA {

public static CypherTxt;

public ENIGMA (String Plaintext){
	Plaintext = Algoritm(Plaintext);
	Plaintext = criptograph(Plaintext); 
	CypherTxt = Plaintext;

}

	private int[] Algoritm(String Plaintext) {
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

	public String criptograph(String T){
		int[] CypherTxt = new int[T.length()];
		CypherTxt = alg.Algoritm(T);
		
		String exit = " ";
		for(int i=0; i < CypherTxt.length; i++) {
			if(i>=1) {
				exit += " ";
			}
			exit += (char) CypherTxt[i];
		}
		
		return exit;
	}
}

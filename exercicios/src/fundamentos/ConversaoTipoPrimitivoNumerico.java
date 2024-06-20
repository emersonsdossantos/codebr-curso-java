package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		double a = 1; //implicita
		System.out.println(a);
		
		float b = (float)1.1234567888888; // explicita (cast)
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c;
		
		System.out.println(d); // explicita (cast)
		
		double e = 1.999999;
		int f = (int) e;
		System.out.println(f); //explicita (cast)
		
		

	}

}

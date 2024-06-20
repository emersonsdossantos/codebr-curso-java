package fundamentos;

public class Wrappers {

	public static void main(String[] args) {
		

		// byte
		Byte b = 100;
		Short s = 1000;
		Long l = 10000L;
		
		Integer i = Integer.parseInt("1000");
		System.out.println(i + 2);
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(l / 3);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#';
		System.out.println(c + "...");
		

	}

}

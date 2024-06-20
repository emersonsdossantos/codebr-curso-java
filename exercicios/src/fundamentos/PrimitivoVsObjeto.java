package fundamentos;

public class PrimitivoVsObjeto {

	public static void main(String[] args) {
		String s = new String("Texto");
		s = s.toUpperCase();
		
		System.out.println(s);
		
		// Wrappers são a versao objetos dos tipos primitivos
		int a = 123;
		System.out.println(a);

	}

}

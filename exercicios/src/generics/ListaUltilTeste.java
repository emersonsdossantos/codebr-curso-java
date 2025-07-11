package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUltilTeste {

	public static void main(String[] args) {
		
		List<String> langs = Arrays.asList("Js", "PHP", "C++", "Java");
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		String ultimaLinguagem = (String) ListaUtil.getUltimo1(langs);
		System.out.println(ultimaLinguagem);
		
		int ultimoNumero = (Integer) ListaUtil.getUltimo1(nums);
		System.out.println(ultimoNumero);
		
		List<String> langs2 = Arrays.asList("Js", "PHP", "C++", "Java");
		List<Integer> nums2 = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		String ultimaLinguagem2 = ListaUtil.getUltimo2(langs2);
		System.out.println(ultimaLinguagem2);
		
		Integer ultimoNumero2 = ListaUtil.<Integer>getUltimo2(nums2);
		System.out.println(ultimoNumero2);
	}

}

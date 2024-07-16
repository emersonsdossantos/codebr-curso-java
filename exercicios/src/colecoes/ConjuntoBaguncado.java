package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("Texto");
		conjunto.add(1);
		conjunto.add('X');
		
		System.out.println(conjunto.size());
		
		conjunto.add("texto");
		conjunto.add("Texto"); // Nao aceita o mesmo conjunto
		
		System.out.println(conjunto.size());
		
		System.out.println(conjunto.remove("texto"));
		System.out.println(conjunto.remove("texto"));
		
		System.out.println(conjunto.contains(1.2));
		System.out.println(conjunto.contains("texto"));
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
//		conjunto.addAll(nums); // uniao entre dois conjuntos
		
		conjunto.retainAll(nums);
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);		

	}

}

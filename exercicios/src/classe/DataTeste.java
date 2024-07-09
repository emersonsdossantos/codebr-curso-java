package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data data1 = new Data();
				
		Data data2 = new Data(28,9,1984);
		
		String dataFormatada1 = data1.obterDataFormatada();
		
		System.out.println(dataFormatada1);
		System.out.println(data2.obterDataFormatada());
		
		data1.imprimirDataFormatada();
		data2.imprimirDataFormatada();
	}

}

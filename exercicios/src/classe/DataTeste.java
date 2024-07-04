package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data data1 = new Data();
		data1.dia = 30;
		data1.mes = 5;
		data1.ano = 2016;
		
		
		Data data2 = new Data();
		data2.dia = 28;
		data2.mes = 9;
		data2.ano = 1984;
		
		System.out.printf("%d/%d/%d\n", data1.dia, data1.mes, data1.ano);
		System.out.printf("%d/%d/%d", data2.dia, data2.mes, data2.ano);


	}

}

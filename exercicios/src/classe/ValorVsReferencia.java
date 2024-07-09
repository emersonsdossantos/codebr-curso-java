package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {
		
		double a = 2;
		double b = a;
		
		a++;
		b--;
		
		System.out.println("a = " + a );
		System.out.println("b = " + b ); // atribuicao por valor (Tipo primitivo)
		
		Data d1 = new Data(1, 6, 2022);
		Data d2 = d1; // atribuicao por referencia (Objeto)
		
		d1.dia = 31;
		d2.mes = 12;
		
		d1.ano = 2025;
		
		double c = 5;
		alterValorPrimitivo(c);
		System.out.println(c);
		
		System.out.println(d1.formatarData());
		System.out.println(d2.formatarData());
		
		voltarDataParaValorPadrao(d1);
		
		System.out.println(d1.formatarData());
		System.out.println(d2.formatarData());
	}
	
	static void voltarDataParaValorPadrao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;	
	}
	
	static void alterValorPrimitivo(double a) {
		a++;
	}

}

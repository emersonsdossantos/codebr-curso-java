package lambdas;

@FunctionalInterface
public interface Calculo {
	
	double executar(double x, double y);
	
	default String legal() {
		return "Legal";
	}
	
	static String muitoLegal() {
		return "Muito legal";
	}

}

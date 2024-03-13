package lambdas;


@FunctionalInterface
public interface Calculo {
	
	double executar(double a,double b);// abstrato
	
	default String legal()// As interfaces funcionais 
	{
		return "legal";
	}
	
	static String muitolegal() {
		return "muito legal";
	}
}

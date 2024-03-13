package fundamentos;
/**
 * 
 * @author Marcelo Marcelino
 *
 */

public class Temperatura {
	
	public static void main(String[] args) {
		//(f-32)*5/9=c
		
		double tempF=86;
		final double num=32;
		final double divisão=5/9.0;
		
		double conversão=(tempF-num)*divisão;
		
		System.out.println(conversão+"º Celsius");
		
		tempF=150;
		conversão=(tempF-num)*divisão;
		System.out.println(conversão+"º Celsius");
	}

}

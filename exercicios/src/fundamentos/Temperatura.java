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
		final double divis�o=5/9.0;
		
		double convers�o=(tempF-num)*divis�o;
		
		System.out.println(convers�o+"� Celsius");
		
		tempF=150;
		convers�o=(tempF-num)*divis�o;
		System.out.println(convers�o+"� Celsius");
	}

}

package fundamentos;
/**
 * 
 * @author Marcelo Marcelino
 *
 */

public class ConversaoTipoPrimitivoNumerico {
	
	public static void main(String[] args) {
		//Conversão implicita
		double a=1;
		System.out.println(a);
		//Conversã forma explicita(CAST)
		float b=(float)1.456478942316;//uma parte do valor vai ser truncada
		//a conversão normalmente seria		float b=1.0f;
		System.out.println(b);
		int c=4;
		
		//o java não avalia valores, ele avalia tipo, de modo que o tipo int é maior que o byte
		byte d=(byte)c;//conversão explicita(CAST)
		
		System.out.println(d);
		
		double e=1;
		int f=(int)e;
		System.out.println(f);
	}

}

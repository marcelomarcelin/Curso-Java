package fundamentos;
/**
 * @author Marcelo Marcelino
 */
import java.util.Scanner;

public class wrappers {
	public static void main(String[] args) {
		//wrappers 
		Byte b=1;
		Short s=1000;
		Integer i=10000;
		Long l=100000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.byteValue());
		
		Scanner entrada= new Scanner(System.in);
		System.out.println("digite um valor");
		Integer numero=Integer.parseInt(entrada.next());
		
		System.out.println(i*3);
		System.out.println(l/3);
		
		System.out.println(numero);
		
		entrada.close();
		
		Float f =123.14f;
		Double d =123456.79789;
		System.out.println(f);
		System.out.println(d);
		
		Boolean bo=Boolean.parseBoolean("true");
		System.out.println(bo);
		
		Character c = '*';
		System.out.println(c);
		
		
		
	}

}
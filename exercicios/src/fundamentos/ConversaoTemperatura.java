package fundamentos;

import java.util.Scanner;

public class ConversaoTemperatura {
	public static void main(String[] args) {
		
		//(f-32)*5/9=c
		Scanner entrada= new Scanner(System.in);
		System.out.println("Entre com a temperatra de deseja converter:");
		double Temperatura=entrada.nextDouble();
		System.out.println("Para converter para Celsius digite 1 para Fahrenheit 2");
		String escolha=entrada.next();
		
		double convers�o="1".equals(escolha)? (Temperatura-32)*5/9:0;
		convers�o="2".equals(escolha)?(Temperatura*9/5)+32:convers�o;
		
		System.out.printf("A temperaruta convertida �: %.2f",convers�o);
		
		entrada.close();
	}

}

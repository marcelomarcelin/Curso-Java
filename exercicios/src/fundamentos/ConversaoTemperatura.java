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
		
		double conversão="1".equals(escolha)? (Temperatura-32)*5/9:0;
		conversão="2".equals(escolha)?(Temperatura*9/5)+32:conversão;
		
		System.out.printf("A temperaruta convertida é: %.2f",conversão);
		
		entrada.close();
	}

}

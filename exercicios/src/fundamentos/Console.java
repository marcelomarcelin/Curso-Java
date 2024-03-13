package fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		
		
		System.out.println("Digite a seu nome");
		Scanner entrada= new Scanner (System.in);
		String nome=entrada.nextLine();
		
		System.out.println("Seu nome é "+nome);
		
		System.out.println("Digite sua idade:");
		int idade=entrada.nextInt();
		
		System.out.println("Digite agora seu salario:");
		double salario=entrada.nextDouble();
		
		
		System.out.printf("Seu nome é %s ,sua idade é %d e você ganha %.2f",nome, idade, salario);
		entrada.close();
	}

}

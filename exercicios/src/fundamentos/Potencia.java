package fundamentos;

import java.util.Scanner;

public class Potencia {
	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("Digite um numero");
		
		double numero=entrada.nextDouble();
		
		double num1=Math.pow(numero, 2);
		double num2=Math.pow(numero, 3);
		
		
		
		System.out.printf("O valor elevado ao quadrado é: %.2f e ao cubo é: %.2f",num1,num2);
		
		
		entrada.close();
	}

}

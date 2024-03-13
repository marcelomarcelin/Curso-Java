package fundamentos;

import java.util.Scanner;

public class AreadoTriangulo {
	public static void main(String[] args) {
		
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("Digite o valor da base do triangulo:");
		double base=entrada.nextDouble();
		System.out.println("Digite o valor da altura do triangulo");
		double altura=entrada.nextDouble();
		
		double result=(base*altura)/2;
		
		
		System.out.printf("A área do triangulo é: %.2f",result);
		
		entrada.close();
	}

}

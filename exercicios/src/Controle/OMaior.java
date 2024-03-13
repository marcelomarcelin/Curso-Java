package Controle;

import java.util.Scanner;

public class OMaior {
	public static void main(String[] args) {
		double numero=0;
		Scanner entrada=new Scanner(System.in);
		
		for (int i=0;i<=9;i++) {
			System.out.println("Digite um numero");
			double n=entrada.nextDouble();
			if(n>numero) {
				numero=n;
				
			}
			
			
		}
		System.out.println("O maior numero digitado é: "+numero);
		
		entrada.close();
		
	}

}

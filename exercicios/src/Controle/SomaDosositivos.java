package Controle;

import java.util.Scanner;

public class SomaDosositivos {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		double numero=0;
		double soma=0;
		while(numero>=0) {
			System.out.println("Digite um numero:");
		 numero=entrada.nextDouble();
		 if (numero>=0) {
			 
			soma+=numero;
			System.out.println(soma);
			
		 }else break;
		}
		
		
		entrada.close();
	}

}

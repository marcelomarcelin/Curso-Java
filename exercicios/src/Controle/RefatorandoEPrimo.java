package Controle;

import java.util.Scanner;

public class RefatorandoEPrimo {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Digite um numero para verificarmos se � primo");
		int numero=entrada.nextInt();
		int divisores=0;
		
		for(int i=2;i<numero;i++) {
			if (numero%i==0) {
				divisores++;
			}
		}
		
		switch (divisores) {
		case 0:
			System.out.println("O numero "+numero+" � primo");
			break;
		
		default:
			System.out.println("O numero "+numero+" n�o � primo");
		}
		
		
		
		
		
		
		entrada.close();
	}

}

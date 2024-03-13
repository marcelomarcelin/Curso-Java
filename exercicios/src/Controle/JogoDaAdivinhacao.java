package Controle;

import java.util.Scanner;

public class JogoDaAdivinhacao {
	
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		System.out.println("Você tera 10 tentativas para adivinhar o numero \n é um numero entre 0 e 100 \n Boa sorte!!!");
		int n=10;
		
		for(int i=10;i>=0;) {
			System.out.println("Digite o numero");
			int numero=entrada.nextInt();
			if (numero>=0&&numero<=100) {
				if(numero==n) {
					System.out.println("Você acertou, Parabéns");
					break;
				}else System.out.println("Tente novamente");
			}else System.out.println("Numero invalido tente novamente, perdeu uma chance");
			i--;
			System.out.println("Voce tem "+i+" Chances");
		}
		
		entrada.close();
	}

}

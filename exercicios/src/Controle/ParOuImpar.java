package Controle;

import java.util.Scanner;

public class ParOuImpar {
	public static void main(String[] args) {
		
		Scanner entrada= new Scanner(System.in);
		System.out.println("Digite um numero:");
		int numero=entrada.nextInt();
		int parouimpar=numero%2;
		if(numero>=0&&numero<=10) {
			System.out.println("O numero digitado esta entre 0 e 10");
		}else System.out.println("O numero digitado não esta entre 0 e 10");
		if (parouimpar==0) {
			System.out.println("O numero é par");
		}else System.out.println("O numero é impar");
		
		entrada.close();
	}

}

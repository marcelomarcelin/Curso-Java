package Controle;

import java.util.Scanner;

public class CriterioDeAprovacao {
	
	public static void main(String[] args) {
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Digite a primeira nota do aluno:");
		double nota1=entrada.nextDouble();
		System.out.println("Digite a segunda nota do aluno:");
		double nota2=entrada.nextDouble();
		
		double media=(nota1+nota2)/2;
		
		if(media>=0&&media<=10) {
			
		if (media>=7) {
			System.out.println("Aprovado");
		}else if(media>4) {
			System.out.println("Recuperação");
		}else System.out.println("Reprovado");
		}else System.out.println("Notas digitadas invalidas");
		entrada.close();
	}

}

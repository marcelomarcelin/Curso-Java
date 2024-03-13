package Controle;

import java.util.Scanner;

public class If {
	
	public static void main(String[] args) {
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Informe a média");
		double media=entrada.nextDouble();
		
		
		if (media >=7.0&&media<=10) {
			
			System.out.println("Aluno foi aprovado");
		}
		else if (media<7 &&media>=4.5) {
			System.out.println("Aluno em recuperação");
		}else System.out.println("Aluno reprovado");
			
		
	
		
		entrada.close();
		
	}

}

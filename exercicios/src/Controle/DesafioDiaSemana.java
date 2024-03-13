package Controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	
	public static void main(String[] args) {
		//domingo 1
		//segunda 2
		//terça 3
		//quarta 4
		//quinta 5
		// sexta 6
		// sabado 7
		
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Informe o dia da semana:");
		String dia=entrada.next().toLowerCase();
		
		if("domingo".equals(dia)) {
			System.out.println("1");
		}else if("segunda".equals(dia)){
			System.out.println("2");
		}else if("terça".equals(dia)){
			System.out.println("3");
		}else if("quarta".equals(dia)){
			System.out.println("4");
		}else if("quinta".equals(dia)){
			System.out.println("5");
		}else if("sexta".equals(dia)){
			System.out.println("6");
		}else if("sabado".equals(dia)){
			System.out.println("7");
		}else System.out.println("Dia invalido");
		
		entrada.close();
	}

}

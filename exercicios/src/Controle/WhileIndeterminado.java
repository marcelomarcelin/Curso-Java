package Controle;

import java.util.Scanner;

public class WhileIndeterminado {
	
	public static void main(String[] args) {
		
		Scanner entrada= new Scanner(System.in);
		
		boolean parada=false;
		while(!parada==true) {
			System.out.println("Voc� diz::>");
			String Palavra=entrada.nextLine().toLowerCase();
			parada="sair".equals(Palavra);
		}
		
		
		entrada.close();
	}

}

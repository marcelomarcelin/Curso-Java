package Controle;

import java.util.Scanner;

public class DoWhile {
	
	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		
		String texto="";
		do {
			System.out.println("Voc� precisa falar a palavra magica");
			System.out.println("Voc� quer sair?");
			texto=entrada.nextLine().toLowerCase();
		}while(!"por favor".equals(texto));
		
		entrada.close();
	}

}

package Controle;

import java.util.Scanner;

public class SwitchSemBreak {
	public static void main(String[] args) {
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Digite qual faixa você possui::>");
		String faixa=entrada.next();
		
		switch(faixa.toLowerCase()) {
		case "preta":
		System.out.println("Sei o Bassai-Dai...");
		case "marrom":
			System.out.println("Sei o Tekki Shodan...");
		case "roxa":
			System.out.println("Sei o Heian Godan...");
		case "verde":
			System.out.println("Sei o Heian yodan...");
		case "laranja":
			System.out.println("Sei o Heian Sandan...");
		case "vermelha":
			System.out.println("Sei o Heian Nidan...");
		case "amarela":
			System.out.println("Sei o Heian Shondan...");
		}
		entrada.close();
	}

}

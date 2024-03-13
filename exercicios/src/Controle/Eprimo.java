package Controle;

import javax.swing.JOptionPane;

public class Eprimo {
	public static void main(String[] args) {
		String entrada=JOptionPane.showInputDialog("Digite um numero");
		int numero=Integer.parseInt(entrada);
		int divisores=0;
		
		for(int i=2;i<numero;i++) {
			if (numero%i==0) {
				divisores++;
			}
		}
		
		if (divisores==0) {
			System.out.println("O numero "+numero+" é primo");
		}else {
			
			System.out.println("O numero "+numero+" não é primo");
		}
	}

}

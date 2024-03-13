package Controle;

import javax.swing.JOptionPane;

public class Soletrando {
	public static void main(String[] args) {
		String entrada=JOptionPane.showInputDialog("Digite uma palavra");
		char letras[]=entrada.toCharArray();
		
		for(int i=0;i<letras.length;i++) {
			
			System.out.println(letras[i]);
		}
		
	}

}

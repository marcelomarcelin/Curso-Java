package Controle;

import javax.swing.JOptionPane;

public class Bissexto {
	public static void main(String[] args) {
		
		String entrada=JOptionPane.showInputDialog("Digite o ano para podermos verificar");
		int ano=Integer.parseInt(entrada);
		
		if(ano%2==0) {
			System.out.println("Ano bissexto");
		}else System.out.println("Não é um ano bissexto");
		
	}

}

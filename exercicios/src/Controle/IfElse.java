package Controle;

import javax.swing.JOptionPane;

public class IfElse {
	public static void main(String[] args) {
		 String valor=JOptionPane.showInputDialog("Informe um numero:");
				 int num=Integer.parseInt(valor);
		 
		 if (num%2==0) {
			 System.out.println("Número par");
		 }else System.out.println("Número impar");
	}

}

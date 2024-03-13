package fundamentos;

import javax.swing.JOptionPane;


public class imc {
	
	public static void main(String[] args) {
		
		String numero=JOptionPane.showInputDialog("Digite seu peso:");
		double peso=Double.parseDouble(numero);
		String numero2=JOptionPane.showInputDialog("Digite sua altura:");
		double altura=Double.parseDouble(numero2);
		
		double imc=peso/(Math.pow(altura,2));
		System.out.printf("O seu IMC é: %.2f",imc);
		
	}

}

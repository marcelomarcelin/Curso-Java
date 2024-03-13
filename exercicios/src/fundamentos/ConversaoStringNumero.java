package fundamentos;
/**
 * @author Marcelo Marcelino
 */

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	
	public static void main(String[] args) {
		
		String valor1=JOptionPane.showInputDialog("Digite o Priemiro numero");
		String valor2=JOptionPane.showInputDialog("Digite o segundo numero");
		
		int num1 = Integer.parseInt(valor1);
		int num2 = Integer.parseInt(valor2);
		
		int soma= num1+num2;
		
		System.out.println(soma);
		
		
		String numero1=JOptionPane.showInputDialog("Digite um númdero para calcularmos a média");
		String numero2=JOptionPane.showInputDialog("Digite um outro númdero para calcularmos a média");
		
		double val1= Double.parseDouble(numero1);
		double val2= Double.parseDouble(numero2);
		
		double media = (val1+val2)/2;
		
		System.out.println(media);
		
		
	}

}

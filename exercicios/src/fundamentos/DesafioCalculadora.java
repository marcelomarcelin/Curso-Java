package fundamentos;

import javax.swing.JOptionPane;

public class DesafioCalculadora {
	public static void main(String[] args) {
		
		
		String numero1=JOptionPane.showInputDialog("Digite o primeiro n�mero:");
		double num1=Double.parseDouble(numero1);
		String operador=JOptionPane.showInputDialog("Digite qual opera��o deseja:");
		String numero2=JOptionPane.showInputDialog("Digite o segundo n�mero:");
		double num2=Double.parseDouble(numero2);
		
		
		double resultado="+".equals(operador)?num1+num2:0;
		 resultado="-".equals(operador)?num1-num2:resultado;
		 resultado="*".equals(operador)?num1*num2:resultado;
		 resultado="/".equals(operador)?num1/num2:resultado;
		 resultado="%".equals(operador)?num1%num2:resultado;
		
		
		
		System.out.printf("N�mero %.2f %s N�mero %.2f= %.2f",num1,operador,num2,resultado);
		
	}

}

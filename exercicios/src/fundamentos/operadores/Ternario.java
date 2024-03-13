package fundamentos.operadores;

import javax.swing.JOptionPane;

public class Ternario {
	
	public static void main(String[] args) {
		
		
		
		String nota1=JOptionPane.showInputDialog("Digite a primeira nota do aluno");
		double n1=Double.parseDouble(nota1);
		String nota2=JOptionPane.showInputDialog("Digite a primeira nota do aluno");
		double n2=Double.parseDouble(nota2);
		String nota3=JOptionPane.showInputDialog("Digite a primeira nota do aluno");
		double n3=Double.parseDouble(nota3);
		
		double media=(n1+n2+n3)/3;
		
		String resultado=media>=7 ? "Aprovado": "Recuperação";
		
		System.out.println(resultado);
		
	}

}

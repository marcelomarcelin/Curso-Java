package fundamentos;

/**
 * @author Marcelo Marcelino
 */

import java.util.Scanner;

public class DesafioConversão {
	
	public static void main(String[] args) {
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Digite o primeiro salario\n");
		String salario1 =entrada.nextLine().replace(",", ".");
		System.out.println("Digite o segundo salario\n");
		String salario2 =entrada.nextLine().replace(",", ".");
		System.out.println("Digite o terceiro salario\n");
		String salario3 =entrada.nextLine().replace(",", ".");
		
		double num1=Double.parseDouble(salario1);
		double num2=Double.parseDouble(salario2);
		double num3=Double.parseDouble(salario3);
		
		
		double media= (num1+num2+num3)/3;
		
		System.out.println("A média é"+media);
		
		
		entrada.close();
	}

}

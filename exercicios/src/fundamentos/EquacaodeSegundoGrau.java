package fundamentos;

import java.util.Scanner;

public class EquacaodeSegundoGrau {
	
	public static void main(String[] args) {
		
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Digite o valor de 'a'");
		int a=entrada.nextInt();
		System.out.println("Digite o valor de 'b'");
		int b=entrada.nextInt();
		System.out.println("Digite o valor de 'c'");
		int c=entrada.nextInt();
		
		int delta=(int)Math.pow(b, 2)-4*a*c;
		
		System.out.println("O valor do seu delta é:"+delta);
		
		
		double x1=(-b+Math.sqrt(delta))/2*a;
		double x2=(-b-Math.sqrt(delta))/2*a;
		
		System.out.printf("O seu X1 é %.2f e o seu X2 é: %.2f",x1,x2);
		
		
		entrada.close();
	}

}

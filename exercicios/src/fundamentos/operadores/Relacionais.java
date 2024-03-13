package fundamentos.operadores;

import java.util.Scanner;

public class Relacionais {
	
	public static void main(String[] args) {
		
		int a=97;
		int d='a';
		
		System.out.println(a==d);
		System.out.println(3>4);
		System.out.println(3>=4);
		System.out.println(3<4);
		System.out.println(3<=4);
		System.out.println(3!=4);
		
		System.out.println("Digite a media do aluno");
		Scanner entrada=new Scanner(System.in);
		double nota=entrada.nextDouble();
		
		
		
		boolean bomComportamento=true;
		boolean PassouporMedia=nota>=7.0;
		boolean temDesconto=bomComportamento&&PassouporMedia;
		
		
		
		System.out.println("Tem desconto?"+temDesconto);
		
		
		
		entrada.close();
	}

}

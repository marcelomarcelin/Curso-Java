package fundamentos;
/**
 * 
 * @author Marcelo Oliveira
 * @since JDK 10.0
 */

public class Inferencia {
	
	public static void main(String[] args) {
		double a=4.5;//declara��o e inicializa��o da variavel.
		System.out.println(a);
		
		/*
		 * dessa forma o java vai inferir, ou seja,
		 * ele vai transformar a variavel de acordo com o valor que voc� esta atribuindo a mesma.
		 * nesse caso ele inferiu como double
		 */
		var b=4.5;
		System.out.println(b);
		
		// nesse caso foi inferido como String
		var c="texto";
		System.out.println(c);
		
		c="outro texto";
		System.out.println(c);
		
		/*
		 * O que n�o podemos fazer � um valor que foi inferido como a variavel c para obter um outro valor
		 * como por exemplo 4.5, pois o java ja amarrou o mesmo sendo como String.
		 */
		
		//Com a inferencia n�o conseguimos realizar:
		double d;//variavel declarada
		d=123.45;//variavel inicializada
		System.out.println(d);
	}

}

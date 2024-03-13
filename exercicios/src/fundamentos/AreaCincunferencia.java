package fundamentos;

/**
 * 
 * @author Marcelo Oliveira
 *
 */

public class AreaCincunferencia {
	
	public static void main(String[] args) {
		//Declaração das variaveis
		double raio = 3.4;
		//a sintaxe "final" esta transformando em um valor constante o qual não pode ser alterado. 
		final double PI=3.14159;
		
		double area= PI*raio*raio;
		
		//impressão na tela o resultado
		System.out.println(area);
		
		raio= 10;
		area= PI*raio*raio;
		
		System.out.println("Area"+area+"m2");
		
	}

}

package lambdas;

import java.util.Arrays;
import java.util.List;



public class Foreach {
	
	public static void main(String[] args) {
		
		
		List<String> aprovados= Arrays.asList("Ana","Bia","Lia", "Gui");
		
		
		System.out.println("Forma Tradicional...");
		
		for(String nome:aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\n Lambdas #01...");
		
		
		aprovados.forEach(nome->{System.out.println(nome+"!!!!!");});//foreach com a função lambda
		
		
		System.out.println("\n Method reference...");
		aprovados.forEach(System.out::println);

		
		System.out.println("\n Lambdas #02...");
		aprovados.forEach(nome->meuImprimir(nome));//foreach com a função lambda
		
		
		System.out.println("\n Method reference #02...");
		aprovados.forEach(Foreach::meuImprimir);
	}
	
	static void meuImprimir(String nome) {
		System.out.println("Oi meu nome é "+ nome);
	}

}

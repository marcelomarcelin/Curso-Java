package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
	
	public static void main(String[] args) {
		List<String>Aprovados= Arrays.asList("Lu","Gui","Luca","Ana");
		
		for (String nome:Aprovados) {//usando o foreach
			System.out.println(nome);
		}
		
		System.out.println("\n Usando o iterator...");
		
		Iterator<String>it=Aprovados.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("\n Usando o Stream...");
		Stream<String> st= Aprovados.stream();
		st.forEach(System.out::println);//laço interno
		
		
		
		
		
		
	}
	
	
	

}

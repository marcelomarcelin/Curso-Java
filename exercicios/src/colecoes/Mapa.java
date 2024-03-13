package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	
	public static void main(String[] args) {
		Map<Integer, String> Usuarios=new HashMap<>();
		
		Usuarios.put(1,"Roberto");// O put tanto adiciona 
		Usuarios.put(1, "Matias");// como substitui caso ja existir.
		Usuarios.put(2, "Filipinas");
		Usuarios.put(3, "Marcela");
		Usuarios.put(4, "Marcondes");
		
		
		System.out.println(Usuarios.size());
		System.out.println(Usuarios.isEmpty());//verifica se esta vazio
		System.out.println(Usuarios.keySet());//imprime as chaves
		System.out.println(Usuarios.values());//Imprime os valores
		System.out.println(Usuarios.entrySet());//imprime as chaves e os valores.
		System.out.println(Usuarios.containsKey(20));
		System.out.println(Usuarios.containsKey(1));
		System.out.println(Usuarios.containsValue("Matias"));
		
		System.out.println(Usuarios.get(4));
		System.out.println(Usuarios.remove(1));
		
		
		for(int chaves: Usuarios.keySet()) {
			System.out.println(chaves);
		}
		
		for(String valor: Usuarios.values()) {
			System.out.println(valor);
		}
		
		for(Entry<Integer,String> registro: Usuarios.entrySet()) {
			System.out.println(registro.getKey()+ "==> ");
			System.out.println(registro.getValue()+ " ");
		}
	}

}

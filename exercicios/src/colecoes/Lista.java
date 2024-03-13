package colecoes;

import java.util.ArrayList;

public class Lista {
	public static void main(String[] args) {
		ArrayList<Usuario>Lista=new ArrayList<>();
		
		Usuario u1= new Usuario("Ana");
		Lista.add(u1);
		Lista.add(new Usuario("Carlos"));
		Lista.add(new Usuario("Lia"));
		Lista.add(new Usuario("Bia"));
		Lista.add(new Usuario("Manu"));
		
		
		System.out.println(Lista.get(3));//Acessar pelo indice
		
		System.out.println(">>>>>>" + Lista.remove(1));
		System.out.println(Lista.remove(new Usuario("Manu")));
		System.out.println("Tem?"+Lista.contains(new Usuario("Lia")));
		System.out.println("Tem?"+Lista.contains(u1));
		
		for (Usuario u:Lista) {
			System.out.println(u.nome);
		}
	}

}

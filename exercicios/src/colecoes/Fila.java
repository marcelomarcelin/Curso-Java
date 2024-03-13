package colecoes;

import java.util.Queue;
import java.util.LinkedList;

public class Fila {
	
	public static void main(String[] args) {
		Queue <String> fila=new LinkedList<>();
		
		//Offer e add-> Adiciona um elemento na fila
		// Diferen� � o comportamento quando a fila esta cheia
		fila.add("Ana");//retona false
		fila.offer("Bia");// Lan�a uma exce��o
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		
		//peek e Element-> obter o proximo elemento
		//da fila(sem remover)
		
		
		//Diferen�a do comportamento ocorre
		//quando a fila esta vazia
		System.out.println(fila.peek());//retorna false
		System.out.println(fila.peek());
		System.out.println(fila.element()); // lan�a uma exce��o
		System.out.println(fila.element());
		
		//Fila.size()
		//fila.clear()
		//fila.isEmpy()
		
		//Poll e Remove-> Obter o proximo elemento
		//da fila e remove
		
		//Diferen�a do comportamento ocorre
		//quando a fila esta vazia
		System.out.println(fila.poll());// retorna null
		System.out.println(fila.remove());
		System.out.println(fila.poll());// retorna null
		System.out.println(fila.poll());// retorna null
		System.out.println(fila.poll());// retorna null
		System.out.println(fila.poll());// retorna null
		System.out.println(fila.poll());// retorna null
		System.out.println(fila.poll());// retorna null
	}

}

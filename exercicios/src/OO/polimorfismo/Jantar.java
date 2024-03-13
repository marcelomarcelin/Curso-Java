package OO.polimorfismo;

public class Jantar {
	
	public static void main(String[] args) {
		
		Pessoa convidado=new Pessoa(99.65);
		Arroz ingrediente1= new Arroz(0.25);
		Feijao ingrediente2= new Feijao(0.180);
		
		Comida ingrediente3= new Comida(0.180);
		
		System.out.println(convidado.getPeso());
		
		
		convidado.comer(ingrediente1);
		convidado.comer(ingrediente2);
		convidado.comer(ingrediente3);
		System.out.println(convidado.getPeso());
		
		Sorvete sobremesa=new Sorvete(0.5);
		
		convidado.comer(sobremesa);
		
		System.out.println(convidado.getPeso());
	}

}

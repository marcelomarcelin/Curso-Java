package classe.desafio;

public class Jantar {
	public static void main(String[] args) {
		Pessoa p1=new Pessoa();
		p1.nome="Jacinto";
		p1.peso=150;
		
		
		Pessoa p2=new Pessoa();
		p2.nome="Tião";
		p2.peso=70;
		
		
		Pessoa p3=new Pessoa("Amanda");
		p3.peso=50;
		
		
		
		
		
		Comida c1=new Comida();
		c1.nome="Feijoada";
		c1.peso=0.5;
		
		
		Comida c2=new Comida();
		c2.nome="lasanha";
		c2.peso=0.2;
		
		
		Comida c3=new Comida("Parmegiana");
		c3.peso=0.7;
		
		
		double comendo=p1.comer(p1.peso, c1.peso);
		double comendo1=p2.comer(p2.peso, c3.peso);
		double comendo2=p3.comer(p3.peso, c2.peso);
		double comendo3=p1.comer(p1.peso, c2.peso);
		
		System.out.println(comendo);
		System.out.println(comendo1);
		System.out.println(comendo2);
		System.out.println(comendo3);
	}

}

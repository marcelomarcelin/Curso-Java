package classe;

public class Produto {
	
	String nome;
	double preco;
	static double desconto=0.25;
	
	Produto(String nomeInicial){//Contrutor
		nome=nomeInicial;
		
	}
	
	Produto(){//Construtor Padr�o
		
	}
	
	
	
	
	double PrecoComDesconto(){
		
		
		return preco*(1-desconto);
	}
	
	double PrecoComDesconto(double descontoDoGerente){
			
			
			return preco*(1-desconto+descontoDoGerente);
	}

}

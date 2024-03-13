package classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		
		Produto p1=new Produto("Papel");
		
		//p1.nome= "Papel";
		p1.preco=4.50;
		Produto.desconto=0.50;
		System.out.println(p1.PrecoComDesconto());

		
		Produto p2=new Produto();
		
		p2.nome= "Televisor";
		p2.preco=2800.00;
		System.out.println(p2.PrecoComDesconto());
		
		
		
		
		
		double precoFinal1=p1.PrecoComDesconto();
		double precoFinal2=p2.PrecoComDesconto();
		double MediaDoCarrinho=(precoFinal1+precoFinal2)/2;

		
		System.out.printf("Média do Carrinho é= R$ %.2f", MediaDoCarrinho);
	}

}

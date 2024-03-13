package OO.Composicao;

public class CompraTeste {
	
	public static void main(String[] args) {
		
		Compra c1= new Compra();
		c1.cliente="João Pedro";
		c1.itens.add(new Item("Caneta",20,7.45));
		c1.itens.add(new Item("Borracha",12,3.89));
		c1.itens.add(new Item("Caderno",3,18.79));
		c1.adicionarItem(new Item("livro",0,1.79));// relação bi-direcional
		
		
		System.out.println(c1.itens.size());
		System.out.println(c1.obterValorTotal());
		
	
	}

}

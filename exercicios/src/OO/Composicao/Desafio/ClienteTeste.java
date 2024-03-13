package OO.Composicao.Desafio;

public class ClienteTeste {
	
	public static void main(String[] args) {
		Cliente c1= new Cliente("João");
		Cliente c2= new Cliente("Joaquim");
		Cliente c3= new Cliente("Serafim");
		
		Compra compra1= new Compra();
		
		compra1.adicionarItem("Caneta", 1,100);
		compra1.adicionarItem(new Produto("Notebook",2000),2);
		Compra compra2= new Compra();
		
		compra2.adicionarItem("Caderno", 10,10);
		compra2.adicionarItem(new Produto("Impressora",1000),1);
		
		c1.adicionarCompra(compra1);
		c1.adicionarCompra(compra2);
		c2.adicionarCompra(compra1);
		c3.adicionarCompra(compra2);
		
		
		System.out.println(c1.obterValorTotal());
		System.out.println(c2.obterValorTotal());
		System.out.println(c3.obterValorTotal());
		
	}

}

package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
	
	public static void main(String[] args) {
		


	Function<Produto, Double> ValorReal= p -> p.preco*(1-p.desconto);
	 
	UnaryOperator<Double> ValorMunicipal=preco->preco>=2500? preco*1.085:preco;
		
	 UnaryOperator<Double> frete =preco->preco>=3000?preco+100:preco+50;
	
	 UnaryOperator<Double> arredondar =preco->Double.parseDouble(String.format("%.2f",preco));

	 
	 Function<Double,String> Formatar=preco->("R$"+preco).replace(".",",");
		
	 Produto p= new Produto("Ipad",3535.89, 0.13);
	 
	 String preco=ValorReal
			 .andThen(ValorMunicipal)
			 .andThen(frete)
			 .andThen(arredondar)
			 .andThen(Formatar)
			 .apply(p);
		System.out.println("O preço final é "+preco);
	}

}

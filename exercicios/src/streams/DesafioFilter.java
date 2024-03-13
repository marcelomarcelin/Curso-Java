package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Function;

public class DesafioFilter {
	
	
	public static void main(String[] args) {
		
		Produto p1=new Produto("caneta",1.75, false);
		Produto p2=new Produto("lapis",2.25, false);
		Produto p3=new Produto("lapiseira",8.80, false);
		Produto p4=new Produto("notebook", 3500.00, true);
		Produto p5=new Produto("Maquina de lavar roupa",10000.00,true);
		Produto p6=new Produto("pratos",50.00,false);
		Produto p7=new Produto("Panela",80.50, false);
		Produto p8=new Produto("Fio dental",5.50, false);
		Produto p9=new Produto("Creme de dente",2.80,false);
		Produto p10=new Produto("Mesa",1500.00,true);
		Produto p11=new Produto("Micro-ondas",700.00, false);
		Produto p12=new Produto("Caderno",10.00, false);
		Produto p13=new Produto("Celular Samsung", 1500.00, true);
		Produto p14=new Produto("Celular motorola", 980.89, true);
		Produto p15=new Produto("Celular Nokia",780, false);
		
		
		
		List<Produto> loja=Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14,p15);
		
		Predicate<Produto>valorEmPromocao= n->n.preco<=2000;
		Predicate<Produto>freteGratis= n->n.frete;
		
		Function<Produto, String> Apresentacao= a->"O produto::> "+a.nome+" Esta em promoção e com frete gratis";
		
		
		loja.stream()
		.filter(valorEmPromocao)
		.filter(freteGratis)
		.map(Apresentacao)
		.forEach(System.out::println);
		
		
		
		
		
		
	}

}

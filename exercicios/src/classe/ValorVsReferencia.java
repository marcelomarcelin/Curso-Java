package classe;

public class ValorVsReferencia {
	
	public static void main(String[] args) {
		double a=2;
		double b=a;//Atribuição por valor
		
		a++;
		b--;
		
		System.out.println(a +"" + b);
		
		
		
		Data d1=new Data(1,6,2022);
		Data d2=d1;//Atribuição por referencia
		
		VoltarDataParaValorPadrao(d1);
		
		System.out.println(d1.ObterDataFormatada());
		System.out.println(d2.ObterDataFormatada());
		
		
		int c=5;
		AlterarPrimitivo(c);
		System.out.println(c);
	}
	
	static void VoltarDataParaValorPadrao(Data d) {//isso esta alteranto devido a passar por referencia.
		d.dia=28;
		d.mes=8;
		d.ano=2021;
	}
	
	
	
	static void AlterarPrimitivo(int c) {// esse não altera o valor do parametro que foi passado.
		c++;
	}

}

package classe;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data d1= new Data();
		
		d1.dia=7;
		d1.mes=11;
		d1.ano=2021;
		
		
		
		Data d2= new Data();
		
		d2.dia=28;
		d2.mes=8;
		d2.ano=2021;
		
		System.out.println(d1.ObterDataFormatada());
		System.out.println(d2.ObterDataFormatada());
		
		
		
	}

}

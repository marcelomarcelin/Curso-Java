package classe;

public class ValorNulo {
	
	public static void main(String[] args) {
		String s1="";
		System.out.println("!!!!");
		
		System.out.println(s1);
		
		
		Data d1= Math.random() > 0.5 ? new Data() : null;
		
		if(d1!=null) {
			System.out.println(d1.ObterDataFormatada());
		}
	}

}

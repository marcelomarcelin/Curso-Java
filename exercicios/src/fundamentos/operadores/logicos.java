package fundamentos.operadores;

public class logicos {
	
	public static void main(String[] args) {
		
		boolean condicao1=true;
		boolean condicao2=3>7;
		
		System.out.println(!condicao1&&condicao2);
		System.out.println(condicao1&&condicao2);
		System.out.println(condicao1||condicao2);
		System.out.println(condicao1^condicao2);
		System.out.println(!condicao1);
		System.out.println(!condicao2);
		System.out.println(!!condicao2);
		
		
		//tabela verdade and
		System.out.println(true &&true);
		System.out.println(true &&false);
		//System.out.println(false &&true);
		//System.out.println(false &&false);
		
		//tabela or
		//System.out.println(true ||true);
		//System.out.println(true ||false);
		System.out.println(false ||true);
		System.out.println(false ||false);
		
		//xor
		System.out.println(true^true);
		System.out.println(true^false);
		System.out.println(false^true);
		System.out.println(false^false);
		
		
		System.out.println(!true);
		System.out.println(!false);
	}

}

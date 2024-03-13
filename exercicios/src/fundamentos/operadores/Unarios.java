package fundamentos.operadores;

public class Unarios {
	
	public static void main(String[] args) {
		
		int a=1;
		int b=2;
		
		//forma p�s fixada
		a++;//a=a+1;
		a--;//a=a-1;
		
		++b;//b=b+1;
		--b;//b=b-1;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("mini desafio...");
		// verdadeiro devido o ++a tem maior precedencia, a qual 
		//vai ser incrementada antes de comparar, ap�s isso o resultado seria falso.
		System.out.println(++a == b--);
		System.out.println(a==b);
		
		System.out.println(a);
		System.out.println(b);
			
	}

}

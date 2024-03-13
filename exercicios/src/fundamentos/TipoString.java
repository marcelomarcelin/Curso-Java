package fundamentos;
/**
 * 
 * @author Marcelo Oliveira
 *
 */
public class TipoString {
	public static void main(String[] args) {
		
		System.out.println("Bom dia pessoal".charAt(10));
		String s= "Boa Tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s+"!!!");
		System.out.println(s.startsWith("Bom"));
		System.out.println(s.length());
		System.out.println(s.toLowerCase().endsWith("tarde"));
		
		var nome="Leandro";
		nome.toUpperCase();
		System.out.println(nome);
		var idade=44;
		final var salario=12345.987;
		
		var sobrenome="Marcondes";
		System.out.printf("O senhor %s %s tem %d anos e ganha R$ %.2f",nome,sobrenome,idade, salario );
		String frase=String.format("O senhor %s %s tem %d anos e ganha R$ %.2f",nome,sobrenome,idade, salario );
		System.out.println(frase);
		
		
		var nome2 ="Ari";
		var Sobrenome2="Alves";
		var idade2=98;
		var salario2=3500.00;
		
		String frase2=String.format("O senhor %S %s posssui %d anos de idade e ganha %.2f", nome2,Sobrenome2,idade2,salario2);
		System.out.println(frase2);
		
		
		
	}

}

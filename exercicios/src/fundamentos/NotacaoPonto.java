package fundamentos;
/**
 * 
 * @author Marcelo Marcelino
 *
 */
public class NotacaoPonto {
	
	public static void main(String[] args) {
		String s=" Bom dia X";
		
		//converte para letra maiuscula
		s=s.toUpperCase();
		s=s.replace("X", "Senhor");
		s=s.concat("!!!!");		
		System.out.println(s);
		
		System.out.println("Marcelo".toUpperCase());
		
		
	}

}

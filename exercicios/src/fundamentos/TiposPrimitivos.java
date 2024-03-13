package fundamentos;

/**
 * 
 * @author Marcelo Oliveira
 *
 */
public class TiposPrimitivos {
	
	public static void main(String[] args) {
		
		//Informaçoes do funcionario
		
		//Tipos numericos
		byte anosdeempresa=23;
		short NumerodeVoos=542;
		int id = 56789;
		//é preciso colocar a letra L nesse valor pois é preciso identificar como long
		long pontosacumulados=3_234_845_223L;
		//Aqui da mesma forma para que possa ser intendido como um literal Float
		float salario= 11_445.44F;
		double vendasAcumuladas=2_991_797_103.01;
		
		//Tipo booleano
		boolean estadeFerias= false; //true
		
		//Tipo caractere
		char status='A'; //Ativo
		
		// Dias de empresa
		System.out.println(anosdeempresa*365);
		
		//numero de viagens 
		System.out.println(NumerodeVoos/2);
		
		//Pontos por real
		System.out.println(pontosacumulados/vendasAcumuladas);
		
		System.out.println(id+ ": ganha->"+ salario);
		
		System.out.println("Ferias?"+estadeFerias);
		
		System.out.println("Status: "+ status);
	}

}

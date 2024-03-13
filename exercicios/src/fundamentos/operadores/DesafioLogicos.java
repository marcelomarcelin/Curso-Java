package fundamentos.operadores;



public class DesafioLogicos {
	
	public static void main(String[] args) {
		
		//Trabalho na terça (V ou F) 
		//Trabalho na quinta (V ou F)
		
		//1 32
		//2 50
		
		boolean trabalho1= true;
		boolean trabalho2= true;
		
		
		boolean comproutv50=trabalho1 &&trabalho2;
		boolean comproutv32=trabalho1^trabalho2;
		boolean comprouSorvete=trabalho1||trabalho2;
		boolean maisSaudavel=!comprouSorvete;
	
		System.out.println("Comprou tv 50?"+comproutv50);
		System.out.println("Comprou tv 32?"+comproutv32);
		System.out.println("Tomou sorvete?"+comprouSorvete);
		System.out.println("Ficou mais saudavel?"+maisSaudavel);
		
		
		
		
		

		
	}

}

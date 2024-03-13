package excecao;

public class Basico {
	
	public static void main(String[] args) {
		
		Aluno a1=null;
		
		try {
			
			imprimirNomedoAluno(a1);
		}catch(Exception excecao){
			System.out.println("Ocorreu um erro ao tentar exibir o nome do usu�rio");
		}
		
		try {
			System.out.println(7/0);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
		System.out.println("Fim");
		
		
		
	}
	public static void imprimirNomedoAluno(Aluno aluno) {
		System.out.println(aluno.nome);
	}

}

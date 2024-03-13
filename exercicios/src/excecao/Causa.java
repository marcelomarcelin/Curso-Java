package excecao;

public class Causa {
	public static void main(String[] args) {
		try {
			metodoA(null);
		} catch (IllegalArgumentException e) {
			if (e.getCause()!=null) {
				System.out.println(e.getCause().getMessage());
			}
		}
		metodoA(null);
	}
	
	static void metodoA(Aluno aluno){
		try {
			metodob(aluno);
		} catch (Exception causa) {
			throw new IllegalArgumentException(causa);
		}
	}
	static void metodob(Aluno aluno){
		if(aluno==null) {
			throw new NullPointerException("O aluno esta nulo");
		}
		
		System.out.println(aluno.nome);
	}

}

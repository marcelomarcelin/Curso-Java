package jdbc;

public class DAOTeste {
	
	public static void main(String[] args) {
		DAO dao= new DAO();
		
		String sql= "INSERT INTO pessoas (nome) VALLUES (?)";
		
		dao.incluir(sql, "Jo�o da Silva");
		dao.incluir(sql, "Ana Julia");
		dao.incluir(sql, "Djalma Pereira");
		dao.incluir(sql, "Math Matias");
		
		dao.close();
	}

}

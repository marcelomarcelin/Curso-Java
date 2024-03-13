package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPassoa2 {
	
	public static void main(String[] args) throws SQLException {
		
		Scanner entrada= new Scanner(System.in);
		System.out.println("Digite a sua busca aqui ==>");
		String pesquisa=entrada.nextLine();
		
		Connection conexao= FabricaConexao.getConexao();
		
		String sql="SELECT * FROM pessoas WHERE nome LIKE ?";
		
		PreparedStatement stm= conexao.prepareStatement(sql);
		stm.setString(1,"%"+pesquisa+"%");
		stm.execute();
		ResultSet resultado=stm.executeQuery();
		
		List<Pessoa>pessoas= new ArrayList<>();
		
		while(resultado.next()) {
			
			int codigo=resultado.getInt("codigo");
			String nome=resultado.getString("nome");
			pessoas.add(new Pessoa(codigo, nome));
		}
		
		for(Pessoa p: pessoas) {
			System.out.println(p.getCodigo()+ "==>"+ p.getNome());
		}
		
		stm.close();
		entrada.close();
		conexao.close();
	}

}

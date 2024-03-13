package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DesafioUpdate {
	
	public static void main(String[] args) throws SQLException {
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Informe o ID que deseja atualizar ==>");
		int id=entrada.nextInt();
		
		
		Connection conexao= FabricaConexao.getConexao();
		
		String select="SELECT codigo, nome FROM pessoas WHERE codigo= ?";
		String update="UPDATE pessoas SET nome= ? WHERE codigo = ?";
		
		PreparedStatement stm= conexao.prepareStatement(select);
		stm.setInt(1, id);
		ResultSet resultado= stm.executeQuery();
		
		if (resultado.next()) {
			Pessoa p = new Pessoa(resultado.getInt(1), resultado.getString(2));
			System.out.println("O nome atual é " + p.getNome());
			entrada.nextLine();
			System.out.println("Informe o novo nome ==>");
			String nome=entrada.nextLine();
			
			
			stm.close();
			stm= conexao.prepareStatement(update);
			stm.setString(1, nome);
			stm.setInt(2, id);
			stm.execute();
			
			
			System.out.println("Pessoa alterada com sucesso!");
		}
		
		
		conexao.close();
		entrada.close();
	}

}

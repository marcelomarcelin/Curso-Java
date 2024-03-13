package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {
	
	public static void main(String[] args) throws SQLException {
		Scanner entrada= new Scanner(System.in);
		
		Connection conexao= FabricaConexao.getConexao();
		System.out.println("Digite o código do registro que deseja excluir ==>");
		int id= entrada.nextInt();
		
		
		
		String sql= "DELETE FROM pessoas WHERE codigo = ?";
		
		PreparedStatement stm= conexao.prepareStatement(sql);
		stm.setInt(1, id);
	
		
		if (stm.executeUpdate()>0) {
			System.out.println("Registro deletado com sucesso!");
		}else System.out.println("Registro não encontrado");
		
		
		stm.close();
		conexao.close();
		entrada.close();
		
	}

}

package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {
	
	public static void main(String[] args) throws SQLException {
		
		Scanner entrada= new Scanner(System.in);
		System.out.println("Informe um nome:");
		String nome=entrada.nextLine();
		
		String sql="INSERT INTO pessoas (nome) VALUES(?)";
		
		Connection conexao=FabricaConexao.getConexao();
		
		PreparedStatement stm= conexao.prepareStatement(sql);
		stm.setString(1,nome);
		stm.execute();
		
		
		
		
		entrada.close();
		
	}

}

package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {
	
	public static void main(String[] args)throws SQLException {
		
		// conex�o com o banco de dados passando os par�metros necess�rios
		final String url="jdbc:mysql://localhost?verifyServerCertificate=false&&SSL=true";
		final String usuario= "root";
		final String senha="123456";
		
		// Conex�o
		Connection conexao=DriverManager.getConnection(url,usuario,senha);
		
		//Cria��o do Statement slq
		Statement stm =conexao.createStatement();
		//Passagem dos comandos sql atraves do Statement
		stm.execute("CREATE DATABASE IF NOT EXISTS curso_java");
		
		
		System.out.println("Banco Criado com Sucesso");
		
		conexao.close();
	}

}

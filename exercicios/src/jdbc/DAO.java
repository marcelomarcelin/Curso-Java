package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {
	
	private Connection conexao;
	
	
	public int incluir(String sql, Object... atributos) {
		try {
			PreparedStatement stm= getConexao().prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
			adicionarAtributos(stm, atributos);
			
			
			if(stm.executeUpdate()>0) {
				ResultSet resultado= stm.getGeneratedKeys();
				
				if(resultado.next()) {
					return resultado.getInt(1);
				}
				
				}
			return -1;
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}
		
		
		}
	public void close() {
		try {
			getConexao().close();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			conexao=null;
		}
	}
	
	private void adicionarAtributos(PreparedStatement stm, Object[] atributos) throws SQLException{
		
		
		
		int indice=1;
		for (Object atributo: atributos) {
			if(atributo instanceof String) {
				stm.setString(indice,(String) atributo);
			}else if(atributo instanceof Integer) {
				stm.setInt(indice, (Integer)atributo);
			}
			
			indice++;
		}
	}
	
	private Connection getConexao() {
		try {
			if(conexao != null && !conexao.isClosed()) {
				return conexao;
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		conexao= FabricaConexao.getConexao();
		return conexao;
	}

}

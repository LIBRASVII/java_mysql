package pecas_bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {
	
	public void insertSQL(int id, String nome) throws SQLException {				
		String insert = "INSERT INTO info(nome, qtd) VALUES(?, ?)";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		Statement stmt = null;
		
		try {	
			conn = MySQLAccess.createConnectionToMySQL();
			pstm = conn.prepareStatement(insert);
            stmt = conn.createStatement();
			
            //rs = stmt.executeQuery(insert);
            pstm.setString(1, "Lius");
            stmt.execute(insert);
            
            /*pecas.setCod(pecas);
			pecas.setNome(pecas);*/
			
			pstm.executeUpdate();		
			pstm.execute();
			} catch (Exception e) {
			
			} /*finally {
			// Fecha as conexões
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}*/
	}
}

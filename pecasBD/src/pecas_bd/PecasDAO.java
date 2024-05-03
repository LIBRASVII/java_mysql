package pecas_bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PecasDAO {
	
	public void save(Pecas pecas) throws SQLException {
		String sql = "INSERT INTO info(nome, qtd) VALUES(?, ?)";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		/*Statement stmt = null;
		ResultSet rs = null;*/
		
		try {
			conn = MySQLAccess.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
            //stmt = conn.createStatement();
            //rs = stmt.executeQuery(select);	   
			
			pstm.setString(1, pecas.getNome());
			pstm.setInt(2, pecas.getQtd());
			
			/*while (rs.next()) {
				System.out.print(rs.getInt(1));
	            System.out.print("=> ");
	            System.out.println(rs.getString(2));
			}*/
			pstm.execute();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
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
		}
	}
}
	
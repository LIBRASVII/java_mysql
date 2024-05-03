package pecas_bd;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class SelectFrom {
	
	public static void select(Pecas pecas) throws SQLException {
		String select = "SELECT * FROM INFO";
	
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {	
			conn = MySQLAccess.createConnectionToMySQL();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(select);	
			
			while (rs.next()) {
				System.out.print(rs.getInt(1));
		        System.out.print("=> ");
		        System.out.println(rs.getString(2));
			}
		} catch (Exception e) {
			
		}
	}	
}

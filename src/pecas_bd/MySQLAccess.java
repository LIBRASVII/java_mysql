package pecas_bd;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLAccess {	
	private static final String USERNAME = "root"; // USUARIO DO MYSQL
	private static final String PASSWORD = "0511"; // SENHA DO MYSQL
	
	// DADOS DE CAMINHO, PORTA E NOME DA BASE DE DADOS, A QUAL SERÁ FEITA A CONEXÃO
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/pecas";
	
	public static Connection createConnectionToMySQL() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver"); // FAZ COM QUE A CLASSE SEJA CARREGADA PELA JVM
		
		Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD); // CRIA A CONEXÃO COM O BANCO DE DADOS
		
		return connection;
	}
	
	// TESTANDO A CONEXÃO
	public void testConexao() throws Exception { 
		Connection con = createConnectionToMySQL(); // RESGATA UMA CONEXÃO COM O BANCO DE DADOS
		
		// TRATA UMA CONEXÃO NULA
		if (con != null) { 
			System.out.println("Conexao estabelecida " + con);
			con.close();
		}
	}
}
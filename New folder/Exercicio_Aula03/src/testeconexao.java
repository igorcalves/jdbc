import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class testeconexao {
public static void main(String[] args) throws SQLException {
	final String url = "jdbc:mysql://localhost";
	final String usuario = "root";
	final String senha = "40446610";
	
	Connection conexao = DriverManager .getConnection(url,usuario,senha);
	
	System.out.println("Conexão efetuada com sucesso!");
	conexao.close();
}
}

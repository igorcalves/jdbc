package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {
	public static void main(String[] args) throws SQLException {
		Scanner entrada = new Scanner(System.in);
		int i = 264;
		while( i != 265) {
			
			System.out.print("Informe o nome: ");
			String nome = entrada.nextLine();
			
		Connection conexao = FabricaConexao.getConexao();
		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
		PreparedStatement smtm = conexao.prepareStatement(sql);
		smtm.setString(1, nome);
		
		smtm.execute();
		System.out.println("Pessoa incluida com sucesso");
		}
		entrada.close();
	}
}

package jdbc.desafio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import jdbc.FabricaConexao;

public class UpdateNome {
	public static void main(String[] args) throws SQLException {
		Connection conexao = FabricaConexao.getConexao();
		String sql = "UPDATE pessoas set nome = ? WHERE codigo = ?";
		String nomeString = "";
		String valorString = "";
		String valorCodigo = "";
		Scanner entrada = new Scanner(System.in);
		
		
		
		System.out.print("Digite o codigo da mudanca: ");
		valorCodigo = entrada.nextLine();
		String sqlCodigo = "SELECT nome from pessoas WHERE codigo = ? ";
		PreparedStatement stmt1 = conexao.prepareStatement(sqlCodigo);
		stmt1.setString(1, valorCodigo);
		ResultSet resultado = stmt1.executeQuery();
		while (resultado.next()) {
			nomeString = resultado.getString("nome");
		}
		System.out.print("<<Codigo>> ==> " + valorCodigo + "  <<Nome Selecionado>> ==> " + nomeString + "\n");
		
		System.out.print("Digite o novo nome: ");
		valorString = entrada.nextLine();

		System.out.println(valorString);

		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, valorString);
		stmt.setString(2, valorCodigo);

		stmt.execute();

		System.out.println("nome alterado com sucesso");
		resultado = stmt1.executeQuery();
		while (resultado.next()) {
			nomeString = resultado.getString("nome");
		}

		System.out.println("<<novo nome alterado>>  ==>" + nomeString);

		stmt.close();
		conexao.close();
		entrada.close();

	}

}

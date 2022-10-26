package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExcluirPessoaMinhaVersao {
	public static void main(String[] args) throws SQLException {
		String selectString = "SELECT codigo, nome FROM pessoas";
		String sqlString = "DELETE FROM pessoas WHERE codigo = ?";
		Scanner entrada = new Scanner(System.in);
		Connection conexao = FabricaConexao.getConexao();

		Statement stmt = conexao.createStatement();
		ResultSet resultado = stmt.executeQuery(selectString);

		List<Pessoa> pessoas = new ArrayList<>();
		while (resultado.next()) {
			int codigo = resultado.getInt("codigo");
			String nomeString = resultado.getString("nome");
			pessoas.add(new Pessoa(codigo, nomeString));
		}

		System.out.println("CODIGO ----> NOME");
		for (Pessoa p : pessoas) {
			System.out.println(p.getCodigo() + " ----> " + p.getNome());
		}

		System.out.print("Selecione o codigo para excluir: ");
		int codigo = entrada.nextInt();
		
		PreparedStatement pstms = conexao.prepareStatement(sqlString);
		pstms.setInt(1, codigo);
		pstms.execute();
		
		resultado = stmt.executeQuery(selectString);
		List<Pessoa> pessoas1 = new ArrayList<>();
		while (resultado.next()) {
		    codigo = resultado.getInt("codigo");
			String nomeString = resultado.getString("nome");
			pessoas1.add(new Pessoa(codigo, nomeString));
		}
		
		System.out.println("CODIGO ----> NOME");
		for (Pessoa p : pessoas1) {
			System.out.println(p.getCodigo() + " ----> " + p.getNome());
		}
		
		conexao.close();
		entrada.close();

	}
}

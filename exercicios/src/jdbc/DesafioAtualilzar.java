package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DesafioAtualilzar {

	public static void main(String[] args) throws SQLException {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe o Codigo: ");
		String valorCodigo = entrada.nextLine();
		
		System.out.print("Informe o novo nome: ");
		String novoNome = entrada.nextLine();
		
		Connection conexao = FabricaConexao.getConexao();
		String sqlUpdate = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
		
		PreparedStatement stmt = conexao.prepareStatement(sqlUpdate);
		stmt.setString(1, novoNome);
		stmt.setString(2, valorCodigo);
		int linhasAlteradas = stmt.executeUpdate();
		
		if (linhasAlteradas > 0 ) {
			System.out.println("Alteração realizada com sucesso!!");
		} else {
			System.out.println("Nenhum nome alterado");
		}
		
		stmt.close();
		
		String sqlSelect = "SELECT * FROM pessoas";
		PreparedStatement stmtSelect = conexao.prepareStatement(sqlSelect);
		ResultSet resultado = stmtSelect.executeQuery();
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		while(resultado.next()) {
			int codigo = resultado.getInt("Codigo");
			String nome = resultado.getString("Nome");
			
			pessoas.add(new Pessoa(codigo, nome));
		}
		
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa.getCodigo() + " -> " + pessoa.getNome());
		}
		resultado.close();
		stmtSelect.close();
		conexao.close();
		entrada.close();
	}

}

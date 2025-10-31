package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AtulizarNome2 {

	public static void main(String[] args) throws SQLException {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o cogido da pessoa: ");
		int codigo = entrada.nextInt();
		
		String selectSQL = "SELECT * FROM pessoas WHERE codigo = ?";
		String updateSQL = "UPDATE pessoas SET nome = ? where codigo = ?";
		
		Connection conexao = FabricaConexao.getConexao();
		PreparedStatement stmt = conexao.prepareStatement(selectSQL);
		stmt.setInt(1, codigo);
		ResultSet r = stmt.executeQuery();
		
		if (r.next()) {
			Pessoa p = new Pessoa(r.getInt("codigo"), r.getString("nome"));
			System.out.println("Nome atual: " + p.getNome());
			
			entrada.nextLine();
			
			System.out.println("Informe o novo nome: ");
			String novoNome = entrada.nextLine();
			
			stmt.close();
			stmt = conexao.prepareStatement(updateSQL);
			stmt.setString(1, novoNome);
			stmt.setInt(2, codigo);
			stmt.execute();
			
			System.out.println("Nome atualizado com sucesso!!");
		}
		
		conexao.close();
		entrada.close();
	}

}

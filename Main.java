import java.sql.Connection;
import java.util.List;

public class Main {
	public static void main (String [] args){
		try ( Connection conexao = ConexaoDB.conectar()) {
			ProdutoDAO produtoDAO = new ProdutoDAO(conexao);

			produtoDAO.excluir(1);
			produtoDAO.excluir(2);
			produtoDAO.excluir(3);

		} catch (Exception e){
			System.err.println("Erro geral: " + e.getMessage());
		}
	}

	// Método para listar os produtos
	private static void mostrarProdutos(ProdutoDAO produtoDAO) {
		List<Produto> todosProdutos = produtoDAO.listarTodos();
		if (todosProdutos.isEmpty()){
			System.out.println("Nenhum produto encontrado.");
		} else {
			System.out.println("Lista de produtos: ");
			for(Produto p : todosProdutos) {
				System.out.println(p.getId() + ": " + p.getNome() + " - " + p.getPreco());
			}
		}
	}
}
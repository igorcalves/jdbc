package teste.basico;

import Modelo.basico.Produto;
import infra.DAO;

public class NovoProduto {

	public static void main(String[] args) {

		Produto produto = new Produto("Monitor 23 ", 789.98);
		
		DAO<Produto> dao = new DAO<>(Produto.class);
		
		dao.incluirAtomico(produto).fechar();
		
		System.out.println("id do produto: " + produto.getId());
		
		
	}
}

package teste.umpraum;

import Modelo.umpraum.Assento;
import Modelo.umpraum.Cliente;
import infra.DAO;

public class NovoClienteAssento1 {
	
	public static void main(String[] args) {
		
		Assento assento = new Assento("6f");
		Cliente cliente = new Cliente("Carlos", assento);
		
		DAO<Object> dao = new DAO<>();
		dao.abrirT()
		.incluir(cliente)
		.incluir(assento)
		.fecharT()
		.fechar();
	}
}

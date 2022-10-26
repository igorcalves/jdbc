package teste.heranca;

import Modelo.heranca.Aluno;
import Modelo.heranca.AlunoBolsista;
import infra.DAO;

public class NovoAluno {
	public static void main(String[] args) {
		DAO<Aluno> alunoDAO = new DAO<>();
		
		Aluno aluno1 = new Aluno (123L, "JOÂO");
		AlunoBolsista aluno2 = new AlunoBolsista(345L, "Maria", 1000.0);
		
		alunoDAO.incluirAtomico(aluno1);
		alunoDAO.incluirAtomico(aluno2);
		
		alunoDAO.fechar();
	}

}

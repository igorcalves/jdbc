package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Modelo.basico.Usuario;

public class AlterarUsuario3 {
	public static void main(String[] args) {
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 5L);
		em.detach(usuario);
		
		usuario.setNome("Silvio Negrao");
		
		em.merge(usuario);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}

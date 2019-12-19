package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {


		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		//Para buscar um objeto por ID
		//No primeiro argumento � passada a classe como par�metro e no segundo o ID
		Pessoa p = em.find(Pessoa.class, 2);
		System.out.println(p);
		em.close();
		emf.close();
		
	}

}

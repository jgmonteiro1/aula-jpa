package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {


		Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
		Pessoa p2 = new Pessoa(null, "Joaquim Torres", "joaqui@gmail.com");
		Pessoa p3 = new Pessoa(null, "Ana Maria", "ana@gmail.com");
		//Cria��o do entity Manager Factory passando o name unit do arquivo xml como par�metro
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		//Criando o entity manager usando o EntityManagerFactory
		EntityManager em = emf.createEntityManager();
		/*Para inserir as pessoas instanciadas:
		Deve ser chamado o entity manager com o m�todo persist e passar o objeto como par�metro
		Quando o JPA faz uma opera��o que n�o seja uma simples leitura de dados ele precisa de uma transa��o
		Para iniciar a transa��o � chamado o entitymanager.getTransaction.begin
		Ap�s finalizar a transa�ao: o .commit
		*/
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();
		System.out.println("Funfou");
		
	}

}

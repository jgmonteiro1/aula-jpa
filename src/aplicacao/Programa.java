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
		//Criação do entity Manager Factory passando o name unit do arquivo xml como parâmetro
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		//Criando o entity manager usando o EntityManagerFactory
		EntityManager em = emf.createEntityManager();
		/*Para inserir as pessoas instanciadas:
		Deve ser chamado o entity manager com o método persist e passar o objeto como parâmetro
		Quando o JPA faz uma operação que não seja uma simples leitura de dados ele precisa de uma transação
		Para iniciar a transação é chamado o entitymanager.getTransaction.begin
		Após finalizar a transaçao: o .commit
		*/
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();
		System.out.println("Funfou");
		
	}

}

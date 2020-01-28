package aplicacao;

import javax.persistence.Persistence;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;


import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		// incluir
		//em.getTransaction().begin();
		//em.persist(p1);
		//em.persist(p2);
		//em.getTransaction().commit(); 
		
		// para buscar por id
		//Pessoa p = em.find(Pessoa.class, 2);
		//System.out.println(p);
		
		//para apagar por id
		Pessoa p = em.find(Pessoa.class, 2);
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		System.out.println("Pronto");
		
		em.close();
		emf.close();
	}

}

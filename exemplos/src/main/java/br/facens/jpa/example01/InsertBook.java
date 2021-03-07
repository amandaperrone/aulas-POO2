package br.facens.jpa.example01;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InsertBook {
    public static void main(String[] args) {

        // Conecta com o banco de dados
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("PU_SAMPLES");

        // Gerencia as entidades
        EntityManager em = factory.createEntityManager();

        Book b1 = new Book();
        b1.setId(1l);
        b1.setAuthor("Glauco Todesco");
        b1.setPrice(10.22);
        b1.setTitle("The Art of Java Programming");

        // Insert into Book values b1
        em.persist(b1);

        // Como haverá alteração no banco, deve-se adcionar a transação e o commit
        em.getTransaction().begin();
        em.getTransaction().commit();

        // Fecha as conexões
        em.close();
        factory.close();
    }
}

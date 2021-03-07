package br.facens.jpa.example01;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UpdateBook {
    public static void main(String[] args) {

        // Conecta com o banco de dados
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("PU_SAMPLES");

        // Gerencia as entidades
        EntityManager em = factory.createEntityManager();

        
        Book book = em.find(Book.class, 2l);

        if (book != null) {
            book.setAuthor("Fernanda Cruz32");
        } else {
            System.out.println("Book not found");
        }


        // Como haverá alteração no banco, deve-se adcionar a transação e o commit
        em.getTransaction().begin();
        em.getTransaction().commit();

        // Fecha as conexões
        em.close();
        factory.close();
    }
}

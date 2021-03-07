package br.facens.jpa.example01;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindBook {
    public static void main(String[] args) {

        // Conecta com o banco de dados
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("PU_SAMPLES");

        // Gerencia as entidades
        EntityManager em = factory.createEntityManager();

        // Book book = em.find(Book.class, 1l); // Vai no banco
        Book book = em.getReference(Book.class, 1l); // Não fez SELECT no bd, apenas caso seja necessário
        
        // Fecha as conexões
        em.close();
        factory.close();
    }
}

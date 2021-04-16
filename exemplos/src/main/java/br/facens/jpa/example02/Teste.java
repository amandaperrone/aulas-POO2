package br.facens.jpa.example02;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Teste {
    
    public static void main(String[] args) {
        
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("PU_SAMPLES");
        EntityManager em = factory.createEntityManager();

        Pessoa p = new Pessoa();
        p.setId(3);
        p.setNome("Joelma");

        Funcionario f = new Funcionario();
        f.setId(2);
        f.setNome("Roberta");
        f.setSalario(2500);

        Cliente c = new Cliente();
        c.setId(1);
        c.setNome("Joao");
        c.setSaldo(800);

        Pessoa aux1 = f;
        Pessoa aux2 = c;
        System.out.println(aux1.getNome());
        System.out.println(aux2.getNome());

        em.persist(p);
        em.persist(f);
        em.persist(c);

        em.getTransaction().begin();
        em.getTransaction().commit();

        em.close();
        factory.close();
    }
}

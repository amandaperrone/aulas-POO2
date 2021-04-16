package br.facens.jpa.example02;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/*

    // Cria-se três tabelas sem relação entre elas 
    @Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

    // Cria-se três tabelas com relação de FK (MAIS COMUM)
    @Inheritance(strategy = InheritanceType.JOINED)

    // Cria-se uma única tabela (PADRÃO)
    @Inheritance(strategy = InheritanceType.SINGLE_TABLE)

*/


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Pessoa implements Serializable{
    
    @Id
    private long id;
    private String nome;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pessoa other = (Pessoa) obj;
        if (id != other.id)
            return false;
        return true;
    }

    
    

}

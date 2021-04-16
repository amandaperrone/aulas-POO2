package br.facens.jpa.example02;

import javax.persistence.Entity;

@Entity
public class Funcionario extends Pessoa{
    
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
}

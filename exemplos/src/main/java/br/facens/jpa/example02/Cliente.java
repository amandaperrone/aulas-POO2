package br.facens.jpa.example02;

import javax.persistence.Entity;

@Entity
public class Cliente extends Pessoa{

    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
}

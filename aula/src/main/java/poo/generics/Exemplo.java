package poo.generics;

import poo.collections.Product;

public class Exemplo {

    public static void main(String[] args) {
        
        MinhaClasse m = new MinhaClasse();
        m.add("Amanda", "Perrone");
        m.add("Fernanda", "Boitto");
        m.add("Caio", "Pinheiro");
        m.add("Adrieli", "Neres");

        MinhaClasseGenerica <String, String> mg1 = new MinhaClasseGenerica<>();
        mg1.add("Amanda", "Perrone");

        MinhaClasseGenerica <String, Product> mg2 = new MinhaClasseGenerica<>();
        mg2.add("Amanda", new Product(1l, "luvas", 100.0));

        MinhaClasseGenerica <Long, String> mg3 = new MinhaClasseGenerica<>();
        mg3.add(1l, "Amanda");

        
    }
    
}

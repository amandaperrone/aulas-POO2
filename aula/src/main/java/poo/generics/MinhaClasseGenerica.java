package poo.generics;

import java.util.HashMap;

// Aumenta as chances de reúso
public class MinhaClasseGenerica <K,V> {
    
    private HashMap<K, V> dados = new HashMap<>();

    public void add(K key, V value){
        dados.put(key, value);
    }

    public void print() {
        dados.values().forEach(o -> System.out.println(o));
    }

}

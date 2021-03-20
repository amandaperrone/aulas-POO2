package poo.generics;

import java.util.HashMap;

public class MinhaClasse {
    
    private HashMap<String, String> dados = new HashMap<>();

    public void add(String key, String value){
        dados.put(key, value);
    }

    public void print() {
        dados.values().forEach(o -> System.out.println(o));
    }
}

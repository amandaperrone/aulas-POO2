package poo.collections;

import java.util.TreeMap;

public class Exemplo04 {
    
    public static void main(String[] args) {
        
        TreeMap<Integer,String>      map1   = new TreeMap<>();

        map1.put(100,  "Primeiro");
        map1.put(2000, "Segundo");
        map1.put(3333, "Terceiro");
        map1.put(4443, "Quarto");
        map1.put(5453, "Quinto");

        for(String s : map1.values()){
            System.out.println(s);
        }

        System.out.println("---------------");

        for(Integer s : map1.keySet()){
            System.out.println(s);
        }

    }
}

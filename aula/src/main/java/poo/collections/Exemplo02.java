package poo.collections;

import java.util.HashMap;

public class Exemplo02 {
    
    public static void main(String[] args) {
        
        HashMap<Integer, String> map1 = new HashMap<>();
        //HashMap<String, String> map2 = new HashMap<>();

        map1.put(100, "Primeiro");
        map1.put(100, "Primeiro");


        for(String s : map1.values()) {
            System.out.println(s);
        }

        System.out.println(map1.get(100));

    }
}

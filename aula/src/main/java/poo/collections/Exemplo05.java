package poo.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Exemplo05 {
    
    public static void main(String[] args) {
        
        List <Product> list1 = Arrays.asList(
            new Product(3000l, "Product 3", 300.0),
            new Product(2222l, "Product 2", 200.0),
            new Product(2222l, "Product 2", 20.00),
            new Product(1111l, "Product 1", 100.0),
            new Product(4444l, "Product 1", 400.0),
            new Product(1111l, "Product 1", 100.0)
        );

        HashSet<Product> set1 = new HashSet<>();
        set1.addAll(list1);
        set1.forEach( s -> System.out.println(s));

        System.out.println("--------------------");
        
        TreeSet<Product> set2 = new TreeSet<>();
        set2.addAll(set1);
        set2.forEach(s -> System.out.println(s));
    }
}

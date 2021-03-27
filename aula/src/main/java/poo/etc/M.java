package poo.etc;

import java.util.TreeSet;

public class M <K,P> {

    TreeSet <K> set1 = new TreeSet<>();
    TreeSet <P> set2 = new TreeSet<>();
    
    public void t1(K k) {
        set1.add(k);
    }

    public void t2(P p) {
        set2.add(p);
    }
}

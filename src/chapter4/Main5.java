package chapter4;

import com.google.common.collect.*;

/**
 * Created by kkrol on 06/01/2016.
 */
public class Main5 {

    public static final String NAME = "Kamil";

    public static void main(String[] args) throws InterruptedException {

        testMultimap(ArrayListMultimap.create());
        testMultimap(HashMultimap.create());

    }

    private static void testMultimap(Multimap<String, Integer> multimap) {
        multimap.put(NAME, 1);
        multimap.put(NAME, 2);
        multimap.put(NAME, 3);
        multimap.put(NAME, 3);

        System.out.println("Size = " + multimap.size());
        System.out.println("Kamil = " + multimap.get(NAME));
    }

}

package chapter4;

import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;

import java.util.List;

/**
 * Created by kkrol on 06/01/2016.
 */
public class Main9 {

    public static void main(String[] args) throws InterruptedException {

        List<String> names = Lists.newArrayList("Kamil", "Anna", "Mateusz");

        names.sort(String::compareTo);
        System.out.println("Sorted = " + names);

        Ordering<String> reverseOrdering = Ordering.from(String::compareTo).reverse();
        names.sort(reverseOrdering);
        System.out.println("Reverse sorted = " + names);

        System.out.println("" + reverseOrdering.leastOf(names, 1));
    }

}

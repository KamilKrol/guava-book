package chapter4;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;

import java.util.Set;

/**
 * Created by kkrol on 05/01/2016.
 */
public class Main4 {

    public static void main(String[] args) throws InterruptedException {

        Set<Integer> set1 = ImmutableSet.of(1, 2, 3);
        Set<Integer> set2 = ImmutableSet.of(2, 3, 4);

        Set<Integer> difference = Sets.difference(set1, set2);
        System.out.println(difference);

        Set<Integer> symmetricDifference = Sets.symmetricDifference(set1, set2);
        System.out.println(symmetricDifference);

        Set<Integer> union = Sets.union(set1, set2);
        System.out.println(union);

        Set<Integer> intersection = Sets.intersection(set1, set2);
        System.out.println(intersection);

    }

}

package chapter2;

import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableMap;

import java.util.Map;

/**
 * Created by kkrol on 05/01/2016.
 */
public class Main1 {

    public static void main(String[] args) {

        String[] names = new String[]{"Kamil", "Mateusz", "Bogi", null};
        System.out.println(Joiner.on(" <-> ").useForNull("no name").join(names));

        Map<String, Integer> map = ImmutableMap.of("Kamil", 1, "Mateusz", 2);
        System.out.println(Joiner.on(" <-> ").withKeyValueSeparator(" - ").join(map));

    }
}

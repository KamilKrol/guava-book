package chapter3;

import com.google.common.base.Function;
import com.google.common.base.Functions;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableList;

import java.util.List;

/**
 * Created by kkrol on 05/01/2016.
 */
public class Main1 {

    public static void main(String[] args) {

        List<String> names = ImmutableList.of("Kamil", "Mateusz");
        Function<String,Integer> function = Functions.compose(new Hash(), new ToUpperCase());
        System.out.println(Collections2.transform(names, function));

    }

    private static class ToUpperCase implements Function<String, String> {

        @Override
        public String apply(String input) {
            return input.toUpperCase();
        }
    }

    private static class Hash implements Function<String, Integer> {

        @Override
        public Integer apply(String input) {
            return input.hashCode();
        }
    }
}

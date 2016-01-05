package chapter2;

import com.google.common.base.Splitter;

import java.util.Map;

/**
 * Created by kkrol on 05/01/2016.
 */
public class Main2 {

    public static void main(String[] args) {

        String testString = "Monday,  Tuesday,,Thursday,Friday,,";
        System.out.println(Splitter.on(',').split(testString));
        System.out.println(Splitter.on(',').trimResults().split(testString));

        String mapString = "Kamil=1#Mateusz=2";
        Map<String, String> split = Splitter.on('#').withKeyValueSeparator('=').split(mapString);
        System.out.println(split);

    }
}

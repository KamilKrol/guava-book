package chapter4;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by kkrol on 05/01/2016.
 */
public class Main3 {

    public static void main(String[] args) throws InterruptedException {

        List<String> numbers = ImmutableList.of("One", "Two", "Three", "Four");

        List<List<String>> partitionedList = Lists.partition(numbers, 2);
        System.out.println(partitionedList);


    }


}

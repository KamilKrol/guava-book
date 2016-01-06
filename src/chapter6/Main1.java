package chapter6;

import com.google.common.collect.MapMaker;

import java.util.concurrent.ConcurrentMap;

/**
 * Created by kkrol on 06/01/2016.
 */
public class Main1 {

    public static void main(String[] args) throws InterruptedException {

        ConcurrentMap<String, Integer> concurrentMap = new MapMaker().concurrencyLevel(2).weakValues().makeMap();

    }

}

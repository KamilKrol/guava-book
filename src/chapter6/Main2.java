package chapter6;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.collect.MapMaker;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;

/**
 * Created by kkrol on 06/01/2016.
 */
public class Main2 {

    private static final Callable<Integer> CALLABLE = () -> {
        System.out.println("Retrieving the value");
        Thread.sleep(5000);
        return new Random().nextInt(100);
    };

    public static void main(String[] args) throws ExecutionException {

        Cache<String, Integer> cache = CacheBuilder.newBuilder().build();
        System.out.println("Value = " + cache.get("Kamil", CALLABLE));
        System.out.println("Value = " + cache.get("Kamil", CALLABLE));
        System.out.println("Value = " + cache.get("Kamil", CALLABLE));

    }

}

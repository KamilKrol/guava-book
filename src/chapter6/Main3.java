package chapter6;

import com.google.common.cache.*;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * Created by kkrol on 07/01/2016.
 */
public class Main3 {

    private static final CacheLoader<String, Integer> CACHE_LOADER = new CacheLoader<String, Integer>() {
        @Override
        public Integer load(String key) throws Exception {
            System.out.println("Loading value");
            Thread.sleep(5000);
            return key.hashCode();
        }
    };
    private static final RemovalListener<String, Integer> REMOVAL_LISTENER = new RemovalListener<String, Integer>() {
        @Override
        public void onRemoval(RemovalNotification<String, Integer> notification) {
            System.out.println("Removing '" + notification.getKey() + "' => '" + notification.getValue()
                    + "' because of '" + notification.getCause() + "'");
        }
    };

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        LoadingCache<String, Integer> cache = CacheBuilder.newBuilder().expireAfterAccess(10, TimeUnit.SECONDS)
                .removalListener(REMOVAL_LISTENER).maximumSize(20).recordStats().build(CACHE_LOADER);

        System.out.println("1st = " + cache.get("Kamil"));
        System.out.println("2nd = " + cache.get("Kamil"));

        Thread.sleep(15000);

        System.out.println("3rd = " + cache.get("Kamil"));

        System.out.println("Cache stats = " + cache.stats());

    }

}

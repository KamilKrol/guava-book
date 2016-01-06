package chapter5;

import com.google.common.collect.DiscreteDomain;
import com.google.common.collect.Range;
import com.google.common.util.concurrent.*;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by kkrol on 06/01/2016.
 */
public class Main5 {

    private static final RateLimiter RATE_LIMITER = RateLimiter.create(2.0);
    private static final Runnable RUNNABLE = () -> {
        RATE_LIMITER.acquire();
        System.out.println("Runnable executed");
    };


    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 0; i < 100; i++) {
            executorService.submit(RUNNABLE);
        }

    }

}

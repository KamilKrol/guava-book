package chapter5;

import com.google.common.util.concurrent.Monitor;

import java.util.concurrent.*;

/**
 * Created by kkrol on 06/01/2016.
 */
public class Main2 {


    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService executorService = Executors.newCachedThreadPool();

        Future<String> future = executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(10000);
                return "Kamil";
            }
        });

        System.out.println("Result = " + future.get());

    }

}

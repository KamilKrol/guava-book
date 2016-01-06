package chapter5;

import com.google.common.util.concurrent.*;

import java.util.concurrent.*;

/**
 * Created by kkrol on 06/01/2016.
 */
public class Main4 {

    private static final FutureCallback<String> FUTURE_CALLBACK = new FutureCallback<String>() {
        @Override
        public void onSuccess(String result) {
            System.out.println("Success = " + result);
        }

        @Override
        public void onFailure(Throwable t) {
            System.out.println("Failure");
        }
    };

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService executorService = Executors.newCachedThreadPool();
        ListeningExecutorService listeningExecutorService = MoreExecutors.listeningDecorator(executorService);

        ListenableFuture<String> future = listeningExecutorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(10000);
                return "Kamil";
            }
        });

        Futures.addCallback(future, FUTURE_CALLBACK, executorService);

    }

}

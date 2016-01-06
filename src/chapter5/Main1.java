package chapter5;

import com.google.common.util.concurrent.Monitor;

import java.util.concurrent.TimeUnit;

/**
 * Created by kkrol on 06/01/2016.
 */
public class Main1 {

    private static final Monitor MONITOR = new Monitor();
    private static final Monitor.Guard MONITOR_GUARD = new Monitor.Guard(MONITOR) {
        @Override
        public boolean isSatisfied() {
            return false;
        }
    };

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Trying to acquire the monitor!");
        boolean monitorAcquired = MONITOR.enterWhen(MONITOR_GUARD, 5, TimeUnit.SECONDS);

        if (monitorAcquired) {
            System.out.println("The monitor acquired!");

            try {
                System.out.println("Doing the work");
                Thread.sleep(5000);
            } finally {
                System.out.println("Leaving the monitor!");
                MONITOR.leave();
            }
        }

    }

}

package chapter3;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

import java.util.concurrent.TimeUnit;

/**
 * Created by kkrol on 05/01/2016.
 */
public class Main2 {

    public static void main(String[] args) throws InterruptedException {

        Supplier<String> nameSupplier = Suppliers.memoizeWithExpiration(new NameSupplier(), 15, TimeUnit.SECONDS);

        System.out.println("Name = " + nameSupplier.get());
        System.out.println("Name = " + nameSupplier.get());

        Thread.sleep(10000);
        System.out.println("Name = " + nameSupplier.get());

    }

    private static class NameSupplier implements Supplier<String> {

        @Override
        public String get() {
            try {
                System.out.println("Sleeping");
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Kamil";
        }
    }

}

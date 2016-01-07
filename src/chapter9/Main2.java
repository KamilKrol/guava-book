package chapter9;

import com.google.common.base.Throwables;
import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;

/**
 * Created by kkrol on 07/01/2016.
 */
public class Main2 {

    public static void main(String[] args) {

        String stacktrace = Throwables.getStackTraceAsString(new Exception());
        System.out.println(stacktrace);

    }

}

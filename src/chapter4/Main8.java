package chapter4;

import com.google.common.collect.Range;

/**
 * Created by kkrol on 06/01/2016.
 */
public class Main8 {

    public static void main(String[] args) throws InterruptedException {

        Range<Integer> closeRange = Range.closed(1, 10);
        Range<Integer> openRange = Range.open(1, 10);

        System.out.println("closeRange = " + closeRange);
        System.out.println("openRange = " + openRange);

    }

}

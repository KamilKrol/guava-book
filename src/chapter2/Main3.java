package chapter2;

import com.google.common.base.CharMatcher;

/**
 * Created by kkrol on 05/01/2016.
 */
public class Main3 {

    public static void main(String[] args) {

        System.out.println(CharMatcher.WHITESPACE.collapseFrom("Kamil       Krol  2", '-'));

        CharMatcher matcher = CharMatcher.JAVA_DIGIT.or(CharMatcher.JAVA_LETTER);
        System.out.println(matcher.matchesAllOf("123asd"));
        System.out.println(matcher.matchesAllOf("123asd#"));

    }
}

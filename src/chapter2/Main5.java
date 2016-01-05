package chapter2;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Lists;

import java.util.Collections;
import java.util.List;

/**
 * Created by kkrol on 05/01/2016.
 */
public class Main5 {

    public static void main(String[] args) {

        List<Person> people = Lists.newArrayList(new Person("Kamil", "Krol"), new Person("Zuzanna", "Bak"));
        Collections.sort(people);

        System.out.println(people);

    }

    private static class Person implements Comparable<Person> {
        private final String name;
        private final String surname;

        private Person(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        @Override
        public int compareTo(Person other) {
            return ComparisonChain.start().compare(this.surname, other.surname).compare(this.name, other.surname).result();
        }

        @Override
        public String toString() {
            return MoreObjects.toStringHelper(this).add("name", this.name).add("surname", this.surname).toString();
        }
    }
}

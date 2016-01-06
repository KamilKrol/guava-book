package chapter4;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

/**
 * Created by kkrol on 06/01/2016.
 */
public class Main6 {

    public static void main(String[] args) throws InterruptedException {

        BiMap<String, Integer> biMap = HashBiMap.create();
        biMap.put("Kamil", 1);
        biMap.put("Mateusz", 2);
        BiMap<Integer, String> inversedBiMap = biMap.inverse();

        System.out.println("biMap = " + biMap);
        System.out.println("inversedBiMap = " + inversedBiMap);

    }

}

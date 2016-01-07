package chapter9;

import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;

/**
 * Created by kkrol on 07/01/2016.
 */
public class Main1 {

    private static final byte[] BYTES = new byte[]{1, 2, 3, 4, 5};

    public static void main(String[] args) {

        testHashFunction(Hashing.crc32());
        testHashFunction(Hashing.sha512());

    }

    private static void testHashFunction(HashFunction hashFunction) {
        HashCode hashCode = hashFunction.hashBytes(BYTES);
        System.out.println(hashCode);
    }

}

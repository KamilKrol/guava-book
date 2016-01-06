package chapter4;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

/**
 * Created by kkrol on 06/01/2016.
 */
public class Main7 {

    public static void main(String[] args) throws InterruptedException {

        Table<Integer, Integer, String> table = HashBasedTable.create();
        table.put(1, 1, "Rook");
        table.put(1, 2, "Knight");
        table.put(1, 3, "Bishop");

        System.out.println(table);
        System.out.println("Bishop? " + table.containsValue("Bishop"));

    }

}

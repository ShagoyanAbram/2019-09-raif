package com.abram.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SelfIterator {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        // IteratorSample to traverse the list
        Iterator iterator = list.iterator();



        System.out.println("List elements : ");

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");

            System.out.println();
        }
    }
}

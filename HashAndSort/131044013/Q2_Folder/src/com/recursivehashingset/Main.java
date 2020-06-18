package com.recursivehashingset;

import org.w3c.dom.Node;

public class Main {

    public static void main(String[] args) {
        RecursiveHashingSet<Integer> set = new RecursiveHashingSet<>();

        set.add(2);
        set.add(3);
        set.add(5);
        set.add(1);
    }
}

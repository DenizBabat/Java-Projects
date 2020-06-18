package com.recursivehashingset;

import java.util.Collection;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class RecursiveHashingSet<K> implements Set<K> {


    private int numtables;
    private int numkeys;
    /** The capacity */
    private static final int CAPACITY = 3;
    private Node<K> [] table ;
    private boolean addReturn;

    public RecursiveHashingSet(){
        table = new Node[CAPACITY];
        for (int i = 0; i < CAPACITY; i++) {
            table[i].next = new Node(5);
        }
    }

    @Override
    public boolean add(K key) {
        int index = key.hashCode()%CAPACITY;
        Random random = new Random();
        if (table[index] == null){
            table[index].data = key;
            table[index].next = new Node[random.nextInt()%5];
            return true;
        }
        else {
            table[index].next = helpadd(table[index].next,key, index);
            return addReturn;
        }


    }
    private Node<K> helpadd(Node<K> local, K key, int index){

        if (local.data.equals(key)){
            addReturn = false;
            return local;
        }

        if(local == null){
            Random random = new Random();
            //Node<K>[] newNode = new Node[random.nextInt()%5];
            //newNode[index] = new Node<>(key);

            local.data = key;
            local.next = new Node[];
            addReturn = true;
            return local;
        }else return local.next = helpadd(local[index].next, key, index);
    }

    // Inner Classes

    /** A Node is the building block for a double-linked list. */
    private static class Node < K > {
        /** The data value. */
        private K [] data;

        /** The link to the next node. */
        private Node < K > next;

        /** Construct a node with the given data value.
         @param dataItem The data value
         */
        private Node(K dataItem) {
            data = dataItem;
        }
    } //end class Node


    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<K> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }



    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends K> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }






}

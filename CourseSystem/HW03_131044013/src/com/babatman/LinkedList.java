package com.babatman;

import java.util.*;

/**
 * Linked List Class
 * @param <E>
 */
public class LinkedList<E> implements Iterable<E> {
    private Node<E> head;

    /**
     * Constructs an empty list
     */
    public LinkedList() {
        head = null;
    }

    /**
     * get head
     * @return x
     */
    public Node<E> getHead() {
        return head;
    }
    /**
     * Returns true if the list is empty
     */
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * Inserts a new node at the beginning of this list.
     */
    public void addFirst(E item) {
        head = new Node<E>(item, head);
    }

    /**
     * Returns the first element in the list.
     */
    public E getFirst() {
        if (head == null) throw new NoSuchElementException();

        return head.data;
    }

    /**
     * Removes the first element in the list.
     */
    public E removeFirst() {
        E tmp = getFirst();
        head = head.next;
        return tmp;
    }

    /**
     * Inserts a new node to the end of this list.
     */
    public void addLast(E item) {
        if (head == null)
            addFirst(item);
        else {
            Node<E> tmp = head;
            while (tmp.next != null) tmp = tmp.next;

            tmp.next = new Node<E>(item, null);
        }
    }

    /**
     * Returns the last element in the list.
     */
    public E getLast() {
        if (head == null) throw new NoSuchElementException();

        Node<E> tmp = head;
        while (tmp.next != null) tmp = tmp.next;

        return tmp.data;
    }

    /**
     * Removes all nodes from the list.
     */
    public void clear() {
        head = null;
    }

    /**
     * Returns true if this list contains the specified element.
     */
    public boolean contains(E x) {
        for (E tmp : this)
            if (tmp.equals(x)) return true;

        return false;
    }

    /**
     * Returns the data at the specified position in the list.
     */
    public E get(int pos) {
        if (head == null) return null;

        Node<E> tmp = head;
        for (int k = 0; k < pos; k++)
        {
            if (tmp == null)
                return null;
            tmp = tmp.next;
        }

        if (tmp == null) return null;

        return tmp.data;
    }

    /**
     * Returns a string representation
     */
    public String toString() {
        StringBuffer result = new StringBuffer();
        for (Object x : this)
            result.append(x + " ");

        return result.toString();
    }

    /**
     * Inserts a new node after a node containing the key.
     */
    public void insertAfter(E key, E toInsert) {
        Node<E> tmp = head;

        while (tmp != null && !tmp.data.equals(key)) tmp = tmp.next;

        if (tmp != null)
            tmp.next = new Node<E>(toInsert, tmp.next);
    }

    /**
     * Inserts a new node before a node containing the key.
     */
    public void insertBefore(E key, E toInsert) {
        if (head == null) return;

        if (head.data.equals(key)) {
            addFirst(toInsert);
            return;
        }

        Node<E> prev = null;
        Node<E> cur = head;

        while (cur != null && !cur.data.equals(key)) {
            prev = cur;
            cur = cur.next;
        }
        //insert between cur and prev
        if (cur != null)
            prev.next = new Node<E>(toInsert, cur);
    }

    /**
     * Removes the first occurrence of the specified element in this list.
     */
    public void remove(E key) {
        if (head == null)
            throw new RuntimeException("cannot delete");

        if (head.data.equals(key)) {
            head = head.next;
            return;
        }

        Node<E> cur = head;
        Node<E> prev = null;

        while (cur != null && !cur.data.equals(key)) {
            prev = cur;
            cur = cur.next;
        }

        if (cur == null)
            throw new RuntimeException("cannot delete");

        //delete cur node
        prev.next = cur.next;
    }



    /*******************************************************
     *
     *  The Node class
     *
     ********************************************************/
    private static class Node<E> {
        private E data;
        private Node<E> next;

        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }
    }

    /*******************************************************
     *
     *  The Iterator class
     *
     ********************************************************/

    public Iterator<E> iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator<E> {
        private Node<E> nextNode;

        public LinkedListIterator() {
            nextNode = head;
        }

        public boolean hasNext() {
            return nextNode != null;
        }

        public E next() {
            if (!hasNext()) throw new NoSuchElementException();
            E res = nextNode.data;
            nextNode = nextNode.next;
            return res;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}


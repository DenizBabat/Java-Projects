class LinkedList {

    /**
     *  Node Class
     */
    static class Node {

        int data;
        Node next, prev;

        // Constructor to create a new node
        Node(int d) {
            data = d;
            next = prev = null;
        }
    }

    /**
     * List head
     */
    private Node head;

    /**
     * get head
     * @return Node
     */
    public Node getHead() {
        return head;
    }

    /**
     * print sort
     * @param node
     */
    public void print(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }


    /**
     * link list sürekli ikiye böler ve size yarıya iner.
     * @param head
     * @return Node
     */
    public Node divide(Node head) {
        Node first = head;
        Node second = head;
        while (first.next != null && first.next.next != null) {
            first = first.next.next;
            second = second.next;
        }
        Node temp = second.next;
        second.next = null;
        return temp;
    }

    /**
     *
     * @param local
     * @return
     */
    public Node mergeSort(Node local) {
        if (local == null || local.next == null) {
            return local;
        }
        Node second = divide(local);

        local = mergeSort(local);
        second = mergeSort(second);

        return merge(local, second);
    }

    // Bölünmüş parçları merge yapan fonksiyondur.
    public Node merge(Node first, Node second) {
        // If first linked list is empty
        if (first == null) {
            return second;
        }

        // ikinci linklist boşşsa
        if (second == null) {
            return first;
        }

        //  küçük değeri topla
        if (first.data < second.data) {
            first.next = merge(first.next, second);
            first.next.prev = first;
            first.prev = null;
            return first;
        } else {
            second.next = merge(first, second.next);
            second.next.prev = second;
            second.prev = null;
            return second;
        }
    }

    /**
     * Sayıları link liste ekler.
     * @param num
     */
    public void add(int num){

        if (head == null){
            head = new Node(num);
            return;
        }
        Node temp = head;

        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = new Node(num);
    }


}
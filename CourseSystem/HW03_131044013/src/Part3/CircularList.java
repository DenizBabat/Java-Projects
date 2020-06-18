package Part3;

import Part1.Course;

/**
 * Created by babatman on 25.03.2018.
 */
public class CircularList<E> {

    /**
     * static node class
     * @param <E>
     */
    public static class Node<E> {

        /**
         * data
         */
        private E data;
        /**
         * next node
         */
        private Node<E> next;
        /**
         * circular next node
         */
        private Node<E> circular;

        /**
         * Constructor
         * @param data
         * @param next
         * @param circular
         */
        public Node(E data, Node<E> next, Node<E> circular) {
            this.data = data;
            this.next = next;
            this.circular = circular;
        }

        /**
         * Constructor
         * @param data
         * @param next
         */
        public Node(E data, Node<E> next){
            this.data = data;
            this.next = next;
            circular = null;
        }

        /**
         * default constructor
         */
        public Node(){}


        /**
         * To string
         * @return
         */
        @Override
        public String toString() {
            return data.toString();
        }
    }

    /**
     * head
     */
    private  Node<E> head;
    /**
     * En son eklenen node
     */
    private  Node<E> addedNode;
    /**
     * size
     */
    int size = 0;

    public CircularList(){head = null;}

    /**
     * get head
     * @returnx node
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

    /**2
     * Inserts a new node at the beginning of this list.
     */
    public void addFirst(E item) {
        head = new Node<E>(item, head);
      //  nextNode = head;
        addedNode =null;
        ++size;
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
            addedNode = tmp.next;
            rearrangeCircular();
            ++size;
        }

    }

    /**
     * Eklenen veya silenen node olunca, circular yapısını tekrar inşa eden fonksiyondur.
     */
    public void  rearrangeCircular(){
        Node<E> h = head;
        Node<E> first = new Node<E>();
        Node<E> templink = new Node<E>();
        Node<E> last = new Node<E>();
        boolean flag = false;

        Course course = (Course) addedNode.data;

        while (h != null){

            if (h.data.equals(course) && first.data!=null){
                templink.circular = h;
                templink = h;
                last = h;
                flag = true;
            }

            if (h.data.equals(course) && first.data==null){
                first = h;
                templink = h;
            }

            h=h.next;
        }

        if (flag)
        {
            last.circular = first;
        }else {
            first= null;
        }
    }

    /**
     * add node
     * @param item
     * @return
     */
    public boolean add(E item){
        if (item == null){
            return false;
        }
        addLast(item);
        return true;
    }

    /**
     * next node function
     * @param node
     * @return
     */
    public Node<E> next(Node<E> node){
        Node <E> temp = head;
        Course course = new Course();
        while (temp!= null){
            if (course.compare(temp.data, node.data)){
                return temp.next;
            }
            temp = temp.next;
        }
        return new Node<>(null, null, null);
    }

    /**
     * Next in semster function
     * @param node
     * @return
     */
    public Node<E> nextInSemester(Node<E> node){
        Node<E> temp = head;
        while (temp != null)
        {
            if (temp.data.equals(node.data)){
                return temp.circular;
            }

            temp = temp.next;
        }

        return null;
    }

    /**
     * remove node
     * @param node
     * @return
     */
    public Node<E> remove(Node<E> node){

        Node <E> temp = head;
        Node<E> delNode = new Node<E>();
        Course course = new Course();
        while (temp!= null){
            if (course.compare(temp.data, node.data)){
                delNode = temp.next;
                temp.next = temp.next.next;
                addedNode = delNode;
                rearrangeCircular();
                --size;
                return delNode;
            }
            temp = temp.next;
        }
        return null;
    }

    /**
     * size
     * @return
     */
    public int size(){
        return size;
    }


    /**
     * display funciton.
     */
    public void display(){
        Node<E> temp = head;

        while (temp.next!=null){
            System.out.println(temp.data.toString());
            temp = temp.next;
            System.out.println();
        }
    }

}


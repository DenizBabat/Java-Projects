package part1;


import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;

import java.util.*;

/**
 * parent a göre child ekleen bir calsstir.
 * @param <E>
 */
public class GeneralTree<E extends Comparable<E>> extends BinaryTree<E> {

    // Data Fields
    /** Return value from the public add method. */
    private boolean addReturn;


    /**
     * Parent child i tree ye ekler.
     * @param parent
     * @param child
     * @return
     */
    public boolean addParentAndChild(E parent, E child){
        addReturn = false;

        if (root == null)
            root = new Node(parent);

        if (contains(parent)){

            root = addTomytree(root, parent,child);

            return addReturn;
        }
        return false;
    }

    /**
     * Parent child i tree ye ekler.
     * @param local
     * @param p
     * @param c
     * @return Node
     */
    private Node<E> addTomytree(Node<E> local, E p, E c){

        if (local == null)
            return null;

        if (p.compareTo(local.data) == 0){
           // if (local.left == null || local.right == null)
            {
                local = add(local, c);
                addReturn = true;
            }
           // else
                return local;
        }
        local.left = addTomytree(local.left, p,c);
        local.right = addTomytree(local.right,p,c);
        return local;
    }

    /**
     * Eleman tree de var mı yokmu bakar.
     * @param target
     * @return
     */
    private boolean contains(E target) {
        return find(target);
    }

    /**
     * istenilen elemanı bulur.
     * @param target
     * @return boolean
     */
    private boolean find(E target) {
        return find(root, target)==1?true:false;
    }

    /**
     * istenilen elemanı bulur.
     * @param local
     * @param p
     * @return integer
     */
    private int find(Node<E> local, E p){

        if (local == null)
            return 0;

        if (p.compareTo(local.data) == 0){
            return 1;
        }
        return  find(local.left, p)+find(local.right,p);
    }

    /**
     * eleman ekler
     * @param item
     * @return boolean
     */
    private boolean add(E item) {
        root = add(root, item);
        return addReturn;
    }

    /**
     * eleman ekler
     * @param localRoot
     * @param item
     * @return Node
     */
    private Node < E > add(Node < E > localRoot, E item) {
        if (localRoot == null) {
            // item is not in the tree — insert it.
            addReturn = true;
            return new Node < E > (item);
        }
        else if (item.compareTo(localRoot.data) == 0) {
            // item is equal to localRoot.data
            addReturn = false;
            return localRoot;
        }
        else if (item.compareTo(localRoot.data) < 0) {
            // item is less than localRoot.data
            localRoot.left = add(localRoot.left, item);
            return localRoot;
        }
        else {
            // item is greater than localRoot.data
            localRoot.right = add(localRoot.right, item);
            return localRoot;
        }
    }

    /**
     * Treeye post order arar ve sıralar
     * @return Node
     */
    public List<E> postorderTraversal(){
        return postorderTraversal(root);
    }

    /**
     * Treeye post order arar ve sıralar
     * @param root
     * @return Node
     */
    private List<E> postorderTraversal(Node<E> root) {
        List<E> res = new ArrayList<E>();

        if(root==null) {
            return res;
        }

        Stack<Node<E>> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()) {
            Node<E> temp = stack.peek();
            if(temp.left==null && temp.right==null) {
                Node<E> pop = stack.pop();
                res.add(pop.data);
            }
            else {
                if(temp.right!=null) {
                    stack.push(temp.right);
                    temp.right = null;
                }

                if(temp.left!=null) {
                    stack.push(temp.left);
                    temp.left = null;
                }
            }
        }

        return res;
    }


    /**
     * Treeyi level order ekrana basar.
     */
    public void levelorder(){
        if (root==null){
            System.out.println("Root is null");
            return;
        }else levelOrder(root);

    }

    /**
     * Treeyi level order ekrana basar.
     * @param local
     */
    private void levelOrder(Node<E> local) {
        if (local == null)
            return;

        System.out.printf(local.data+ ",");

        if (local.left != null){
            levelOrder(local.left);
        }
        if (local.right != null)
            levelOrder(local.right);
    }

    /**
     * Treeyi preorder arar sting generate eder.
     */
    public String preOrder(){
        if (root == null)
            return null;
        else return preOrder(root);
    }

    /**
     * Treeyi preorder arar sting generate eder.
     * @param local
     * @return String
     */
    private String preOrder(Node<E> local){
        String str = local.data.toString();
        if (local.left == null && local.right == null){
            return local.data.toString();
        }
        if (local.right != null)
        {
            str +=  " "+preOrder(local.right);
        }
        if (local.left != null){
            str += " "+preOrder(local.left);
        }
        return str;
    }


    /**
     * Tree yi ekrana bastirir.
     */
    public void displayTree()
    {
        Stack<Node> stack = new Stack();
        stack.push(root);
        int emptyLeaf = 64;
        boolean isnull = false;
        System.out.println();
        while(isnull==false)
        {

            Stack tempstack = new Stack();
            isnull = true;
            for(int j=0; j<emptyLeaf; j++)
                System.out.print(' ');
            while(stack.isEmpty()==false)
            {
                Node temp = stack.pop();
                if(temp != null)
                {
                    System.out.print(temp.data);
                    tempstack.push(temp.left);
                    tempstack.push(temp.right);
                    if(temp.left != null ||temp.right != null)
                        isnull = false;
                }
                else
                {
                    System.out.print("null");
                    tempstack.push(null);
                    tempstack.push(null);
                }
                for(int j=0; j<emptyLeaf*2-2; j++)
                    System.out.print(' ');
            }
            System.out.println();
            emptyLeaf /= 2;
            while(tempstack.isEmpty()==false)
                stack.push((Node) tempstack.pop());
        }

    }

}

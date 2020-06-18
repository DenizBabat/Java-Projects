package part2;

import java.util.*;

/**
 * Multidemensianol düzlem
 * @param <E>
 */
public class MDS<E extends  Comparable<E>> extends BinaryTree {

    /**
     * kac boyultlu oldugunu tutan member
     */
    private int dimension;

    /**
     * Boyut arrayi ve buyot sayısını alir
     * @param points
     * @param dimens
     */
    public void add(ArrayList<E> points, int dimens){
        dimension = dimens;
        if (root == null)
            root = new Node(points);
        else
            root = add(root, points,dimens);
    }

    /**
     * private olup tree ya boyutları ekler
     * @param local
     * @param points
     * @param dimens
     * @return Node
     */
    private Node<ArrayList> add(Node<ArrayList> local, ArrayList<E> points, int dimens){
        if (local == null) {
            return new Node<ArrayList>(points);
        }
        ArrayList<E> temp = (ArrayList<E>) local.data;
        int coor = points.size()-dimens;
        --dimens;
        if (points.get(coor).compareTo(temp.get(coor))>0){
             local.right = add(local.right, points, dimens==0?dimension:dimens);
        }
        else //if (points.get(coor)<= points.get(coor))
        {
            local.left = add(local.left, points,dimens==0?dimension:dimens);
        }
        return local;
    }

    /**
     * Ekrana tree yi bastirir.
     */
    public void displayTree()
    {
        Stack<Node> stack = new Stack();
        stack.push(root);
        int emptyLeaf = 32;
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

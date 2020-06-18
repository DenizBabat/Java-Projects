package com.babatman;

import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;
import part1.GeneralTree;
import part2.MDS;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("PART 1 ");
        general();
        System.out.println();
        System.out.println("PART 2 ");
        multi();
    }

    public static void multi(){

        ArrayList<Integer> points = new ArrayList<>();
        MDS mds = new MDS();

        points.add(2);
        points.add(5);
        points.add(4);
        mds.add(points,3);
        points = new ArrayList<>();

        points.add(0);
        points.add(5);
        points.add(4);
        mds.add(points,3);
        points = new ArrayList<>();

        points.add(3);
        points.add(1);
        points.add(0);
        mds.add(points,3);
        points = new ArrayList<>();


        points.add(8);
        points.add(4);
        points.add(41);
        mds.add(points,3);
        points = new ArrayList<>();

        points.add(7);
        points.add(56);
        points.add(24);
        mds.add(points,3);
        points = new ArrayList<>();


        points.add(1);
        points.add(56);
        points.add(24);
        mds.add(points,3);
        points = new ArrayList<>();

        points.add(30);
        points.add(0);
        points.add(20);
        mds.add(points,3);
        points = new ArrayList<>();

        mds.displayTree();


    }

    public static void general(){
        GeneralTree mytree = new GeneralTree();

        System.out.println("====Binary Tree PreOrder traversal olarak ekrana bastırılmıştır.========");
        System.out.println("Add deniz fatih: "+mytree.addParentAndChild("deniz","fatih"));
        System.out.println(mytree.preOrder());

        System.out.println("Add deniz ahmet: "+mytree.addParentAndChild("deniz","ahmet"));
        System.out.println(mytree.preOrder());

        System.out.println("Add ahmet kamil: "+mytree.addParentAndChild("ahmet","kamil"));
        System.out.println(mytree.preOrder());

        System.out.println ("Add kamil pasa: " + mytree.addParentAndChild("kamil","pasa"));
        System.out.println(mytree.preOrder());

        System.out.println("Add kamil dede: "+mytree.addParentAndChild("kamil","dede"));
        System.out.println(mytree.preOrder());

        System.out.println("Add kamil kaya: "+mytree.addParentAndChild("kamil","kaya"));
        System.out.println(mytree.preOrder());

        System.out.println("Add fatih kazım: "+mytree.addParentAndChild("fatih","kazım"));
        System.out.println(mytree.preOrder());

        System.out.println("Add fatih berk: "+mytree.addParentAndChild("fatih","berk"));
        System.out.println(mytree.preOrder());

        System.out.println("kazım mehmet: "+mytree.addParentAndChild("kazım","mehmet"));
        System.out.println(mytree.preOrder());

        System.out.println("berk einstein: "+mytree.addParentAndChild("berk","einstein"));
        System.out.println(mytree.preOrder());

        System.out.println("einstein kane: "+mytree.addParentAndChild("einstein","kane"));
        System.out.println(mytree.preOrder());

        System.out.println("Add einstein aslan: "+mytree.addParentAndChild("einstein","aslan"));
        System.out.println(mytree.preOrder());

        System.out.println("fatih ahmet: "+mytree.addParentAndChild("hasan","kadir"));
        System.out.println(mytree.preOrder());
        System.out.println();
        mytree.displayTree();
        System.out.println();
        System.out.println();

        System.out.println("====LEVELORDER TRAVERSAL====");
        mytree.levelorder();
        System.out.println();

        System.out.println("====PREORDER TRAVERSAL====");
        System.out.println(mytree.preOrder());
        System.out.println();

        System.out.println("====POSTORDER TRAVERSAL====");
        List<String> list =  mytree.postorderTraversal();
        for (int i = 0; i < list.size(); i++) {
            System.out.printf(list.get(i).toString()+" ");
        }

        System.out.println();
    }


}

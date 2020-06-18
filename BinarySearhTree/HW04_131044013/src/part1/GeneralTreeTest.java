package part1;

import java.util.List;

import static org.junit.Assert.*;

public class GeneralTreeTest {
    @org.junit.Test
    public void addParentAndChild() throws Exception {

        GeneralTree mytree = new GeneralTree();

        System.out.println("====Binary Tree PreOrder traversal olarak ekrana bastırılmıştır.========");
        System.out.println("Add deniz fatih: "+mytree.addParentAndChild("deniz","fatih"));
        System.out.println(mytree.preOrder());

        System.out.println("Add deniz ahmet: "+mytree.addParentAndChild("deniz","ahmet"));
        System.out.println(mytree.preOrder());

        System.out.println("Add ahmet kamil: "+mytree.addParentAndChild("ahmet","kamil"));
        System.out.println(mytree.preOrder());

    }

    @org.junit.Test
    public void postorderTraversal() throws Exception {
        GeneralTree mytree = new GeneralTree();
        System.out.println("Add deniz fatih: "+mytree.addParentAndChild("deniz","fatih"));

        System.out.println("Add deniz ahmet: "+mytree.addParentAndChild("deniz","ahmet"));

        System.out.println("Add ahmet kamil: "+mytree.addParentAndChild("ahmet","kamil"));

        System.out.println ("Add kamil pasa: " + mytree.addParentAndChild("kamil","pasa"));

        System.out.println("Add kamil dede: "+mytree.addParentAndChild("kamil","dede"));

        System.out.println("Add kamil kaya: "+mytree.addParentAndChild("kamil","kaya"));

        System.out.println("Add fatih kazım: "+mytree.addParentAndChild("fatih","kazım"));

        System.out.println("Add fatih berk: "+mytree.addParentAndChild("fatih","berk"));

        System.out.println("kazım mehmet: "+mytree.addParentAndChild("kazım","mehmet"));

        System.out.println("berk einstein: "+mytree.addParentAndChild("berk","einstein"));

        System.out.println("einstein kane: "+mytree.addParentAndChild("einstein","kane"));

        System.out.println("Add einstein aslan: "+mytree.addParentAndChild("einstein","aslan"));

        System.out.println("fatih ahmet: "+mytree.addParentAndChild("hasan","kadir"));


        System.out.println("====POSTORDER TRAVERSAL====");
        List<String> list =  mytree.postorderTraversal();
        for (int i = 0; i < list.size(); i++) {
            System.out.printf(list.get(i).toString()+" ");
        }

    }

    @org.junit.Test
    public void levelorder() throws Exception {
        GeneralTree mytree = new GeneralTree();
        System.out.println("Add deniz fatih: "+mytree.addParentAndChild("deniz","fatih"));

        System.out.println("Add deniz ahmet: "+mytree.addParentAndChild("deniz","ahmet"));

        System.out.println("Add ahmet kamil: "+mytree.addParentAndChild("ahmet","kamil"));

        System.out.println ("Add kamil pasa: " + mytree.addParentAndChild("kamil","pasa"));

        System.out.println("Add kamil dede: "+mytree.addParentAndChild("kamil","dede"));

        System.out.println("Add kamil kaya: "+mytree.addParentAndChild("kamil","kaya"));

        System.out.println("Add fatih kazım: "+mytree.addParentAndChild("fatih","kazım"));

        System.out.println("Add fatih berk: "+mytree.addParentAndChild("fatih","berk"));

        System.out.println("kazım mehmet: "+mytree.addParentAndChild("kazım","mehmet"));

        System.out.println("berk einstein: "+mytree.addParentAndChild("berk","einstein"));

        System.out.println("einstein kane: "+mytree.addParentAndChild("einstein","kane"));

        System.out.println("Add einstein aslan: "+mytree.addParentAndChild("einstein","aslan"));

        System.out.println("fatih ahmet: "+mytree.addParentAndChild("hasan","kadir"));
        System.out.println("====LEVELORDER TRAVERSAL====");
        mytree.levelorder();
        System.out.println();

    }

    @org.junit.Test
    public void preOrder() throws Exception {

        GeneralTree mytree = new GeneralTree();
        System.out.println("Add deniz fatih: "+mytree.addParentAndChild("deniz","fatih"));

        System.out.println("Add deniz ahmet: "+mytree.addParentAndChild("deniz","ahmet"));

        System.out.println("Add ahmet kamil: "+mytree.addParentAndChild("ahmet","kamil"));

        System.out.println ("Add kamil pasa: " + mytree.addParentAndChild("kamil","pasa"));

        System.out.println("Add kamil dede: "+mytree.addParentAndChild("kamil","dede"));

        System.out.println("Add kamil kaya: "+mytree.addParentAndChild("kamil","kaya"));

        System.out.println("Add fatih kazım: "+mytree.addParentAndChild("fatih","kazım"));

        System.out.println("Add fatih berk: "+mytree.addParentAndChild("fatih","berk"));

        System.out.println("kazım mehmet: "+mytree.addParentAndChild("kazım","mehmet"));

        System.out.println("berk einstein: "+mytree.addParentAndChild("berk","einstein"));

        System.out.println("einstein kane: "+mytree.addParentAndChild("einstein","kane"));

        System.out.println("Add einstein aslan: "+mytree.addParentAndChild("einstein","aslan"));

        System.out.println("fatih ahmet: "+mytree.addParentAndChild("hasan","kadir"));

        System.out.println("====PREORDER TRAVERSAL====");
        System.out.println(mytree.preOrder());
        System.out.println();
    }

}
import org.omg.PortableInterceptor.INACTIVE;

import javax.sound.midi.Soundbank;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

   // doesBinaryTreeisAvlTree();
    avltreetestfunc();
    }

    public static void doesBinaryTreeisAvlTree(){

        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        System.out.println("Dengeli bir BinarySearchTree oluşturup AVLTree'nin Constructurına verip AVLTreeolup olmadığını bulacağım");
        bst.add(10);
        bst.add(5);
        bst.add(4);
        bst.add(6);
        bst.add(15);
        bst.add(12);
        bst.add(17);
        System.out.println(bst.toString());
        System.out.println("Dengeli bir Tree oluşturuldu.Şimdi AVLTRee'nin Constructorına veriyorum: SONUÇ;");
        AVLTree<Integer> avlTree  = new AVLTree<>(bst);

        System.out.println("=====================================================================================================================================");
        System.out.println("Şimdi de dengesiz bir binarySearhTree oluşturup AVLTree olup olmadığına bakalım. ");
        BinarySearchTree<Integer> bst_2 = new BinarySearchTree<>();
        bst_2.add(1);
        bst_2.add(2);
        bst_2.add(3);
        bst_2.add(4);
        bst_2.add(5);
        bst_2.add(6);
        bst_2.add(7);
        bst_2.add(8);
        bst_2.add(9);
        System.out.println(bst_2.toString());
        System.out.println("Dengesiz bir Tree oluşturuldu.Şimdi AVLTRee'nin Constructorına veriyorum: SONUÇ;");
        AVLTree<Integer>avl_2 = new AVLTree<>(bst_2);


    }

    public static void avltreetestfunc(){
        System.out.println("A)  Left Left Case");

        AVLTree<Integer> ll = new AVLTree<>();

        System.out.println("T1, T2, T3 and T4 are subtrees.\n" +
                "         z                                      y \n" +
                "        / \\                                   /   \\\n" +
                "       y   T4      Right Rotate (z)          x      z\n" +
                "      / \\          - - - - - - - - ->      /  \\    /  \\ \n" +
                "     x   T3                               T1  T2  T3  T4\n" +
                "    / \\\n" +
                "  T1   T2");

        System.out.println("Şimdi böyle bir Tree oluşturacam Ama sonucu ekranda gösterebilirim. Hocam anlayın. (*_*)");

        ll.add(10);
        ll.add(11);
        ll.add(7);
        ll.add(8);
        ll.add(4);
        ll.add(2);
        ll.add(5);

        System.out.println(ll.toString());
        System.out.println("Görüldüğü gibi dengededir.");
        System.out.println("===========================================================================================");
        System.out.println("B) Left Right Case");
        AVLTree<Integer> lr = new AVLTree<Integer>();
        System.out.println("    z                               z                           x\n" +
                "    / \\                            /   \\                        /  \\ \n" +
                "   y   T4  Left Rotate (y)        x    T4  Right Rotate(z)    y      z\n" +
                "  / \\      - - - - - - - - ->    /  \\      - - - - - - - ->  / \\    / \\\n" +
                "T1   x                          y    T3                    T1  T2 T3  T4\n" +
                "    / \\                        / \\\n" +
                "  T2   T3                    T1   T2");


        System.out.println("Şimdi böyle bir Tree oluşturacam Ama sonucu ekranda gösterebilirim.");
        lr.add(10);
        lr.add(11);
        lr.add(5);
        lr.add(2);
        lr.add(8);
        lr.add(7);
        lr.add(9);
        System.out.println(lr.toString());
        System.out.println("Görüldüğü gibi dengededir.");
        System.out.println("===========================================================================================");
        System.out.println("C) Right Right Case");
        AVLTree<Integer> rr = new AVLTree<>();
        System.out.println(" z                                y\n" +
                " /  \\                            /   \\ \n" +
                "T1   y     Left Rotate(z)       z      x\n" +
                "    /  \\   - - - - - - - ->    / \\    / \\\n" +
                "   T2   x                     T1  T2 T3  T4\n" +
                "       / \\\n" +
                "     T3  T4");

        System.out.println("Şimdi böyle bir Tree oluşturacam Ama sonucu ekranda gösterebilirim.");
        rr.add(5);
        rr.add(4);
        rr.add(15);
        rr.add(13);
        rr.add(18);
        rr.add(17);
        rr.add(19);
        System.out.println(rr.toString());
        System.out.println("Görüldüğü gibi dengededir.");
        System.out.println("===========================================================================================");
        System.out.println("D) Right Left Case");
        AVLTree<Integer> rl = new AVLTree<>();
        System.out.println("  z                            z                            x\n" +
                "  / \\                          / \\                          /  \\ \n" +
                "T1   y   Right Rotate (y)    T1   x      Left Rotate(z)   z      y\n" +
                "    / \\  - - - - - - - - ->     /  \\   - - - - - - - ->  / \\    / \\\n" +
                "   x   T4                      T2   y                  T1  T2  T3  T4\n" +
                "  / \\                              /  \\\n" +
                "T2   T3                           T3   T4");

        System.out.println("Şimdi böyle bir Tree oluşturacam Ama sonucu ekranda gösterebilirim.");

        rl.add(5);
        rl.add(4);
        rl.add(15);
        rl.add(10);
        rl.add(17);
        rl.add(8);
        rl.add(12);
        System.out.println(rl.toString());
        System.out.println("Görüldüğü gibi bu tree de dengededir. Yani DURUMLAR BAŞARILIDIR.");
        System.out.println("===========================================================================================");


    }
}

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        System.out.println("TEST 1");
        test1();
        System.out.println();

        System.out.println("TEST 2");
        test2();
        System.out.println();

    }
    public static void test2(){
        RedBlackTree<Integer> red = new RedBlackTree<>();

        for (int i = 15; i > 0; i--) {

            System.out.println("===============================================================");
            red.add(i);
            System.out.println(red.toString());
        }

    }

    public static void test1(){
        RedBlackTree<Integer> red = new RedBlackTree<>();

        for (int i = 0; i < 15; i++) {
            System.out.println("===============================================================");
            red.add(i);
            System.out.println(red.toString());
        }
    }
}

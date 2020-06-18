

public class Main {

    public static void main(String[] args) {

        System.out.println("TEST 1");
        test1();
        System.out.println();
        System.out.println();
        System.out.println("TEST 2");
        test2();
    }

    public static void test2(){
        BTree<Integer> bt = new BTree<>(3); // ^aynı node da bulunan array size'i dır.

        bt.add(12);
        bt.add(25);
        bt.add(23);
        bt.add(11);
        bt.add(226);
        bt.add(725);
        bt.add(220);
        bt.add(1);
        bt.add(88);
        bt.add(33);
        bt.add(5);

        System.out.println( bt.toString());
        System.out.println("Tree de olan sayıları arayalım bulabilecek miyiz?");
        System.out.println("12 is searching: "+ bt.find(12));
        System.out.println("33 is searching: "+ bt.find(33));
        System.out.println("11 is searching: "+ bt.find(11));

        System.out.println("Tree de olmayan bir sayı arayalım bulabilecek miyiz?");
        System.out.println("785 is searching: "+ bt.find(785));


    }

    public static void test1(){
        BTree<Integer> bt = new BTree<>(3); // ^aynı node da bulunan array size'i dır.

        bt.add(54);
        bt.add(62);
        bt.add(2);
        bt.add(1);
        bt.add(26);
        bt.add(425);
        bt.add(22);
        bt.add(11);
        bt.add(8);
        bt.add(36);
        bt.add(65);
        System.out.println( bt.toString());

        System.out.println( bt.toString());
        System.out.println("Tree de olan sayıları arayalım bulabilecek miyiz?");
        System.out.println("1 is searching: "+ bt.find(1));
        System.out.println("22 is searching: "+ bt.find(22));
        System.out.println("65 is searching: "+ bt.find(65));

        System.out.println("Tree de olmayan bir sayı arayalım bulabilecek miyiz?");
        System.out.println("18 is searching: "+ bt.find(18));
    }
}

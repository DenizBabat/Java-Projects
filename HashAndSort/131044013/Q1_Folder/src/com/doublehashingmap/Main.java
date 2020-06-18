package com.doublehashingmap;

public class Main {

    public static void main(String[] args) {

        System.out.println("1. HASH SQUENCE");
        hashfoo1();;

        System.out.println();

        System.out.println("1. HASH SQUENCE");
        hashfoo2();

    }
    public static void hashfoo2(){

        DoubleHashingMap<Integer, String> hash = new DoubleHashingMap<>();

        hash.put(432,"python");
        System.out.println(hash.get(432));
        hash.put(4534,"groovy");
        System.out.println(hash.get(4534));
        hash.put(3454,"go");
        System.out.println(hash.get(3454));
        hash.put(45346,"ajax");
        System.out.println(hash.get(45346));
        hash.put(45352,"javascript");
        System.out.println(hash.get(45352));
        hash.put(45436,"Arduino");
        System.out.println(hash.get(45436));
        hash.put(45354,"swift");
        System.out.println(hash.get(45354));
        hash.put(45345,"html");
        System.out.println(hash.get(45345));
        hash.put(45345,"php");
        System.out.println(hash.get(45345));
        hash.put(45433,"c#");
        System.out.println(hash.get(45433));
        hash.put(543,"scalla");
        System.out.println(hash.get(543));
        hash.put(54645,"d");
        System.out.println(hash.get(54645));
    }

    public static void hashfoo1(){
        DoubleHashingMap<Integer, String> hash = new DoubleHashingMap<>();

        hash.put(2,"aspx");
        System.out.println(hash.get(2));
        hash.put(22,"java");
        System.out.println(hash.get(22));
        hash.put(3,"c++");
        System.out.println(hash.get(3));
        hash.put(148,"c");
        System.out.println(hash.get(148));
        hash.put(64,"aspx");
        System.out.println(hash.get(64));
        hash.put(451,"ruby");
        System.out.println(hash.get(451));
        hash.put(156,"coffee");
        System.out.println(hash.get(156));
        hash.put(74,".net");
        System.out.println(hash.get(74));
        hash.put(185,"sql");
        System.out.println(hash.get(185));
        hash.put(161,"oracle");
        System.out.println(hash.get(161));
        hash.put(418,"sunny");
        System.out.println(hash.get(418));
        hash.put(16,"sony");
        System.out.println(hash.get(16));
    }
}

import java.util.Random;

public class Main {

    public static void main(String[] args){
      /*  LinkedList list = new LinkedList();

        list.add(2);
        list.add(5);
        list.add(3);

        LinkedList.Node node = null;
        node = list.mergeSort(list.getHead());
        System.out.println("Linked list after sorting :");
        list.print(node);*/

        long start, end;
        int size1=100, size2=1000, size3=5000, size4=10000;
        LinkedList list = new LinkedList();
        Random rand = new Random();


        for (int i = 0; i < size1; i++) {
            list.add(rand.nextInt(101)+1);
            //   System.out.println(arr[i]);
        }
        start = System.nanoTime();
        list.mergeSort(list.getHead());
        end = System.nanoTime();
        System.out.println("DLL MERGE SORT "+ size1+": "+(end-start));


        list = new LinkedList();
        for (int i = 0; i < size2; i++) {
            list.add(rand.nextInt(101)+1);
            //   System.out.println(arr[i]);
        }
        start = System.nanoTime();
        list.mergeSort(list.getHead());
        end = System.nanoTime();
        System.out.println("DLL MERGE SORT "+ size2+": "+(end-start));


        list = new LinkedList();
        for (int i = 0; i < size3; i++) {
            list.add(rand.nextInt(101)+1);
            //   System.out.println(arr[i]);
        }
        start = System.nanoTime();
        list.mergeSort(list.getHead());
        end = System.nanoTime();
        System.out.println("DLL MERGE SORT "+ size3+": "+(end-start));


        list = new LinkedList();
        for (int i = 0; i < size4; i++) {
            list.add(rand.nextInt(101)+1);
            //   System.out.println(arr[i]);
        }
        start = System.nanoTime();
        list.mergeSort(list.getHead());
        end = System.nanoTime();
        System.out.println("DLL MERGE SORT "+ size4+": "+(end-start));

    }

}

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        System.out.println(" PERFORMANCE ANALİZİ");
        System.out.println();

        System.out.println("============insertion sort============");
        insertion();
        System.out.println("============merge sort============");
        merge();
        System.out.println("============quick sort============");
        quick();
        System.out.println("============Heap sort============");
        Heap();
    }

    public static void Heap(){
        long start, end;
        int size1=100, size2=1000, size3=5000, size4=10000;
        Integer[] arr = new Integer[size1];
        Random rand = new Random();
        for (int i = 0; i < size1; i++) {
            arr[i] = rand.nextInt(101)+1;
            //   System.out.println(arr[i]);
        }
        start = System.nanoTime();
        HeapSort.sort(arr);
        end = System.nanoTime();
        System.out.println("Heap sort 100: "+(end-start));

        arr = new Integer[size2];
        for (int i = 0; i < size2; i++) {
            arr[i] = rand.nextInt(101)+1;
            //   System.out.println(arr[i]);
        }
        start = System.nanoTime();
        HeapSort.sort(arr);
        end = System.nanoTime();
        System.out.println("Heap sort 1000: "+(end-start));

        arr = new Integer[size3];
        for (int i = 0; i < size3; i++) {
            arr[i] = rand.nextInt(101)+1;
            //   System.out.println(arr[i]);
        }
        start = System.nanoTime();
        HeapSort.sort(arr);
        end = System.nanoTime();
        System.out.println("Heap sort 5000: "+(end-start));


        arr = new Integer[size4];
        for (int i = 0; i < size4; i++) {
            arr[i] = rand.nextInt(101)+1;
            //   System.out.println(arr[i]);
        }

        start = System.nanoTime();
        HeapSort.sort(arr);
        end = System.nanoTime();
        System.out.println("Heap sort 10000: "+(end-start));
    }

    public static void quick(){
        long start, end;
        int size1=100, size2=1000, size3=5000, size4=10000;
        Integer[] arr = new Integer[size1];
        Random rand = new Random();
        for (int i = 0; i < size1; i++) {
            arr[i] = rand.nextInt(101)+1;
            //   System.out.println(arr[i]);
        }
        start = System.nanoTime();
        QuickSort.sort(arr);
        end = System.nanoTime();
        System.out.println("Quick sort 100: "+(end-start));

        arr = new Integer[size2];
        for (int i = 0; i < size2; i++) {
            arr[i] = rand.nextInt(101)+1;
            //   System.out.println(arr[i]);
        }
        start = System.nanoTime();
        QuickSort.sort(arr);
        end = System.nanoTime();
        System.out.println("Quick sort 1000: "+(end-start));

        arr = new Integer[size3];
        for (int i = 0; i < size3; i++) {
            arr[i] = rand.nextInt(101)+1;
            //   System.out.println(arr[i]);
        }
        start = System.nanoTime();
        QuickSort.sort(arr);
        end = System.nanoTime();
        System.out.println("Quick sort 5000: "+(end-start));


        arr = new Integer[size4];
        for (int i = 0; i < size4; i++) {
            arr[i] = rand.nextInt(101)+1;
            //   System.out.println(arr[i]);
        }

        start = System.nanoTime();
        QuickSort.sort(arr);
        end = System.nanoTime();
        System.out.println("Quick sort 10000: "+(end-start));
    }

    public static void merge(){
        long start, end;
        int size1=100, size2=1000, size3=5000, size4=10000;
        Integer[] arr = new Integer[size1];
        Random rand = new Random();
        for (int i = 0; i < size1; i++) {
            arr[i] = rand.nextInt(101)+1;
            //   System.out.println(arr[i]);
        }
        start = System.nanoTime();
        MergeSort.sort(arr);
        end = System.nanoTime();
        System.out.println("Merge sort 100: "+(end-start));

        arr = new Integer[size2];
        for (int i = 0; i < size2; i++) {
            arr[i] = rand.nextInt(101)+1;
            //   System.out.println(arr[i]);
        }
        start = System.nanoTime();
        MergeSort.sort(arr);
        end = System.nanoTime();
        System.out.println("Merge sort 1000: "+(end-start));

        arr = new Integer[size3];
        for (int i = 0; i < size3; i++) {
            arr[i] = rand.nextInt(101)+1;
            //   System.out.println(arr[i]);
        }
        start = System.nanoTime();
        MergeSort.sort(arr);
        end = System.nanoTime();
        System.out.println("Merge sort 5000: "+(end-start));


        arr = new Integer[size4];
        for (int i = 0; i < size4; i++) {
            arr[i] = rand.nextInt(101)+1;
            //   System.out.println(arr[i]);
        }

        start = System.nanoTime();
        MergeSort.sort(arr);
        end = System.nanoTime();
        System.out.println("Merge sort 10000: "+(end-start));
    }

    public static void insertion(){
        long start, end;
        int size1=100, size2=1000, size3=5000, size4=10000;
        Integer[] arr = new Integer[size1];
        Random rand = new Random();
        for (int i = 0; i < size1; i++) {
            arr[i] = rand.nextInt(101)+1;
            //   System.out.println(arr[i]);
        }
        start = System.nanoTime();
        InsertionSort.sort(arr);
        end = System.nanoTime();
        System.out.println("Insertion sort 100: "+(end-start));

        arr = new Integer[size2];
        for (int i = 0; i < size2; i++) {
            arr[i] = rand.nextInt(101)+1;
            //   System.out.println(arr[i]);
        }
        start = System.nanoTime();
        InsertionSort.sort(arr);
        end = System.nanoTime();
        System.out.println("Insertion sort 1000: "+(end-start));

        arr = new Integer[size3];
        for (int i = 0; i < size3; i++) {
            arr[i] = rand.nextInt(101)+1;
            //   System.out.println(arr[i]);
        }
        start = System.nanoTime();
        InsertionSort.sort(arr);
        end = System.nanoTime();
        System.out.println("Insertion sort 5000: "+(end-start));


        arr = new Integer[size4];
        for (int i = 0; i < size4; i++) {
            arr[i] = rand.nextInt(101)+1;
            //   System.out.println(arr[i]);
        }

        start = System.nanoTime();
        InsertionSort.sort(arr);
        end = System.nanoTime();
        System.out.println("Insertion sort 10000: "+(end-start));
    }
}

import com.sun.scenario.effect.Merge;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {



        System.out.println("============insertion sort============");
        insertion();
        System.out.println("============merge sort============");
        merge();
        System.out.println("============quick sort============");
        quick();
        System.out.println("============Heap sort============");
        heap();
    }

    public static void heap(){
        long start, end;
        int size1=10, size2=100, size3=500, size4=1000, size5 = 1500,size6 = 2000,
                size7=300, size8= 4500, size9=6500, size10=10000;
        Integer[] arr = new Integer[size1];
        Random rand = new Random();
        for (int i = 0; i < size1; i++) {
            arr[i] = rand.nextInt(101)+1;
            //   System.out.println(arr[i]);
        }
        start = System.nanoTime();
        HeapSort.sort(arr);
        end = System.nanoTime();
        System.out.println("Heap sort "+ size1+": "+(end-start));

        arr = new Integer[size2];
        for (int i = 0; i < size2; i++) {
            arr[i] = rand.nextInt(101)+1;
            //   System.out.println(arr[i]);
        }
        start = System.nanoTime();
        HeapSort.sort(arr);
        end = System.nanoTime();
        System.out.println("Heap sort "+ size2+": "+(end-start));

        arr = new Integer[size3];
        for (int i = 0; i < size3; i++) {
            arr[i] = rand.nextInt(101)+1;
            //   System.out.println(arr[i]);
        }
        start = System.nanoTime();
        HeapSort.sort(arr);
        end = System.nanoTime();
        System.out.println("Heap sort "+ size3+": "+(end-start));


        arr = new Integer[size4];
        for (int i = 0; i < size4; i++) {
            arr[i] = rand.nextInt(101)+1;
            //   System.out.println(arr[i]);
        }

        start = System.nanoTime();
        HeapSort.sort(arr);
        end = System.nanoTime();
        System.out.println("Heap sort "+ size4+": "+(end-start));

        arr = new Integer[size5];
        for (int i = 0; i < size5; i++) {
            arr[i] = rand.nextInt(101)+1;
            //   System.out.println(arr[i]);
        }

        start = System.nanoTime();
        HeapSort.sort(arr);
        end = System.nanoTime();
        System.out.println("Heap sort "+ size5+": "+(end-start));

        arr = new Integer[size6];
        for (int i = 0; i < size6; i++) {
            arr[i] = rand.nextInt(101)+1;
            //   System.out.println(arr[i]);
        }

        start = System.nanoTime();
        HeapSort.sort(arr);
        end = System.nanoTime();
        System.out.println("Heap sort "+ size6+": "+(end-start));

        arr = new Integer[size7];
        for (int i = 0; i < size7; i++) {
            arr[i] = rand.nextInt(101)+1;
            //   System.out.println(arr[i]);
        }

        start = System.nanoTime();
        HeapSort.sort(arr);
        end = System.nanoTime();
        System.out.println("Heap sort "+ size7+": "+(end-start));

        arr = new Integer[size8];
        for (int i = 0; i < size8; i++) {
            arr[i] = rand.nextInt(101)+1;
            //   System.out.println(arr[i]);
        }

        start = System.nanoTime();
        HeapSort.sort(arr);
        end = System.nanoTime();
        System.out.println("Heap sort "+ size8+": "+(end-start));


        arr = new Integer[size9];
        for (int i = 0; i < size9; i++) {
            arr[i] = rand.nextInt(101)+1;
            //   System.out.println(arr[i]);
        }

        start = System.nanoTime();
        HeapSort.sort(arr);
        end = System.nanoTime();
        System.out.println("Heap sort "+ size9+": "+(end-start));

        arr = new Integer[size10];
        for (int i = 0; i < size10; i++) {
            arr[i] = rand.nextInt(101)+1;
            //   System.out.println(arr[i]);
        }

        start = System.nanoTime();
        HeapSort.sort(arr);
        end = System.nanoTime();
        System.out.println("Heap sort "+ size10+": "+(end-start));

    }

    public static void quick(){
        long start, end;
        int size1=10, size2=100, size3=500, size4=1000, size5 = 1500,size6 = 2000,
                size7=300, size8= 4500, size9=6500, size10=10000;
        Integer[] arr = new Integer[size1];
        Random rand = new Random();
        for (int i = 0; i < size1; i++) {
            arr[i] = rand.nextInt(101)+1;
            //   System.out.println(arr[i]);
        }
        start = System.nanoTime();
        QuickSort.sort(arr);
        end = System.nanoTime();
        System.out.println("Quick sort "+ size1+": "+(end-start));

        arr = new Integer[size2];
        for (int i = 0; i < size2; i++) {
            arr[i] = rand.nextInt(101)+1;
            //   System.out.println(arr[i]);
        }
        start = System.nanoTime();
        QuickSort.sort(arr);
        end = System.nanoTime();
        System.out.println("Quick sort "+ size2+": "+(end-start));

        arr = new Integer[size3];
        for (int i = 0; i < size3; i++) {
            arr[i] = rand.nextInt(101)+1;
            //   System.out.println(arr[i]);
        }
        start = System.nanoTime();
        QuickSort.sort(arr);
        end = System.nanoTime();
        System.out.println("Quick sort "+ size3+": "+(end-start));


        arr = new Integer[size4];
        for (int i = 0; i < size4; i++) {
            arr[i] = rand.nextInt(101)+1;
            //   System.out.println(arr[i]);
        }

        start = System.nanoTime();
        QuickSort.sort(arr);
        end = System.nanoTime();
        System.out.println("Quick sort "+ size4+": "+(end-start));

        arr = new Integer[size5];
        for (int i = 0; i < size5; i++) {
            arr[i] = rand.nextInt(101)+1;
            //   System.out.println(arr[i]);
        }

        start = System.nanoTime();
        QuickSort.sort(arr);
        end = System.nanoTime();
        System.out.println("Quick sort "+ size5+": "+(end-start));

        arr = new Integer[size6];
        for (int i = 0; i < size6; i++) {
            arr[i] = rand.nextInt(101)+1;
            //   System.out.println(arr[i]);
        }

        start = System.nanoTime();
        QuickSort.sort(arr);
        end = System.nanoTime();
        System.out.println("Quick sort "+ size6+": "+(end-start));

        arr = new Integer[size7];
        for (int i = 0; i < size7; i++) {
            arr[i] = rand.nextInt(101)+1;
            //   System.out.println(arr[i]);
        }

        start = System.nanoTime();
        QuickSort.sort(arr);
        end = System.nanoTime();
        System.out.println("Quick sort "+ size7+": "+(end-start));

        arr = new Integer[size8];
        for (int i = 0; i < size8; i++) {
            arr[i] = rand.nextInt(101)+1;
            //   System.out.println(arr[i]);
        }

        start = System.nanoTime();
        QuickSort.sort(arr);
        end = System.nanoTime();
        System.out.println("Quick sort "+ size8+": "+(end-start));


        arr = new Integer[size9];
        for (int i = 0; i < size9; i++) {
            arr[i] = rand.nextInt(101)+1;
            //   System.out.println(arr[i]);
        }

        start = System.nanoTime();
        QuickSort.sort(arr);
        end = System.nanoTime();
        System.out.println("Quick sort "+ size9+": "+(end-start));

        arr = new Integer[size10];
        for (int i = 0; i < size10; i++) {
            arr[i] = rand.nextInt(101)+1;
            //   System.out.println(arr[i]);
        }

        start = System.nanoTime();
        QuickSort.sort(arr);
        end = System.nanoTime();
        System.out.println("Quick sort "+ size10+": "+(end-start));
    }

    public static void merge(){
        long start, end;
        int size1=10, size2=100, size3=500, size4=1000, size5 = 1500,size6 = 2000,
                size7=300, size8= 4500, size9=6500, size10=10000;
        Integer[] arr = new Integer[size1];
        Random rand = new Random();
        for (int i = 0; i < size1; i++) {
            arr[i] = rand.nextInt(101)+1;
            //   System.out.println(arr[i]);
        }
        start = System.nanoTime();
        MergeSort.sort(arr);
        end = System.nanoTime();
        System.out.println("Merge sort "+ size1+": "+(end-start));

        arr = new Integer[size2];
        for (int i = 0; i < size2; i++) {
            arr[i] = rand.nextInt(101)+1;
            //   System.out.println(arr[i]);
        }
        start = System.nanoTime();
        MergeSort.sort(arr);
        end = System.nanoTime();
        System.out.println("Merge sort "+ size2+": "+(end-start));

        arr = new Integer[size3];
        for (int i = 0; i < size3; i++) {
            arr[i] = rand.nextInt(101)+1;
            //   System.out.println(arr[i]);
        }
        start = System.nanoTime();
        MergeSort.sort(arr);
        end = System.nanoTime();
        System.out.println("Merge sort "+ size3+": "+(end-start));


        arr = new Integer[size4];
        for (int i = 0; i < size4; i++) {
            arr[i] = rand.nextInt(101)+1;
            //   System.out.println(arr[i]);
        }

        start = System.nanoTime();
        MergeSort.sort(arr);
        end = System.nanoTime();
        System.out.println("Merge sort "+ size4+": "+(end-start));

        arr = new Integer[size5];
        for (int i = 0; i < size5; i++) {
            arr[i] = rand.nextInt(101)+1;
            //   System.out.println(arr[i]);
        }

        start = System.nanoTime();
        MergeSort.sort(arr);
        end = System.nanoTime();
        System.out.println("Merge sort "+ size5+": "+(end-start));

        arr = new Integer[size6];
        for (int i = 0; i < size6; i++) {
            arr[i] = rand.nextInt(101)+1;
            //   System.out.println(arr[i]);
        }

        start = System.nanoTime();
        MergeSort.sort(arr);
        end = System.nanoTime();
        System.out.println("Merge sort "+ size6+": "+(end-start));

        arr = new Integer[size7];
        for (int i = 0; i < size7; i++) {
            arr[i] = rand.nextInt(101)+1;
            //   System.out.println(arr[i]);
        }

        start = System.nanoTime();
        MergeSort.sort(arr);
        end = System.nanoTime();
        System.out.println("Merge sort "+ size7+": "+(end-start));

        arr = new Integer[size8];
        for (int i = 0; i < size8; i++) {
            arr[i] = rand.nextInt(101)+1;
            //   System.out.println(arr[i]);
        }

        start = System.nanoTime();
        MergeSort.sort(arr);
        end = System.nanoTime();
        System.out.println("Merge sort "+ size8+": "+(end-start));


        arr = new Integer[size9];
        for (int i = 0; i < size9; i++) {
            arr[i] = rand.nextInt(101)+1;
            //   System.out.println(arr[i]);
        }

        start = System.nanoTime();
        MergeSort.sort(arr);
        end = System.nanoTime();
        System.out.println("Merge sort "+ size9+": "+(end-start));

        arr = new Integer[size10];
        for (int i = 0; i < size10; i++) {
            arr[i] = rand.nextInt(101)+1;
            //   System.out.println(arr[i]);
        }

        start = System.nanoTime();
        MergeSort.sort(arr);
        end = System.nanoTime();
        System.out.println("Merge sort "+ size10+": "+(end-start));
    }

    public static void insertion(){
        long start, end;
        int size1=10, size2=100, size3=500, size4=1000, size5 = 1500,size6 = 2000,
                size7=300, size8= 4500, size9=6500, size10=10000;
        Integer[] arr = new Integer[size1];
        Random rand = new Random();
        for (int i = 0; i < size1; i++) {
            arr[i] = rand.nextInt(101)+1;
            //   System.out.println(arr[i]);
        }
        start = System.nanoTime();
        InsertionSort.sort(arr);
        end = System.nanoTime();
        System.out.println("Insertion sort "+ size1+": "+(end-start));

        arr = new Integer[size2];
        for (int i = 0; i < size2; i++) {
            arr[i] = rand.nextInt(101)+1;
            //   System.out.println(arr[i]);
        }
        start = System.nanoTime();
        InsertionSort.sort(arr);
        end = System.nanoTime();
        System.out.println("Insertion sort "+ size2+": "+(end-start));

        arr = new Integer[size3];
        for (int i = 0; i < size3; i++) {
            arr[i] = rand.nextInt(101)+1;
            //   System.out.println(arr[i]);
        }
        start = System.nanoTime();
        InsertionSort.sort(arr);
        end = System.nanoTime();
        System.out.println("Insertion sort "+ size3+": "+(end-start));


        arr = new Integer[size4];
        for (int i = 0; i < size4; i++) {
            arr[i] = rand.nextInt(101)+1;
            //   System.out.println(arr[i]);
        }

        start = System.nanoTime();
        InsertionSort.sort(arr);
        end = System.nanoTime();
        System.out.println("Insertion sort "+ size4+": "+(end-start));

        arr = new Integer[size5];
        for (int i = 0; i < size5; i++) {
            arr[i] = rand.nextInt(101)+1;
            //   System.out.println(arr[i]);
        }

        start = System.nanoTime();
        InsertionSort.sort(arr);
        end = System.nanoTime();
        System.out.println("Insertion sort "+ size5+": "+(end-start));

        arr = new Integer[size6];
        for (int i = 0; i < size6; i++) {
            arr[i] = rand.nextInt(101)+1;
            //   System.out.println(arr[i]);
        }

        start = System.nanoTime();
        InsertionSort.sort(arr);
        end = System.nanoTime();
        System.out.println("Insertion sort "+ size6+": "+(end-start));

        arr = new Integer[size7];
        for (int i = 0; i < size7; i++) {
            arr[i] = rand.nextInt(101)+1;
            //   System.out.println(arr[i]);
        }

        start = System.nanoTime();
        InsertionSort.sort(arr);
        end = System.nanoTime();
        System.out.println("Insertion sort "+ size7+": "+(end-start));

        arr = new Integer[size8];
        for (int i = 0; i < size8; i++) {
            arr[i] = rand.nextInt(101)+1;
            //   System.out.println(arr[i]);
        }

        start = System.nanoTime();
        InsertionSort.sort(arr);
        end = System.nanoTime();
        System.out.println("Insertion sort "+ size8+": "+(end-start));


        arr = new Integer[size9];
        for (int i = 0; i < size9; i++) {
            arr[i] = rand.nextInt(101)+1;
            //   System.out.println(arr[i]);
        }

        start = System.nanoTime();
        InsertionSort.sort(arr);
        end = System.nanoTime();
        System.out.println("Insertion sort "+ size9+": "+(end-start));

        arr = new Integer[size10];
        for (int i = 0; i < size10; i++) {
            arr[i] = rand.nextInt(101)+1;
            //   System.out.println(arr[i]);
        }

        start = System.nanoTime();
        InsertionSort.sort(arr);
        end = System.nanoTime();
        System.out.println("Insertion sort "+ size10+": "+(end-start));
    }
}

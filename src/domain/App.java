package domain;

import sorting.algorithms.BucketSort;
import sorting.algorithms.MergeSort;
import sorting.algorithms.QuickSort;
import sorting.algorithms.RadixSort;

import java.util.Arrays;


public class App {
    public static void main(String[] args) {

        BucketSort bucketSort = new BucketSort();
        RadixSort radix = new RadixSort();


        int[] elementosDesordenados = {3,9,4,0,1,10,8,7,5,6,250, 2, 59, 60, 102, 560};

        int arr[] = {170, 45, 75, 90, 802, 24, 2, 66};
        int n = arr.length;
        System.out.println(Arrays.toString(radix.ordenar(arr)));
//
//        bucketSort.ordenar(elementosDesordenados);
//        System.out.println(Arrays.toString(elementosDesordenados));
    }
}

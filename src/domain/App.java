package domain;

import sorting.algorithms.BucketSort;
import sorting.algorithms.MergeSort;
import sorting.algorithms.QuickSort;

import java.util.Arrays;


public class App {
    public static void main(String[] args) {

        BucketSort bucketSort = new BucketSort();

        int[] elementosDesordenados = {3,9,4,0,1,10,8,7,5,6,2};
        bucketSort.ordenar(elementosDesordenados);
        System.out.println(Arrays.toString(elementosDesordenados));
    }
}

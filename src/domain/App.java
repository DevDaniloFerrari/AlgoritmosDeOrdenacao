package domain;

import sorting.algorithms.MergeSort;
import sorting.algorithms.QuickSort;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] elementosDesordenados = {3,9,4,0,1,10,8,7,5,6,2};
//        int[] elementosDesordenados = {51, 36, 23, 9, 2, 1, 27, 44, 63, 79, 82};

        int[] vetorAuxiliar = new int[elementosDesordenados.length];

        MergeSort mergeSort = new MergeSort();

        System.out.println("Teste merge sort");
        mergeSort.ordenar(elementosDesordenados, vetorAuxiliar, 0, elementosDesordenados.length -1);
        System.out.print(Arrays.toString(elementosDesordenados));
        System.out.println();
        System.out.println();

        System.out.println("Test quick sort");
        QuickSort q = new QuickSort();

        q.ordenar(elementosDesordenados, 0, elementosDesordenados.length-1);
        System.out.println(Arrays.toString(elementosDesordenados));
    }
}

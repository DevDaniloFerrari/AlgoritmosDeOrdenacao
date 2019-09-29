package domain;

import sorting.algorithms.HeapSort;

public class App {
    public static void main(String[] args) {
        HeapSort h = new HeapSort();

        int[] elementosOrdenados = {1,2,3,4,5,6,7,8,9,10};
//        int[] elementosDesordenados = {3,9,4,1,10,8,7,5,6,2};
        int[] elementosDesordenados = {50,201,73,24,13,200,14,7,8,2};


        System.out.print("Lista antes : ");

        for (int i : elementosDesordenados) {
            System.out.print(i+ " ");
        }

        System.out.println();

        System.out.print("Lista depois : ");

        h.ordenar(elementosDesordenados);

        for (int i : elementosDesordenados) {
            System.out.print(i+" ");
        }



    }
}

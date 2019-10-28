package sorting.algorithms;

import sorting.interfaces.ISort;

import java.util.LinkedList;

public class BucketSort implements ISort {

        InsertionSort insertionSort = new InsertionSort();

        @Override
        public int[] ordenar(int[] elementos){

            int maiorValor = 0;

            for (int i = 0; i < elementos.length; i++) {
                if (elementos[i] > maiorValor) {
                    maiorValor = elementos[i];
                }
            }

            int numBaldes = maiorValor/5;

            LinkedList[] B = new LinkedList[numBaldes];

            for (int i = 0; i < numBaldes; i++){
                B[i] = new LinkedList<Integer>();
            }

            for (int i = 0; i < elementos.length; i++) {
                int j = numBaldes-1;
                while (true){
                    if (j < 0){
                        break;
                    }
                    if (elementos[i] >= (j*5)) {
                        B[j].add(elementos[i]);
                        break;
                    }
                    j--;
                }
            }

            int indice = 0;
            for (int i = 0; i < numBaldes; i++){

                int[] aux = new int[B[i].size()];

                for (int j = 0; j < aux.length; j++){
                    aux[j] = (Integer)B[i].get(j);
                }

                 insertionSort.ordenar(aux);

                for (int j = 0; j < aux.length; j++, indice++){
                     elementos[indice] = aux[j];
                }

            }
            return elementos;

        }


}
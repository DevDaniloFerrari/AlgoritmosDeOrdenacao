package sorting.algorithms;

import sorting.interfaces.Sort;

public class QuickSort {

    public int[] ordenar(int[] elementos, int esquerda, int direita) {
        if (esquerda < direita) {
            int auxiliar = separarElementos(elementos, esquerda, direita);
            ordenar(elementos, esquerda, auxiliar-1);
            ordenar(elementos,auxiliar+1, direita);
        }
        return elementos;
    }

    private static int separarElementos(int[] elementos, int esquerda, int direita) {
        int i = esquerda + 1;
        int j = direita;
        int pivo = elementos[esquerda];
        while (i <= j) {
            if(elementos[i] <= pivo) {
                i++;
            } else if(elementos[j] > pivo) {
                j--;
            } else if(i <= j) {
                trocarElementos(elementos, i, j);
                i++;
                j--;
            }
        }
        trocarElementos(elementos, esquerda, j);
        return j;
    }

    public static void trocarElementos(int elementos[], int i, int j) {
        int aux = elementos[i];
        elementos[i] = elementos[j];
        elementos[j] = aux;
    }
}

package sorting.algorithms;

import sorting.interfaces.Sort;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class BucketSort implements Sort {

    @Override
    public int[] ordenar(int[] elementos) {

        int maiorNumeroVetor = 0;

        for(int i = 0; i < elementos.length; i++) {
            if (elementos[i] > maiorNumeroVetor) {
                maiorNumeroVetor = elementos[i];
            }
        }

        List<Integer>[] baldes = new List[maiorNumeroVetor];
        for(int i = 0; i < maiorNumeroVetor; i++){
            baldes[i] = new LinkedList<>();
        }

        for(int numeroOrdenado : elementos){
            baldes[hash(numeroOrdenado)].add(numeroOrdenado);
        }
        for(List<Integer> balde : baldes){
            Collections.sort(balde);
        }
        int i = 0;
        for(List<Integer> balde : baldes){
            for(int numeroOrdenado : balde){
                elementos[i++] = numeroOrdenado;
            }
        }
        return elementos;
    }

    private static int hash(int num){
        return num/10;
    }
}

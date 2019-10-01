package sorting.algorithms;

import sorting.interfaces.Sort;

public class CountSort implements Sort {
    @Override
    public int[] ordenar(int[] elementos) {
        int tamanhoDoVetorPrincipal = elementos.length;
        int maiorElementoDoVetorPrincipal=elementos[0];

        for(int i=1; i < tamanhoDoVetorPrincipal-1; i++){
            if(elementos[i]>maiorElementoDoVetorPrincipal)
                maiorElementoDoVetorPrincipal = elementos[i];
        }

        int tamanhoDoVetorAuxiliar = maiorElementoDoVetorPrincipal;

        int[] vetorAuxiliar = new int[tamanhoDoVetorAuxiliar+1];

        for(int i=0; i < tamanhoDoVetorPrincipal; i++){
            vetorAuxiliar[elementos[i]]++;
        }

        for(int i=1; i < tamanhoDoVetorAuxiliar+1; i++){
            vetorAuxiliar[i] = vetorAuxiliar[i-1] + vetorAuxiliar[i];
        }

        int[] vetorOrdenado = new int[tamanhoDoVetorPrincipal+1];

        for(int i=1; i < tamanhoDoVetorPrincipal; i++){
            vetorOrdenado[vetorAuxiliar[elementos[i-1]]] = elementos[i-1];
            vetorAuxiliar[elementos[i-1]]++;
        }

        for(int i=0; i < tamanhoDoVetorPrincipal; i++){
            elementos[i] = vetorOrdenado[i+1];
        }

        return elementos;
    }
}

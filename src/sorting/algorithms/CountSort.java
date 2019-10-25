package sorting.algorithms;

import sorting.interfaces.Sort;

public class CountSort implements Sort {
    @Override
    public int[] ordenar(int[] elementos) {
        int tamanhoDoVetorPrincipal = elementos.length;
        int maiorElementoDoVetorPrincipal=elementos[0];

        for(int i=0; i < tamanhoDoVetorPrincipal; i++){
            if(elementos[i]>maiorElementoDoVetorPrincipal)
                maiorElementoDoVetorPrincipal = elementos[i];
        }

        int tamanhoDoVetorAuxiliar = maiorElementoDoVetorPrincipal;

        int[] vetorAuxiliar = new int[tamanhoDoVetorAuxiliar+1];

        for(int i=0; i < tamanhoDoVetorPrincipal; i++){
            vetorAuxiliar[elementos[i]]++;
        }

        int[] vetorOrdenado = new int[tamanhoDoVetorPrincipal];

        int posicao = 0;

        for(int i=0; posicao < tamanhoDoVetorPrincipal; i++){
            for(int n = vetorAuxiliar[i]; n > 0; n--){
                vetorOrdenado[posicao] = i;
                posicao++;
            }

        }

        for(int i=0; i < tamanhoDoVetorPrincipal; i++){
            elementos[i] = vetorOrdenado[i];
        }

        return elementos;
    }
}

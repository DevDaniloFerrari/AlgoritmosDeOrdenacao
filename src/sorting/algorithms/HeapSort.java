package sorting.algorithms;

import sorting.interfaces.ISort;

public class HeapSort implements ISort {

    @Override
    public int[] ordenar(int[] elementos) {
        montarArvoreHeap(elementos);
        int n = elementos.length;

        for (int i = elementos.length - 1; i > 0; i--){
            int aux = elementos[i];
            elementos[i] = elementos[0];
            elementos[0] = aux;
            ordernarArvore(elementos, 0, --n);
        }

        return elementos;
    }

    private void montarArvoreHeap(int[] elementos) {
        for (int posicao = (elementos.length - 1) / 2; posicao >= 0; posicao--) {
            ordernarArvore(elementos, posicao, elementos.length);
        }
    }

    private void ordernarArvore(int[]elementos, int posicao, int tamanhoDoVetor) {
        int indiceFilhoUm = 2 * posicao + 1;
        int indifceFilhoDois = indiceFilhoUm + 1;

        if (indiceFilhoUm < tamanhoDoVetor) {
            if (indifceFilhoDois < tamanhoDoVetor) {
                if(elementos[indiceFilhoUm] < elementos[indifceFilhoDois]) {
                    indiceFilhoUm = indifceFilhoDois;
                }
            }
            if (elementos[indiceFilhoUm] > elementos[posicao]) {
                int aux = elementos[indiceFilhoUm];
                elementos[indiceFilhoUm] = elementos[posicao];
                elementos[posicao] = aux;
                ordernarArvore(elementos, indiceFilhoUm, tamanhoDoVetor);
            }
        }
    }
}

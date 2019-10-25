package sorting.algorithms;

import sorting.interfaces.ISort;

public class InsertionSort implements ISort {

    @Override
    public int[] ordenar(int[] elementos) {
        int tamanhoDoVetor = elementos.length;

        for(int i = 0; i < tamanhoDoVetor-1; i++){
            int posicao = i;
            while(posicao >=0 && (elementos[posicao] > elementos[posicao+1])){
                inverter(posicao, elementos);
                posicao--;
            }
        }

        return elementos;
    }

    private void inverter(int posicao,int[] elementos){
        int elementoDaSegundaPosicao = elementos[posicao+1];

        elementos[posicao+1] = elementos[posicao];
        elementos[posicao] = elementoDaSegundaPosicao;
    }
}

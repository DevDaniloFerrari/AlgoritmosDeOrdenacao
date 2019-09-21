package sorting.algorithms;

import sorting.interfaces.Sort;

public class BubbleSort implements Sort {

    public int[] ordenar(int[] elementos){
        int tamanhoDoVetor = elementos.length;

        for(int i = 0; i < tamanhoDoVetor; i++){
            for(int posicao = 0; posicao < tamanhoDoVetor-1; posicao++){
                if(elementos[posicao]>elementos[posicao+1])
                    inverter(posicao, elementos);
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

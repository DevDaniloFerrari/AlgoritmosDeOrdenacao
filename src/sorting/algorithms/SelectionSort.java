package sorting.algorithms;

import sorting.interfaces.ISort;

public class SelectionSort implements ISort {
    @Override
    public int[] ordenar(int[] elementos) {

        for(int i=0; i<elementos.length;i++){
            int elementoAtual = elementos[i];
            int menorElemento = elementoAtual;
            int indiceDoMenorElemento = i;

            for(int k=i; k<elementos.length;k++){
                if(elementos[k]<menorElemento){
                    menorElemento = elementos[k];
                    indiceDoMenorElemento = k;
                }
            }

            elementos[i] = menorElemento;
            elementos[indiceDoMenorElemento] = elementoAtual;

        }

        return elementos;
    }

}

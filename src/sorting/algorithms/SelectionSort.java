package sorting.algorithms;

import sorting.interfaces.Sort;

public class SelectionSort implements Sort {
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

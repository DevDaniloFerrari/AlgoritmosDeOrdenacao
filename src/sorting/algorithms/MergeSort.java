package sorting.algorithms;

public class MergeSort {

    public int[] ordenar(int[] elementos, int[] vetorAuxiliar, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            ordenar(elementos, vetorAuxiliar, inicio, meio);
            ordenar(elementos, vetorAuxiliar,meio+1, fim);
            intercalarElementos(elementos, vetorAuxiliar,inicio, meio, fim);
        }
        return elementos;
    }

    private static void intercalarElementos(int[] elementos, int[] vetorAuxiliar, int inicio, int meio, int fim) {
        for(int i = inicio; i <= fim; i++) {
            vetorAuxiliar[i] = elementos[i];
        }
            int ini = inicio;
            int metade = meio + 1;

            for (int k = inicio; k <= fim; k++) {
                if (ini > meio) {
                    elementos[k] = vetorAuxiliar[metade++];
                } else if(metade > fim) {
                    elementos[k] = vetorAuxiliar[ini++];
                } else if (vetorAuxiliar[ini] < vetorAuxiliar[metade]) {
                    elementos[k] = vetorAuxiliar[ini++];
                } else {
                    elementos[k] = vetorAuxiliar[metade++];
                }
            }
    }
}

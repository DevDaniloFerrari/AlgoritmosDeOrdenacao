package sorting.algorithms;

import sorting.interfaces.ISort;

public class RadixSort implements ISort{

    @Override
    public int[] ordenar(int[] elementos) {

        int[] vetorAuxiliar;
        int maior = elementos[0];
        int aux = 1;

        vetorAuxiliar = new int[elementos.length];

        for (int i = 0; i < elementos.length; i++) {
            if (elementos[i] > maior)
                maior = elementos[i];
        }

        while (maior/aux > 0) {
            int[] balde = new int[10];
            for (int i = 0; i < elementos.length; i++) {
                balde[(elementos[i] / aux) % 10]++;
            }

            for (int i = 1; i < 10; i++) {
                balde[i] += balde[i - 1];
            }

            for (int i = elementos.length - 1; i >= 0; i--) {
                vetorAuxiliar[--balde[(elementos[i] / aux) % 10]] = elementos[i];
            }
            for (int i = 0; i < elementos.length; i++) {
                elementos[i] = vetorAuxiliar[i];
            }
            aux *= 10;
        }
        return elementos;
    }

}

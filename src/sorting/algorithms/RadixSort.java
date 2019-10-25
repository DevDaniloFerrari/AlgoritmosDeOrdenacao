package sorting.algorithms;

import sorting.interfaces.Sort;

import java.util.Arrays;
import java.io.*;
import java.util.*;

public class RadixSort implements Sort {

    CountSort countSort = new CountSort();

@Override
        public int[] ordenar(int elementos[])
        {
            int maiorNumeroVetor = 0;

            for(int i = 0; i < elementos.length; i++) {
                if (elementos[i] > maiorNumeroVetor) {
                    maiorNumeroVetor = elementos[i];
                }
            }

            int n = elementos.length;
            for (int exp = 1; maiorNumeroVetor/exp > 0; exp *= 10) {
                countSort.ordenar(elementos);
            }
            return elementos;
        }

}

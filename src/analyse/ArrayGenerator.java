package analyse;

import java.util.Random;

public class ArrayGenerator {
    public int[] randomGenerate(int length) {
        Random random = new Random();
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(100);
        }

        return array;
    }
}

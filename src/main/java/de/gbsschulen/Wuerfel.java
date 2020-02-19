package de.gbsschulen;

import java.util.Random;

public class Wuerfel implements IWuerfel{
    @Override
    public int getWurf() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }

    @Override
    public int[] getWuerfe(int n) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = getWurf();
        }
        return result;
    }
}

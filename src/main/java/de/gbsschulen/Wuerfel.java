package de.gbsschulen;

public class Wuerfel implements IWuerfel{
    @Override
    public int getWurf() {
        return 5;
    }

    @Override
    public int[] getWuerfe(int n) {
        int[] result = {1,1,3,4,5,7,6};
        return result; //new int[0];
    }
}

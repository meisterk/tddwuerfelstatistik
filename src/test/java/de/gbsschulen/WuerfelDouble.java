package de.gbsschulen;

public class WuerfelDouble implements IWuerfel {
    @Override
    public int getWurf() {
        return 0;
    }

    @Override
    public int[] getWuerfe(int n) {
        int[] result = {2, 4, 1, 5, 2, 4, 6, 6, 4, 5};
        return result;
    }
}

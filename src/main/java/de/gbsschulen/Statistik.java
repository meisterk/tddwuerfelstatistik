package de.gbsschulen;

public class Statistik implements IStatistik {
    private IWuerfel wuerfel;

    public Statistik(IWuerfel wuerfel) {
        this.wuerfel = wuerfel;
    }

    @Override
    public String getTabelle(int n) {
        String result = "";
        int[] count = new int[6];
        int[] wuerfe = this.wuerfel.getWuerfe(n);
        for (int augenzahl : wuerfe) {
            count[augenzahl - 1]++;
        }
        for (int i = 1; i <= 6; i++) {
            String line = String.format("%der | %d\n", i, count[i - 1]);
            result += line;
        }
        return result; //"1er | 1\n2er | 2\n3er | 0\n4er | 3\n5er | 2\n6er | 2\n";
    }

    @Override
    public String getBalkendiagramm(int n) {
        return null;
    }
}

package de.gbsschulen;

public class Statistik implements IStatistik{
    private IWuerfel wuerfel;

    public Statistik(IWuerfel wuerfel) {
        this.wuerfel = wuerfel;
    }

    @Override
    public String getTabelle(int n) {
        return null;
    }

    @Override
    public String getBalkendiagramm(int n) {
        return null;
    }
}

package de.gbsschulen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StatistikTest {
    private IStatistik statistik;

    @BeforeEach
    public void init(){
        IWuerfel wuerfel = new Wuerfel();
        statistik = new Statistik(wuerfel);
    }

    @Test
    public void getTabelle_should_return_Tabelle(){
        String expected = "1er | 1\n2er | 2\n3er | 0\n4er | 3\n5er | 2\n6er | 2\n";
        String result = statistik.getTabelle(10);
        assertThat(result).isEqualTo(expected);
    }
}

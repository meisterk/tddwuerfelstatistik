package de.gbsschulen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatistikTest {
    private IStatistik statistik;

    @BeforeEach
    public void init() {
        //IWuerfel wuerfel = new WuerfelDouble(); // ohne Mockito
        IWuerfel wuerfel = mock(IWuerfel.class);  // mit Mockito
        int[] wuerfe10 = {2, 4, 1, 5, 2, 4, 6, 6, 4, 5};
        when(wuerfel.getWuerfe(10)).thenReturn(wuerfe10);

        int[] wuerfe20 = {2, 4, 1, 5, 2, 4, 6, 6, 4, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6};
        when(wuerfel.getWuerfe(20)).thenReturn(wuerfe20);

        statistik = new Statistik(wuerfel);
    }

    @Test
    public void getTabelle_should_return_Tabelle() {
        String expected = "1er | 1\n2er | 2\n3er | 0\n4er | 3\n5er | 2\n6er | 2\n";
        String result = statistik.getTabelle(10);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void getTabelle_20_should_return_Tabelle() {
        String expected = "1er | 1\n2er | 2\n3er | 0\n4er | 3\n5er | 2\n6er | 12\n";
        String result = statistik.getTabelle(20);
        assertThat(result).isEqualTo(expected);
    }
}

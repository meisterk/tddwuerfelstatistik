package de.gbsschulen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WuerfelTest {
    private IWuerfel wuerfel;

    @BeforeEach
    public void init() {
        // Arrange
        wuerfel = new Wuerfel();
    }

    @Test
    public void getWurf_should_return_random_number_between_1_and_6() {
        for (int i = 0; i < 1000; i++) {
            // Act
            int result = wuerfel.getWurf();

            // Assert
            assertThat(result).isBetween(1, 6);
        }
    }

    @Test
    public void getWuerfe_7_should_return_array_with_length_7() {
        // Act
        int[] result = wuerfel.getWuerfe(7);

        // Assert
        assertThat(result).hasSize(7);
    }

    @Test
    public void getWuerfe_5_should_return_array_with_length_5() {
        // Act
        int[] result = wuerfel.getWuerfe(5);

        // Assert
        assertThat(result).hasSize(5);
    }

    @Test
    public void getWuerfe_should_return_only_numbers_between_1_and_6() {
        // Act
        int[] result = wuerfel.getWuerfe(5);

        // Assert
        for (int zahl : result) {
            assertThat(zahl).isBetween(1, 6);
        }
    }
}

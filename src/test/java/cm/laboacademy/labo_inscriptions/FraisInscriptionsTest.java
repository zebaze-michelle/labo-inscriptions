package cm.laboacademy.inscriptions;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class FraisInscriptionTest {

    private final FraisInscription frais = new FraisInscription();

    @Test
    void licenceNonBoursier() {
        assertEquals(50000, frais.calculer("L2", false));
    }

    @Test
    void masterNonBoursier() {
        assertEquals(75000, frais.calculer("M1", false));
    }

    @Test
    void boursierPayeLaMoitie() {
        assertEquals(25000, frais.calculer("L1", true));
    }

    @Test
    void niveauInconnuLeveUneException() {
        assertThrows(IllegalArgumentException.class,
                () -> frais.calculer("X9", false));
    }

    @Test
    void reductionAvantDateLimite() {
        assertEquals(45000, frais.calculer("L2", false, LocalDate.of(2026, 8, 15)));
    }

    @Test
    void pasDeReductionApresDateLimite() {
        assertEquals(50000, frais.calculer("L2", false, LocalDate.of(2026, 10, 15)));
    }

    @Test
    void reductionCumuleeAvecBourse() {
        assertEquals(22500, frais.calculer("L1", true, LocalDate.of(2026, 8, 15)));
    }
}
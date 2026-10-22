package cm.laboacademy.inscriptions;

import java.time.LocalDate;

public class FraisInscription {

    private static final LocalDate DATE_LIMITE = LocalDate.of(2026, 9, 30);

    public int calculer(String niveau, boolean boursier) {
        int frais;

        if (niveau == null) {
            throw new IllegalArgumentException("Niveau invalide : null");
        }

        switch (niveau) {
            case "L1":
            case "L2":
            case "L3":
                frais = 50000;
                break;
            case "M1":
            case "M2":
                frais = 75000;
                break;
            default:
                throw new IllegalArgumentException("Niveau invalide : " + niveau);
        }

        if (boursier) {
            frais = frais / 2;
        }

        return frais;
    }

    public int calculer(String niveau, boolean boursier, LocalDate dateInscription) {
        int montant = calculer(niveau, boursier);
        if (dateInscription.isBefore(DATE_LIMITE)) {
            montant = montant * 90 / 100;
        }
        return montant;
    }
}
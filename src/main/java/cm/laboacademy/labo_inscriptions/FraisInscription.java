package cm.laboacademy.inscriptions;

public class FraisInscription {

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
}
package Ex3;

public class CompteCourant extends Compte {
    private double decouvertMax;

    public CompteCourant(double solde, double decouvertMax) {
        super(solde);
        this.decouvertMax = decouvertMax;
    }

    public void autoriserDecouvert() {
        System.out.println("Découvert autorisé jusqu'à : " + decouvertMax);
    }

    public void calculerFrais() {
        double frais=solde<0 ? Math.abs(solde)*0.05 : 0;
        System.out.println("Frais bancaires : "+frais);
    }

    public void retirer(double montant) {
        if (montant <= solde + decouvertMax) {
            solde-=montant;
            System.out.println("Retrait de " +montant+ " effectué.");
        } else {
            System.out.println("Dépassement du découvert autorisé.");
        }
    }

    public void afficher() {
        System.out.println("Compte Courant - Solde : "+solde+" | Découvert max : " +decouvertMax);
    }
}
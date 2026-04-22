package Ex3;

public class CompteEpargne extends Compte {
    private double tauxInteret;

    public CompteEpargne(double solde, double tauxInteret) {
        super(solde);
        this.tauxInteret = tauxInteret;
    }

    public double calculerInterets() {
        return solde * tauxInteret / 100;
    }

    public void ajouterInterets() {
        double interets = calculerInterets();
        solde += interets;
        System.out.println("Intérêts ajoutés : " + interets);
    }

    public void afficher() {
        System.out.println("Compte Épargne - Solde : " + solde + " | Taux : " + tauxInteret + "%");
    }
}
package Ex3;

public class Compte {
    protected double solde;

    public Compte(double solde) {
        this.solde=solde;
    }

    public void deposer(double montant) {
        solde+=montant;
        System.out.println("Dépôt de "+montant+" effectué.");
    }

    public void retirer(double montant) {
        if (montant<=solde) {
            solde-=montant;
            System.out.println("Retrait de "+montant+" effectué.");
        } else {
            System.out.println("Solde insuffisant.");
        }
    }

    public void consulterSolde() {
        System.out.println("Solde actuel "+solde);
    }

    public void afficher() {
        System.out.println("Compte - Solde : "+solde);
    }
}

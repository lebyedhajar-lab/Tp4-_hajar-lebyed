package Ex3;

public class Main {
    public static void main(String[] args) {
        CompteCourant cc = new CompteCourant(1000, 500);
        cc.afficher();
        cc.deposer(200);
        cc.retirer(1600);
        cc.autoriserDecouvert();
        cc.calculerFrais();
        cc.consulterSolde();

        CompteEpargne ce = new CompteEpargne(5000, 3.5);
        ce.afficher();
        ce.deposer(1000);
        ce.ajouterInterets();
        ce.consulterSolde();
    }
}
package Ex10;
import java.util.ArrayList;

public class Utilisateur {
	private String identifiant;
    private String nom;
    private ArrayList<Document> historique;

    public Utilisateur(String identifiant, String nom) {
        this.identifiant=identifiant;
        this.nom=nom;
        this.historique=new ArrayList<>();
    }
    public void emprunterDocument(Document d) {
        if (d instanceof Empruntable) {
            Empruntable e = (Empruntable) d;
            if (e.estDisponible()) {
                d.emprunter();
                historique.add(d);
            } else 
                System.out.println("Document '" + d.titre + "' non disponible.");
        } else
            System.out.println("Ce document n'est pas empruntable.");
    }
    public void retournerDocument(Document d) {
        d.retourner();
    }
    public void afficherHistorique() {
        System.out.println(" Historique de "+nom );
        if (historique.isEmpty()) {
            System.out.println("Aucun document emprunté.");
        } else {
            for (Document d : historique) {
                System.out.println("- "+ d.titre + " (" + d.auteur + ")");
            }
        }
    }
}

package Ex10;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {

        Livre livre = new Livre("L001","Le Petit Prince","Saint-Exupéry",96,"Roman");

        Magazine magazine = new Magazine("M001", "Science & Vie","Dupont",42,LocalDate.of(2026,4,1));

        DocumentNumerique doc = new DocumentNumerique("D001", "Java POO","Martin", "PDF", 5.2);

        Document[] documents = { livre, magazine, doc };
        System.out.println("INFORMATIONS DES DOCUMENTS");
        for (Document d : documents) {
            d.afficherInformations();
            System.out.println("Durée max emprunt : "+d.calculerDureeEmpruntMax()+" jours");
            System.out.println("---");
        }
        System.out.println("EMPRUNT");
        Utilisateur user = new Utilisateur("U001", "Ali");
        user.emprunterDocument(livre);
        user.emprunterDocument(magazine);
        user.emprunterDocument(doc); 
        System.out.println("RETOUR");
        user.retournerDocument(livre);
		System.out.println(" HISTORIQUE");
		user.afficherHistorique();
		System.out.println("COMPORTEMENTS SPECIFIQUES");
		livre.recommander();
		magazine.afficherEdition();
		doc.telecharger();
		doc.afficherTaille();
	}
}

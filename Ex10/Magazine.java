package Ex10;

import java.time.LocalDate;
public class Magazine extends Document implements Empruntable {

	 private int numero;
	 private LocalDate datePublication;

	 public Magazine(String identifiant, String titre, String auteur,int numero,LocalDate datePublication) {
	 super(identifiant,titre,auteur);
	 this.numero=numero;
	 this.datePublication=datePublication;
	 }
	 public int calculerDureeEmpruntMax() {
	    return 7;
	 }
	 public boolean estDisponible() {
	    return disponible;
	 }
	 public void reserver() {
	    if (disponible)
	        System.out.println("Magazine \"" +titre+"\"réservé.");
	   else 
	        System.out.println("Magazine \"" +titre+"\" déjà réservé.");
	 }
	    public boolean estRecent() {
	        return datePublication.isAfter(LocalDate.now().minusMonths(1));
	    }
	    public void afficherEdition() {
	        afficherInformations();
	        System.out.println("Numéro : " + numero);
	        System.out.println("Date publication : " + datePublication);
	        System.out.println("Récent : " + (estRecent() ? "Oui" : "Non"));
	        System.out.println("Durée max : " + calculerDureeEmpruntMax() + " jours");
	   }
}
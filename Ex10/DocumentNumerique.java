package Ex10;


public class DocumentNumerique extends Document implements Consultable{
	
	private String format;
    private double tailleFichier;

    public DocumentNumerique(String identifiant,String titre,String auteur,String format,double tailleFichier) {
        super(identifiant, titre, auteur);
        this.format=format;
        this.tailleFichier=tailleFichier;
    }

    public int calculerDureeEmpruntMax() {
        return 14;
    }

    public void consulter() {
        System.out.println("Consultation de \"" + titre + "\" en ligne.");
    }
    
    public void afficherResume() {
        System.out.println("Résumé : \"" + titre + "\" par " + auteur);
    }

    public void telecharger() {
        System.out.println("Téléchargement de \"" + titre + "\"(" +format+")");
    }
    public void afficherTaille() {
        System.out.println("Taille : " + tailleFichier + " Mo");
    }

}

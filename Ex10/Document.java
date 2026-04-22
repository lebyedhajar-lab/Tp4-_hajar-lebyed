package Ex10;

public abstract class Document {
	
	protected String identifiant;
    protected String titre;
    protected String auteur;
    protected boolean disponible;
    
    public Document(String identifiant, String titre, String auteur) {
        this.identifiant = identifiant;
        this.titre       = titre;
        this.auteur      = auteur;
        this.disponible  = true;
    }
    public void emprunter() {
        if (disponible) {
            disponible = false;
            System.out.println("Document '" + titre + "' emprunté avec succès.");
        } else 
            System.out.println("Document '" + titre + "' non disponible.");
    }
    public void retourner() {
        disponible = true;
        System.out.println("Document '" + titre + "' retourné avec succès.");
    }
    public void afficherInformations() {
        System.out.println("ID : " + identifiant);
        System.out.println("Titre : " + titre);
        System.out.println("Auteur : " + auteur);
        System.out.println("Disponible : " + (disponible ? "Oui" : "Non"));
    }
    public abstract int calculerDureeEmpruntMax();
}

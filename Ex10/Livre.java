package Ex10;

public class Livre extends Document implements Empruntable {
	
	    private int nombreDePages;
	    private String genre;

	    public Livre(String identifiant, String titre, String auteur,int nombreDePages, String genre) {
	        super(identifiant,titre,auteur);
	        this.nombreDePages=nombreDePages;
	        this.genre=genre;
	    }
	    public int calculerDureeEmpruntMax() {
	        return 21; 
	    }
	    public boolean estDisponible() {
	        return disponible;
	    }
	    public void reserver() {
	        if (disponible) {
	            System.out.println("Livre \"" +titre+"\" réservé.");
	        } else {
	            System.out.println("Livre \"" +titre+ "\"déjà réservé.");
	        }
	    }
	    public void afficherDetails() {
	        afficherInformations();
	        System.out.println("Pages : "+nombreDePages);
	        System.out.println("Genre : "+genre);
	        System.out.println("Durée max emprunt : " +calculerDureeEmpruntMax() + " jours");
	    }
	    public void recommander() {
	        System.out.println("Livre recommandé : \"" +titre+ "\" de " +auteur);
	    }
	}

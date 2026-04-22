package Ex2;

public class Vehicule {
	protected String marque;
	
	public Vehicule() {
        this.marque = null;
    }
	
	public Vehicule(String marque){
		this.marque=marque;
	}
	
	public String afficherMarque() {
		return "la marque : "+marque;
	}
	
	public void demarrer() {
		System.out.println("la voiture demarre");
	}
	
	public void arreter() {
		System.out.println("la voiture s'arrete");
	}
	
}


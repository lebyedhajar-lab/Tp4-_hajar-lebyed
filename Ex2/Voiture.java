package Ex2;

public class Voiture extends Vehicule {
	private int nombre_portes;
	private String carburant;
	
	public Voiture (int nombre_portes,String carburant) {
		//implicitement
		this.nombre_portes=nombre_portes;
		this.carburant=carburant;
	}
	
	public void afficherDetails() {
		System.out.println(afficherMarque());
		System.out.println("Portes :"+nombre_portes+" | carburant : "+carburant);
	}
	
	public void klaxonner() {
		System.out.println(marque+" klaxonne");
	}
}

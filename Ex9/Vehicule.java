package Ex9;

public abstract class Vehicule {
	
	protected int vitesse;

	public Vehicule(int vitesse) {
	        this.vitesse=vitesse;
	}
	
	public void accelerer(int v) {
	        this.vitesse += v;
	        System.out.println("Accélération : Vitesse : " + vitesse + " km/h");
	}
	
	public void freiner(int v) {
	        this.vitesse -= v;
	        System.out.println("Freinage : Vitesse : " + vitesse + " km/h");
	}
	
	}

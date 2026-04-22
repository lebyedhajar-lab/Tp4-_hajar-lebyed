package Ex9;

public class Moto extends Vehicule {
	
	private String type;

    public Moto(int vitesse, String type) {
        super(vitesse);
        this.type = type;
    }
    
    public void faireRoueArriere() {
        System.out.println("Roue arrière ! Vitesse : " + vitesse + " km/h");
    }
    
    public void afficherTypeMoto() {
        System.out.println("Type de moto : " + type);
    }
    
}

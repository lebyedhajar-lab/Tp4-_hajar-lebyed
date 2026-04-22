package Ex7;

public class Cercle extends Forme {
	double rayon;
	
	Cercle(double rayon) {
        this.rayon = rayon;
    }
	
	public double calculerSurface() {
        return Math.PI * rayon * rayon;
    }
	
	public double calculerPerimetre() {
        return 2 * Math.PI * rayon;
    }
	
	public boolean validerDimensions() {
        if (rayon > 0) {
            System.out.println("Rayon du cercle valide.");
            return true;
        } else {
            System.out.println("Rayon invalide !");
            return false;
        }
	}
}

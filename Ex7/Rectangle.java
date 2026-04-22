package Ex7;

public class Rectangle extends Forme{
	double longueur;
	double largeur;
	
	Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur  = largeur;
    }
	
	public double calculerSurface() {
        return longueur*largeur;
    }
	
	public double calculerPerimetre() {
        return 2*(longueur + largeur);
    }
	
	public boolean validerDimensions() {
        if (longueur > 0 && largeur > 0) {
            System.out.println("Dimensions du rectangle valides.");
            return true;
        }else {
            System.out.println("Dimensions invalides !");
            return false;
        }
	}
}

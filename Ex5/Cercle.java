package Ex5;

public class Cercle extends Figure {
	double rayon;

    Cercle(double rayon) {
        this.rayon = rayon;
    }
    
    public void dessiner() {
        System.out.println("Dessin d'un cercle de rayon=" + rayon);
    }
    
    public double calculerPerimetre() {
        return 2 * Math.PI * rayon;
    }
    
    public double calculerSurface() {
        return Math.PI * rayon * rayon;
    }
}

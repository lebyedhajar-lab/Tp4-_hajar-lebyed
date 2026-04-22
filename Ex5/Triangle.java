package Ex5;

public class Triangle extends Figure{
	double base;
	double hauteur;
	double cote1;
	double cote2;
	
	Triangle(double base, double hauteur, double cote1, double cote2) {
        this.base=base;
        this.hauteur=hauteur;
        this.cote1=cote1;
        this.cote2=cote2;
    }
	
	public void dessiner() {
        System.out.println("Dessin d'un triangle de base=" + base);
    }
	
	public double calculerPerimetre() {
        return cote1 + cote2 + base; 
    }
	
	public double calculerSurface() {
        return (base * hauteur) / 2;
    }
}

package Ex5;

public class Figure {
	 public void dessiner() {
	        System.out.println("Dessin d'une figure.");
	    }
	 public void deplacer(int x, int y) {
	        System.out.println("Figure déplacée vers x=" + x + " y=" + y);
	    }
	 public void redimensionner(double facteur) {
	        System.out.println("Figure redimensionnée avec facteur=" + facteur);
	    }
}

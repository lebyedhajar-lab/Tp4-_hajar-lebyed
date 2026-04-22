package Ex5;

public class MAIN {
	    public static void main(String[] args) {

	        Figure f1 = new Cercle(5);
	        Figure f2 = new Triangle(4,3,3,4);

	        System.out.println("Dessiner :");
	        f1.dessiner(); 
	        f2.dessiner();  

	        System.out.println("Déplacer :");

	        f1.deplacer(10,20);  
	        f2.deplacer(5,15);  
	        System.out.println(" Redimensionner :");
	        f1.redimensionner(2.0); 
	        f2.redimensionner(0.5);  

	        System.out.println(" Périmètre et Surface :");
	        
	        Cercle c = new Cercle(5);
	        
	        System.out.println("Périmètre cercle ="+c.calculerPerimetre());
	        System.out.println("Surface cercle = "+c.calculerSurface());

	        Triangle t = new Triangle(4, 3, 3, 4);
	        System.out.println("Périmètre triangle = "+t.calculerPerimetre());
	        System.out.println("Surface triangle   = "+t.calculerSurface());
	    }
	}

package Ex7;

public class Main {
	
	public static void main(String[] args) {
		
		Rectangle r = new Rectangle(5, 3);
        Cercle c    = new Cercle(4);
        
        System.out.println("Validation");
        r.validerDimensions();
        c.validerDimensions();
        
        System.out.println(" Description ");
        r.afficherDescription();
        c.afficherDescription();
        
        System.out.println("Périmètre ");
        System.out.println("Périmètre rectangle = " + r.calculerPerimetre());
        System.out.println("Périmètre cercle    = " + c.calculerPerimetre());
        
        System.out.println(" Comparaison des surfaces ");
        r.comparerSurface(c);
        
	}

}

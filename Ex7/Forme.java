package Ex7;

public abstract class Forme {
	
    public abstract double calculerSurface();

    public void afficherDescription() {
        System.out.println("Je suis une forme géométrique.");
        System.out.println("la surface est = "+calculerSurface());
    }
    
    public void comparerSurface(Forme f) {
        if (this.calculerSurface() > f.calculerSurface()) 
            System.out.println("Cette forme est plus grande.");
         else if (this.calculerSurface() < f.calculerSurface()) 
            System.out.println("Cette forme est plus petite.");
        else 
            System.out.println("Les deux formes ont la même surface.");
    }  
}

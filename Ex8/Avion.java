package Ex8;

public class Avion implements Volant  {
	
	private String nom;
    private int altitude;

    public Avion(String nom) {
        this.nom = nom;
        this.altitude = 0;
    }
    
    public void voler() {
        System.out.println(nom+" décolle");
    }
    
    public void atterrir() {
        System.out.println(nom+" atterrit.");
        this.altitude=0;
    }
	
    public void changerAltitude(int altitude) {
        this.altitude = altitude;
        System.out.println(nom+" vole à "+altitude+" m.");
    }
    
	public void embarquerPassager(){
		System.out.println("Les passagers embarquent dans "+nom+".");
	}
	
	public void afficherAltitude() {
		System.out.println(nom+" est à une altitude de "+altitude+" m.");
	}
	
}

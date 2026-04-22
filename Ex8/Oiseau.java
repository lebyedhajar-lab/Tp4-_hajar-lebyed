package Ex8;

public class Oiseau implements Volant {
	
	private String nom;

    public Oiseau(String nom) {
        this.nom=nom;
    }
    public void voler() {
    	System.out.println(nom+" s'envole !");
    }
	public void atterrir() {
        System.out.println(nom+" se pose.");
    }
	public void changerAltitude(int altitude) {
        System.out.println(nom+" vole à "+altitude+" m.");
    }
	public void migrer() {
		System.out.println(nom+" migre");
	}
	public void construireNid() {
		System.out.println(nom+" construit un nid");
	}
}

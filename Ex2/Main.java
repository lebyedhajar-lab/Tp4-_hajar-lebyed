package Ex2;

public class Main {
	public static void main(String[] args) {
		Voiture v = new Voiture(4,"Gasoil");
		System.out.println(v.afficherMarque());
		v.demarrer();
		v.arreter();
		v.afficherDetails();
		v.klaxonner();
	}
}

package Ex8;

public class Main {
	    public static void main(String[] args) {
	    	
	        System.out.println("** TEST OISEAU");

	        Oiseau oiseau = new Oiseau("zizo");

	        oiseau.construireNid();
	        oiseau.voler();
	        oiseau.changerAltitude(250);
	        oiseau.migrer();
	        oiseau.atterrir();
	        
	        System.out.println("** TEST AVION");

	        Avion avion = new Avion("Rayanair");

	        avion.embarquerPassager();
	        avion.voler();
	        avion.changerAltitude(11000);
	        avion.afficherAltitude();
	        avion.atterrir();
	        avion.afficherAltitude();
	        
	        System.out.println("**TEST POLYMORPHISME ");

	        Volant[] volants = new Volant[2];
	        volants[0] = new Oiseau("cocoo");
	        volants[1] = new Avion("Air Arabia");

	        for (Volant v : volants) {
	            v.voler();
	            v.changerAltitude(1000);
	            v.atterrir();
	        }
	  }
}

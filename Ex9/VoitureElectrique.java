package Ex9;

public class VoitureElectrique extends Vehicule implements Electrique {

	private int autonomie;
    private int batterie;
    
    public VoitureElectrique(int vitesse, int autonomie, int batterie) {
        super(vitesse);
        this.autonomie = autonomie;
        this.batterie  = batterie;
    }
    
    public void charger() {
        this.batterie = 100;
        System.out.println("Batterie chargée.");
    }
    
    public void verifierBatterie() {
        System.out.println("Niveau batterie : "+batterie + "%");
    }
    
    public void afficherAutonomie() {
        System.out.println("Autonomie restante : "+autonomie+" km.");
    }
    
    public void optimiserConsommation() {
        System.out.println("Consommation optimisée.");
    }
    
}

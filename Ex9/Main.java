package Ex9;

public class Main {
	public static void main(String[] args) {

		System.out.println("** Voiture Electrique");
        VoitureElectrique ve = new VoitureElectrique(0,350,80);
        ve.accelerer(50);
        ve.verifierBatterie();
        ve.afficherAutonomie();
        ve.optimiserConsommation();
        ve.charger();
        ve.verifierBatterie();
        ve.freiner(20);

        System.out.println("** MOTO ");
        Moto moto = new Moto(0,"Sportive");
        moto.accelerer(80);
        moto.faireRoueArriere();
        moto.afficherTypeMoto();
        moto.freiner(30);
    }
}

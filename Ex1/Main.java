package Ex1;

public class Main {
	public static void main(String[] args) {
		Etudiant e1 = new Etudiant("hajar","lebyed",21,"Cycle",15.6);
		e1.sePresenter();
		e1.afficherProfil();
		if(e1.estMajeur())
			System.out.println("Est majeur ?  ,oui");
		else
			System.out.println("Est majeur ?  ,non");
		
		if(e1.estAdmis())
			System.out.println("Est admis ?  ,oui");
		else
			System.out.println("Est admis ?  ,non");
		e1.calculerMention();
	}
}

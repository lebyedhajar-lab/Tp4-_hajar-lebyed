package Ex1;

public class Etudiant extends Personne {
	private String niveauEtude;
	private double moyenne;
	
	Etudiant (String nom,String prenom,int age,String niveauEtude,double moyenne){
		super(nom,prenom,age);
		this.niveauEtude=niveauEtude;
		this.moyenne=moyenne;
	}
	
	public void calculerMention() {
		if(moyenne>=16)
			System.out.println("Mention : tres bien");
		else if(moyenne>=14)
			System.out.println("Mention : bien");
		else if(moyenne>=12)
			System.out.println("Mention : Assez bien");
		else if(moyenne<12)
			System.out.println("Mention : ajourné");
	}
	
	public boolean estAdmis(){
		return moyenne>=12;
	}
	
	public void afficherProfil() {
		afficherInformations();
		System.out.println("niveau d’étude : "+niveauEtude);
		System.out.println("moyenne : "+moyenne);
	}
}


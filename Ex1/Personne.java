package Ex1;

public class Personne {
	protected String nom;
	protected String prenom;
	protected int age;
	
	Personne(String nom,String prenom,int age){
		this.nom=nom;
		this.prenom=prenom;
		this.age=age;
	}
	
	public void afficherInformations() {
		System.out.println("le nom : "+nom);
		System.out.println("le prenom : "+prenom);
		System.out.println("l'age : "+age);
	}
	
	public boolean estMajeur() {
		return age>=18;
	}
	
	public String sePresenter() {
		return "je suis "+prenom+" "+nom+" j'ai "+age+"ans";
	}
}

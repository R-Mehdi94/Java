package fr.voxilud.administration;

public class Moderateur extends utilisateur implements Administrateur{
	
	private String login;
	private int nbAlertesEnvoyees = 0;
	
	public Moderateur(String nom, String prenom, String email, String mdp, int etat, String login, int nbAlertesEnvoyees){
		super(nom,prenom,email,mdp,etat);
		this.login = login;
		this.nbAlertesEnvoyees = nbAlertesEnvoyees;
		
	}

	public boolean seConnecter(String login, String mdp) {
		if(this.login == login && this.mdp == mdp){
			setEtat(CONNECTE);
			System.out.println("Tentative réussite");
			return true;
		}
		else{ 
			System.out.println("Tentative échouée");
			return false; 
			}
	}
	
	
	public String toString() {
		return super.toString() + "Moderateur [login=" + login + ", nbAlertesEnvoyees=" + nbAlertesEnvoyees + "]";
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getNbAlertesEnvoyees() {
		return nbAlertesEnvoyees;
	}
	
	public void alerter(Membre uti , String msg){
		uti.setMsg(msg);
		nbAlertesEnvoyees += 1;	
	}

	public void setNbAlertesEnvoyees(int nbAlertesEnvoyees) {
		this.nbAlertesEnvoyees = nbAlertesEnvoyees;
	}

	public void bloquer(Membre uti) {
		uti.setBloque(true);
	}


	public void debloquer(Membre uti) {
		uti.setBloque(false);
	}

}

package fr.voxilud.administration;

public class Membre extends utilisateur {
	private boolean bloque = false;
	private String msg;
	
	public Membre(String nom, String prenom, String email, String mdp, int etat, boolean bloque){
		super(nom,prenom,email,mdp,etat);
		this.setBloque(bloque);
	}

	public boolean seConnecter(String email, String mdp) {
		if(this.email == email && this.mdp == mdp && bloque == false){
			setEtat(CONNECTE);
			System.out.println("Tentative réussite");
			return true;
		}
		else{
			System.out.println("Tentative échouée");
			return false;
		}
	}
	
	public String visuNotif(){
		return msg;
	}

	public boolean isBloque() {
		return bloque;
	}

	public String toString() {
		return super.toString() + "Membre [bloque=" + bloque + "]";
	}

	public void setBloque(boolean bloque) {
		this.bloque = bloque;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}

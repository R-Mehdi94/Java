package fr.voxilud.admin;

public class Auditeur extends Membre {
	private String languePref;
	private int nbOeuvreEcoutees;
	
	public Auditeur(int numero, String nom, String email, String languePref, int nbOeuvreEcoutees) {
		super(numero, nom, email);
		this.languePref = languePref;
		this.nbOeuvreEcoutees = nbOeuvreEcoutees;
	}
	public String getLanguePref() {
		return languePref;
	}
	public void setLanguePref(String languePref) {
		this.languePref = languePref;
	}
	public int getNbOeuvreEcoutees() {
		return nbOeuvreEcoutees;
	}
	public void setNbOeuvreEcoutees(int nbOeuvreEcoutees) {
		this.nbOeuvreEcoutees = nbOeuvreEcoutees;
	}
	
	public String toString() {
		return super.toString() + "Auditeur [languePref=" + languePref + ", nbOeuvreEcoutees=" + nbOeuvreEcoutees + "]";
	}
	
	public String toHTML(){
		return "<span id = " + numero + " class = Auditeur>" + "\n"
				 +"  "+ nom + " (<em>" + languePref + "</em>)" + "\n"
				+ "</span>";
				 
				
	}
	
}

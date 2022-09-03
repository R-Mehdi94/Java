package fr.voxilud.admin;

public class Evaluation {
	private int numero = 0; 
	private int note = 0;
	private String commentaire = "";
	private int nbAimer = 0;
	private boolean valide = false;
	
	public Evaluation(int numero, int note, String commentaire, int nbAimer, boolean valide){
		this.setNumero(numero);
		this.setNote(note);
		this.setCommentaire(commentaire);
		this.setNbAimer(nbAimer);
		this.setValide(valide);	
	}
	
	public Evaluation(int numero, int note, String commentaire){
		this.setNumero(numero);
		this.setNote(note);
		this.setCommentaire(commentaire);
	}
	
	public void estAimer(){
			this.nbAimer += 1;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNote() {
		return note;
	}

	public void setNote(int note) {
		this.note = note;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public int getNbAimer() {
		return nbAimer;
	}

	public void setNbAimer(int nbAimer) {
		this.nbAimer = nbAimer;
	}

	public boolean isValide() {
		return valide;
	}

	public void setValide(boolean valide) {
		this.valide = valide;
	}
	
	public String toString(){
		return  "Lecteur[" + numero + "," + note + "," + commentaire + "," + nbAimer + "," +  valide +"]";
	}	
	
}

package fr.voxilud.production;

public class AudioBook {
	
	private int numero;
	private int nbEcoutes = 0;
	private Oeuvre uneOeuvre;
	
	public AudioBook(int numero, int nbEcoutes, Oeuvre uneOeuvre) {
		this.numero = numero;
		this.nbEcoutes = nbEcoutes;
		this.uneOeuvre = uneOeuvre;
	}
	
	public void ecouter() {
		this.nbEcoutes+=1;
	}

	public String toString() {
		return "AudioBook [numero=" + numero + ", nbEcoutes=" + nbEcoutes + ", oeuvres=" + uneOeuvre + "]";
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNbEcoutes() {
		return nbEcoutes;
	}

	public void setNbEcoutes(int nbEcoutes) {
		this.nbEcoutes = nbEcoutes;
	}
	
	public Oeuvre getOeuvre() {
		return uneOeuvre;
	}
	
	public void setOeuvre(Oeuvre uneOeuvre) {
		this.uneOeuvre = uneOeuvre;
	}
	
}


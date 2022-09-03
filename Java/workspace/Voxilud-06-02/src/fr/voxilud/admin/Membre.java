package fr.voxilud.admin;

public class Membre {
	protected int numero;
	protected String nom;
	protected String email;
	
	public Membre(int numero, String nom, String email) {
		this.numero = numero;
		this.nom = nom;
		this.email = email;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return "Membre [numero=" + numero + ", nom=" + nom + ", email=" + email + "]";
	}
	
	

}

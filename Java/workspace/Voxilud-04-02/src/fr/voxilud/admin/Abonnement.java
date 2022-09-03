package fr.voxilud.admin;

import java.time.LocalDate;

public class Abonnement {
	private int numero;
	private LocalDate dateSouscription;
	private static int dureeAbo = 3;
	
	public Abonnement(int numero , LocalDate dateSouscription){
		this.setNumero(numero);
		this.setDateSouscription(dateSouscription);
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public LocalDate getDateSouscription() {
		return dateSouscription;
	}

	public void setDateSouscription(LocalDate dateSouscription) {
		this.dateSouscription = dateSouscription;
	}

	public static int getDureeAbo() {
		return Abonnement.dureeAbo;
	}

	public static void setDureeAbo(int dureeAbo) {
		Abonnement.dureeAbo = dureeAbo;
	}
	
	public String toString(){
		return "Oeuvre[" + numero + "," + dateSouscription + "]";
	}
}

package fr.voxilud.admin;

import java.time.LocalDate;

public class Candidature {
	
	private int num;
	private LocalDate dateDepot;
	private LocalDate dateRep;
	private int etat = EN_ATTENTE;
	public static final int EN_ATTENTE = 1;
	public static final int ETUDIEE = 2;
	public static final int ANNULEE = 3;
	public static final int ACCEPTEE = 4;
	public static final int REJETEE = 5;
	
	public Candidature(int num ,int etat, LocalDate dateDepot ,  LocalDate dateRep){
		this.setNum(num);
		this.setDateDepot(dateDepot);
		this.setDateRep(dateRep);
		this.setEtat(etat);
	}
	
	public Candidature(int num , LocalDate dateDepot){
		this.setNum(num);
		this.setDateDepot(dateDepot);
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public LocalDate getDateDepot() {
		return dateDepot;
	}

	public void setDateDepot(LocalDate dateDepot) {
		this.dateDepot = dateDepot;
	}

	public LocalDate getDateRep() {
		return dateRep;
	}

	public void setDateRep(LocalDate dateRep) {
		this.dateRep = dateRep;
	}

	public int getEtat(){
		return etat;
	}

	public void setEtat(int etat) {
		this.etat = etat;
	}
	
	public String toString(){
		return "Candidature[" + num + "," + dateDepot + "," + dateRep + "," + etat + "]" ;
	}
	

	public void annuler(){
		if(getEtat() == 1){
			System.out.println("Candidature annulée");
			setEtat(3);
		}
		else{
			System.out.println("Annulation refusée");
		}
	}
	
	
	public void etudier(){
		if(getEtat() == 1){
			System.out.println("Candidature en cours d'étude");
			setEtat(2);
		}
		else{
			System.out.println("La candidature ne peut pas être étudiée");
		}
	}
	
	
	public void rejeter(){
		if(getEtat() == 2){
			System.out.println("Candidature rejetée");
			setEtat(5);
		}
		else{
			System.out.println("Opération refusée");
		}
	}
	
	public void accepter(){
		if(getEtat() == 2){
			System.out.println("Candidature acceptée");
		}
		else{
			System.out.println("Opération refusée");
		}
	}
}

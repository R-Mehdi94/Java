package fr.voxilud.admin;

import java.time.LocalDate;

public class Ecoutes {
	private int idEcoute;
	private LocalDate date;
	private AudioBooks audio;
	
	public Ecoutes(int idEcoute, LocalDate date, AudioBooks audio){
		this.idEcoute = idEcoute;
		this.date = date;
		this.audio = audio;
		
	}

	public int getIdEcoute() {
		return idEcoute;
	}

	public void setIdEcoute(int idEcoute) {
		this.idEcoute = idEcoute;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public AudioBooks getAudio() {
		return audio;
	}

	public void setAudio(AudioBooks audio) {
		this.audio = audio;
	}
	
	public String toString(){
		return "Ecoutes[" + idEcoute + "," + date + "," + audio + "]" ;
	}
}

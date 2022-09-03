package fr.voxilud.admin;

public class AudioBooks {

	private int idAudio;
	private String langue;
	private Oeuvre oeuvre;

	public AudioBooks(int idAudio, String langue, Oeuvre oeuvre){
		this.idAudio = idAudio;
		this.langue = langue;
		this.oeuvre = oeuvre;
		
	}

	public int getIdAudio() {
		return idAudio;
	}

	public void setIdAudio(int idAudio) {
		this.idAudio = idAudio;
	}

	public String getLangue() {
		return langue;
	}

	public void setLangue(String langue) {
		this.langue = langue;
	}

	public Oeuvre getOeuvre() {
		return oeuvre;
	}

	public void setOeuvre(Oeuvre oeuvre) {
		this.oeuvre = oeuvre;
	}
	
	public String toString(){
		return "AudioBooks[" + idAudio + "," + langue +  "," + oeuvre + "]";
	}
}

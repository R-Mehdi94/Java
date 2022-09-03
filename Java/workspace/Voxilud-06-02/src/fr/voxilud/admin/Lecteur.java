package fr.voxilud.admin;

public class Lecteur extends Membre {
	private String langueMat;
	private int maitrise;
	
	public Lecteur(int numero, String nom, String email, String langueMat, int maitrise){
		super(numero,nom, email);
		this.langueMat = langueMat;
		this.maitrise = maitrise;
	}

	public String getLangueMat() {
		return langueMat;
	}

	public void setLangueMat(String langueMat) {
		this.langueMat = langueMat;
	}

	public int getMaitrise() {
		return maitrise;
	}

	public void setMaitrise(int maitrise) {
		this.maitrise = maitrise;
	}

	
	public String toString() {
		return super.toString() + "Lecteur [langueMat=" + langueMat + ", maitrise=" + maitrise + "]";
	}
	
	public String toHTML(){
		return "<span id = " + numero + " class = lecteur>" + "\n"
				+"  " + nom + " (<em>" + langueMat + "</em>)" + "\n"
				+ "</span>";
	}
	
	public String toHTML(int mode){
		switch(mode){
			case 1 :
				return "<div id = " + numero + " class = lecteur>" + "\n"
						 +"  " + nom + "\n"
						 +"  " + "<br>/"
						 +"  " + "degrès de maîtrise : " + maitrise + "\n"
						+ "</div>";
			case 2 :
				return "<div id = " + numero + " class = lecteur>" + "\n"
						+"  " + nom + "\n"
						+"  " + "<br>/"
						+"  " + "Langue maternelle : " + langueMat + "\n"
						+ "</div>";
			case 3 :
				return "<div id = " + numero + " class = lecteur>" + "\n"
						+"  " + nom + "\n"
						+"  " + "<br/>"+ "\n"
						+"  " + "degrès de maîtrise : " + maitrise + "\n" 
						+"  " + "<br>/" + "\n"
						+"  " + "Langue maternelle : " + langueMat + "\n"
						+ "</div>";
			default :
				return toHTML();
		}
	}
}
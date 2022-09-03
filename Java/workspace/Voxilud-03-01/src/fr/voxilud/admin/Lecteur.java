package fr.voxilud.admin;

public class Lecteur {
		
		private int numero = 0;
		private String nom = "Personne";
		private String prenom = "Personne";
		private int audiobooks = 0; 
		
		public Lecteur (int numero , String nom , String prenom , int audiobooks) {
			this.numero = numero;
			this.nom = nom;
			this.prenom = prenom;
			this.audiobooks = audiobooks;
		}
		
		public Lecteur (int numero , String nom , String prenom ) {
			this.numero = numero;
			this.nom = nom;
			this.prenom = prenom;
		}
		
		
		public boolean estActif(){
			if(audiobooks>10){
				return true;
			}
			else{
				return false;
			}
			
			
		}
		public void produireUnAudiobook(){
			audiobooks += 1;
		}
		
		
		public String toString(){
			return  "Lecteur[" + numero + "," + nom + "," + prenom + "," + audiobooks +"]";
		}	
	
		public int getnumero(){
			return numero;
		}
		
		public void setnumero(int numero){
			this.numero = numero;
		}
		
		public String getnom(){
			return nom;
		}
		
		public void setnom(String nom){
			this.nom = nom;
		}
		
		public String getprenom(){
			return prenom;
		}
		
		public void setprenom(String prenom){
			this.prenom = prenom;
		}
		
		public int getaudiobooks(){
			return audiobooks;
		}
		
		public void setaudiobooks(int audiobooks){
			this.audiobooks = audiobooks;
		}
}
		
			
		

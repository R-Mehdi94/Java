package fr.voxilud.admin;

public class AppGestion {

	public static void main(String[] args) {
		Auditeur aud289 = new Auditeur(289, "Selma", "selma.dradri@gmail.com", "Anglais", 35);
		Lecteur lec518 = new Lecteur(518, "Jules", "jules.ollouche@gmail.com", "Polonais", 4);
		
		System.out.println(aud289+"\n\n");
		System.out.println(lec518+"\n\n");
		
		System.out.println(aud289.toHTML()+"\n\n");
		System.out.println(lec518.toHTML()+"\n\n");
		System.out.println(lec518.toHTML(1)+"\n\n");
		System.out.println(lec518.toHTML(2)+"\n\n");
		System.out.println(lec518.toHTML(3)+"\n\n");
	}

}

package fr.voxilud.admin;

public class AppGestion {

	public static void main(String[] args) {
		
		/*System.out.println( "\n\n-----[Question 1]-----\n\n" ) ;*/
		
		Oeuvre oeuvre1 = new Oeuvre(1,"Au revoir là-haut", 2);
		
		
		System.out.println( "\n\n-----[Question 2]-----\n\n" ) ;

		System.out.println(oeuvre1);
		
		
		System.out.println( "\n\n-----[Question 3]-----\n\n" ) ;
		
		System.out.println(oeuvre1.toHTML());

		
		/*System.out.println( "\n\n-----[Question 4]-----\n\n" ) ;*/
		
		Biographie oeuvre2 = new Biographie(2, "Hannibal", 5, "Hannibal Barca");
		
		
		System.out.println( "\n\n-----[Question 5]-----\n\n" ) ;

		System.out.println(oeuvre2);
		
		
		System.out.println( "\n\n-----[Question 6]-----\n\n" ) ;
		
		System.out.println(oeuvre2.toHTML());
	}

}

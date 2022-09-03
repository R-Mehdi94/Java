package fr.voxilud.admin;

public class AppAdmin {
	public static void main(String[] args) {
		
		Evaluation eval1 = new Evaluation(1 , 5 , "Excellent !!!" , 23 , true);
		Evaluation eval2 = eval1;
		
		System.out.println(eval1);
		
		eval1.estAimer();
		
		System.out.println(eval2);
		
		System.out.println(eval1);
		
		eval2.estAimer();
		
		System.out.println(eval2);
		
		System.out.println(eval1);
		
		System.out.println("Réf. Eval. n° 1 : " + eval1.hashCode());
		System.out.println("Réf. Eval. n° 2 : " + eval2.hashCode());
		
		
	}
	
}

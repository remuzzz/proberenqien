package ganzenbord;
import java.util.Scanner;
import java.util.Random;
public class hogerlager {
	


	 public static void main(String args[])  // methode
	 {
	
			 System.out.println("Vul hier een getal in");
			 Scanner scanner = new Scanner (System.in);
			 
			   String input = scanner.nextLine(); 
			   int i = Integer.parseInt(input);
			   
				 Random random = new Random(); int a = random.nextInt(50);
				 
				 
				 new Vergelijken().vergelijkGetal (i,a);
				// System.out.println(Vergelijken.vergelijkGetal (i,a))	;
				
	 }	

}

class Vergelijken
{
	  void vergelijkGetal(int invoer, int a) 
	 { 
	
	
	//	 System.out.println("RANDOM getal: "+ a);
		 System.out.println("Je invoer: " + invoer);
		 String result = "";
		 while (invoer != a)
		 {
				 if (invoer < a)
				 {
					 System.out.println("Jouw invoer is kleiner dan het getal van de computer, gok opnieuw");
						 Scanner scanner = new Scanner (System.in);
						 String input = scanner.nextLine(); 
						  invoer = Integer.parseInt(input);
					 
				 }
				 if (invoer > a)
				 {
					 System.out.println("Jouw invoer is groter dan het getal van de computer, gok opnieuw");
					 Scanner scanner = new Scanner (System.in);
					 String input = scanner.nextLine(); 
					  invoer = Integer.parseInt(input);
					
				 }
			
		 	}
		 if (invoer == a)
		 {
			 System.out.println("Gefeliciteerd! Tis je gelukt. Het juiste getal was "+ a);
 
		 }
		
	 }	
}


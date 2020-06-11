import java.util.Random;
import java.util.Scanner;

public class MastermindMain {

	public static void main(String[] args) { //methode
		// TODO Auto-generated method stub
		 // to lower case
		System.out.println("Welkom bij Remy's Mastermind. Raad de juiste codecombinatie door een gokje te wagen:");
		Computerhandelingen computerhandelingen = new Computerhandelingen();
	 Invoer scanner = new Invoer();
	 String invoer = scanner.invoerCheck();
		String randomCode = computerhandelingen.codeGenereren();	
		
		while (invoer.equals(randomCode) == false) // checken of het NIET gelijk is, er wordt dus gespeeddd
		{
			//hier speel je het spelletje
			System.out.println("Aantal letters dat precies goed staat: "+computerhandelingen.goedepositie(randomCode ,invoer));
			int nettoAantalletters = computerhandelingen.alleenlettergoed(randomCode ,invoer) - computerhandelingen.goedepositie(randomCode ,invoer);
				System.out.println("Aantal ingevoerde letters dat goed is geraden, maar op een verkeerde plek staat: "+nettoAantalletters);
				System.out.println("===========================");
				invoer = scanner.invoerCheck();
				
				
		}
		
			System.out.println("Je hebt gewonnen, gefeliciteerd! De juiste code was inderdaad: " +randomCode);
			System.exit(0);
		
			
	
}

}

class Invoer
{
	String invoerCheck() {
		 Scanner scanner = new Scanner(System.in);  // Create a Scanner object
		 String result ="";
		boolean controle = false;
	
		while (controle == false)
		{
			System.out.println("Voer vier letters in code in, binnen de range A-F en druk op Enter: ....");
			 result = scanner.next();
			 result = result.toLowerCase(); // zorgen dat de invoer altijd klein is.
			
			 if (result.charAt(0) == 'q' || result.charAt(0) == 'Q') {
				 System.out.println("Je hebt het spel gestopt.");
				 System.exit(0);
			 }
			 if(!result.matches("[a-fA-F]{4}")) {

				 System.out.println("Je hebt een teken ingevoerd dat niet binnen de range [a tot f] is, of hebt een te lange of korte reeks gebruikt.");
				 continue;
			 }
			
//			 if (result.length() > 4)
//			 {
//				 System.out.println("Je hebt meer dan vier tekens ingevuld. Probeer het nog eens");
//				 result = scanner.next();
//			 }
//			
			
			 else {
			controle = true;	 
			 
			 }
	}
		
		 return result;
	}
}

class Computerhandelingen
{
	public int a = 3;

	void Computerhandelingen()
	{
	//constructor, niet nodig maar voor mijn begrip.
	}
	//controle of hij valide is
		String codeGenereren() // methode code genereren 
		{
			Random random = new Random();
			int a = random.nextInt(6); // heb zes letters, 0 telt ook mee, dus je krijgt 0 tot en met 5 
			int b = random.nextInt(6); // heb zes letters, 0 telt ook mee, dus je krijgt 0 tot en met 5
			int c = random.nextInt(6); // heb zes letters, 0 telt ook mee, dus je krijgt 0 tot en met 5
			int d = random.nextInt(6); // heb zes letters, 0 telt ook mee, dus je krijgt 0 tot en met 5
			
			char[] letters = new char[] {'a','b','c', 'd', 'e', 'f'};
			String randomCode = letters[a]+""+letters[b]+""+ letters[c]+""+letters[d];
		
			return randomCode;

	
		}
		
		int goedepositie(String randomCode, String invoer)
		{
			int aantalopjuisteplek = 0;
					
			for (int i = 0; i < 4; i++) { // loop tot 3, want 0 doet ook mee
				if (randomCode.charAt(i) == invoer.charAt(i)) {
//				
					
					 aantalopjuisteplek++; 
				}
			}
		

			return aantalopjuisteplek;
		
			
		}
		
		
		int alleenlettergoed(String randomCode, String invoer)		{
			
			int result = 0;
			for (int i = 0; i < 4; i++) { // loop tot 3, want 0 doet ook mee
				for (int y = 0; y < 4; y++) { // loop tot 3, want 0 doet ook mee
					
					if (randomCode.indexOf(randomCode.charAt(i)) < i) {// kijken of een letter al geweest is 
							
						 continue; // overslaan, want hij is al geweest.
							}
					if (randomCode.charAt(i) == invoer.charAt(y)) {
												
						result++; 
					}
//			            
				}
	
				}
			return result;
			}
		
	}

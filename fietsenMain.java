import java.util.Random;
import java.util.Scanner;

class Fiets {
String	merknaam;
String kleur;
String modelsoort;
	void platteband () {
		 
	 }
}

class Fietser {
String naam;
int conditie = 100;
String modelsoort;
double portemonnee = 30;
boolean platteband = false;
	
	void marsEten () {
		 conditie += 20;
		 portemonnee -= 1.20;
		 System.out.println("MARS. Mmmm dat was lekker, 20 procent extra conditie! Je conditie is nu: " +conditie + " In je portemonnee zit nu " + portemonnee);
		
	 }
	void bandRepareren (int methode) {
		if (methode == 0)
		{ 
			// laten doen
			portemonnee -= 10;
			
		}
		if (methode == 1)
		{
			conditie -= 20;
		}
		platteband = false;
		System.out.println("Je band is gerepareerd!");
	
	 }
	int fietsen (int kilometer) {
		int conditieafname;
			if (platteband == false && conditie > 5)
			{
		conditieafname = (kilometer/10) *10; // omdat een int geen decimalen accepteert, wordt het mooi naar beneden afgerond. 28 = 10 procent verlies
		conditie = conditie - conditieafname;
		System.out.println("Je conditie is: " +conditie + ". Je hebt nog " +portemonnee + " euro in je portemonnee zitten.");
			}
			else {
				System.out.println("Je kunt niet meer fietsen. Je hebt of te weinig conditie, of een platte band. ");
				
			}
					Random random = new Random();
					int a = random.nextInt(10);
					if (a == 3) { // willekeurig gekozen getal
						platteband = true;
					}
			return conditie;
	 }
}



class Invoeren {
	String invoerCheck() {
		 Scanner scanner = new Scanner(System.in);  // Create a Scanner object
		 String result ="";
		boolean controle = false;
	
		while (controle == false)
		{
			System.out.println("Welkom fietser, hoeveel kilometer wil je op pad gaan? (Voer een heel getal in).");
			 result = scanner.next();
			 result = result.toLowerCase(); // zorgen dat de invoer altijd klein is.
			
			 if (result.charAt(0) == 'q' || result.charAt(0) == 'Q') {
				 System.out.println("Je hebt het spel gestopt.");
				 System.exit(0);
			 }
			  

			 if(!result.matches("\\d+")) {

				 System.out.println("Voer een getal in");
				 continue;
			 }
			 int i= Integer.parseInt(result);
			 if (i >95) {
				 System.out.println("Het is niet verstandig om zo ver te fietsen. Je kunt niet verder dan 95 kilometer");
				 continue;
			 }
			
				
//			
			
			 else {
			controle = true;	 
			 
			 }
    

		}       
	       return result;
	}	
}

public class fietsenMain
{
	public static void main(String[] args) { //methode
	Fietser Remy = new Fietser();
//		Remy.fietsen(28);
//		Remy.fietsen(28);
//		
//		Remy.fietsen(15);
//		Remy.marsEten();
//		Remy.fietsen(15);
//		Remy.fietsen(15);
//		Remy.fietsen(15);
//		Remy.bandRepareren(1);
				while (Remy.conditie > 5) //blijven fietsen tot je erbij neervalt
				{
				 Invoeren scanner = new Invoeren();
				 String invoer = scanner.invoerCheck();
				 int i= Integer.parseInt(invoer);
				 Remy.fietsen(i);
				 System.out.println("===============");
				}
	}
}


// Maak een fiets
// Geef hem een merknaam, kleur, modelsoort, methode platte band mee
// Maak een fietser
// Geef hem een naam, conditie (neemt af na fietsen), portemonnee & methode fietsen, mars eten en platte band repareren.
// Ga fietsen
// verlies 10% conditie per 10 km gefietst
// mag niet minder dan 5% zijn, anders val je om
// Eet Mars
// krijg 20% conditie extra
// kost 1,20 euro
// Fiets krijgt platte band	
// Fietser moet repareren
	// laten doen kost 10 euro
	// zelf doen kost 20% conditie

import java.util.Random;

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


public class fietsenMain
{
	public static void main(String[] args) { //methode
	int kilometers = 2;
	Fietser Remy = new Fietser();
		Remy.fietsen(28);
		Remy.fietsen(28);
		
		Remy.fietsen(15);
		Remy.marsEten();
		Remy.fietsen(15);
		Remy.fietsen(15);
		Remy.fietsen(15);
		Remy.bandRepareren(1);
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

import java.util.ArrayList;
import java.util.Scanner;

class Tekstinvoer {
	String Tekstinvoer()
	{ 
		Scanner scanner = new Scanner(System.in);
		String result = scanner.nextLine();
		return result;
	}
}

class Drankje
	{
		String naam;
		double prijs;
		int alcoholpercentage;
		int voorraad;
		
		int serveren()	{
			voorraad = voorraad -1;
			System.out.println("De voorraad van "+ naam +" is nu nog "+ voorraad);
			return voorraad;
			}
		}

class Drankvoorraad
{
	
	Drankvoorraad() 	{
		ArrayList<Drankje> dranklijst = new ArrayList<Drankje>();		
		
		Drankje Bier = new Drankje();
		Bier.naam = "Heineken";
		Bier.voorraad = 50;
		Bier.alcoholpercentage = 5;
		Bier.prijs = 2.50;
		dranklijst.add(Bier);
			Drankje Cola = new Drankje();
			Cola.naam = "Cola";
			Cola.voorraad = 120;
			Cola.alcoholpercentage = 0;
			Cola.prijs = 2.0;
			dranklijst.add(Cola);	
				Drankje Cocktail = new Drankje();
				Cocktail.naam = "Cocktail";
				Cocktail.voorraad = 25;
				Cocktail.alcoholpercentage = 12;
				Cocktail.prijs = 5.50;
				dranklijst.add(Cocktail);
				
				for (Drankje soort:dranklijst)
				{
				System.out.print(soort.naam + " (" +soort.prijs+ " euro), ");
				}

	}
	
}

	class Klant
	{
	String naam;
	double portemonnee = 20;
	int beschonken;
	Tekstinvoer tekstinvoer = new Tekstinvoer();
				void klantaanmelden () {
						//System.out.println(tekstinvoer.Tekstinvoer());
					// nu heb ik een String nodig
					naam = tekstinvoer.Tekstinvoer();  
					System.out.println("Welkom " + naam);
					System.out.println("Je hebt " + portemonnee + " euro in je portemonnee");
					
				}
				void bestellen(String invoer) {
					// HIER VERDER GAAN!
					Drankje ingevoerddrankje  = Drankje invoer;
					System.out.println("Je hebt " + naam +" besteld!");
					
				//  portemonnee = portemonnee - naam.prijs;
//				  beschonken = beschonken + alcohol;
					
				}
	}

public class Cafe {


	public static void main(String[] args) {
		Tekstinvoer tekstinvoer = new Tekstinvoer();	
		System.out.println("Welkom in Remy's café! Ga zitten. Hoe heet je?");
		Klant klantfuncties = new Klant();
		klantfuncties.klantaanmelden();
		System.out.println("Wat wil je drinken?");
		Drankvoorraad Drankvoorraad = new Drankvoorraad();
		
		String s = tekstinvoer.Tekstinvoer();  
		klantfuncties.bestellen(s);

		}


		
}

//Cafe
//Medewerker
//Welkom, dit zijn de drankjes: xxx
//Scanner.nextline order
//Drankje pakken en geven
//afrekenen
//Bedankt tot ziens
//Klant (ons)
//Komt in cafe
//Bestelld product
//Geld gaat weg
//Kassa
//Kassa balans
//Geld komt binnen
//Extras: vorrad

import java.util.ArrayList;
import java.util.Scanner;


class Tekstinvoer {
	String Tekstinvoer()
	{ 
		Scanner scanner = new Scanner(System.in);
		String result = scanner.nextLine();
		result = result.substring(0, 1).toUpperCase() + result.substring(1);
		return result;
	}
}

class Drankje
	{
		String naam;
		double prijs;
		int alcoholpercentage;
		int voorraad;
		
//		int serveren()	{
//			voorraad = voorraad -1;
//			System.out.println("De voorraad van "+ naam +" is nu nog "+ voorraad);
//			return voorraad;
//			}
		}

class Drankvoorraad
{
		ArrayList<Drankje> dranklijst = new ArrayList<Drankje>();		
		Drankvoorraad() 	{
		
			Drankje Bier = new Drankje();
			Bier.naam = "Bier";
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
					
	
		}
		void toondrankvoorraad ()
		{

			for (Drankje soort:dranklijst)
			{
			System.out.print(soort.naam + " (" +soort.prijs+ " euro), ");
			}
		}
		Drankje checkvoorraad (String ingevoerdenaam) {
			Drankje bewustedrank = new Drankje();
			
			if (ingevoerdenaam.equals("Nee"))
			{
			System.out.println("Oke, dan mag je de kroeg verlaten. Tot de volgende keer!");
			System.exit(0);	
			}
			
			boolean match = false;
					for (Drankje Dranknaam:dranklijst)
					{
					
							if (ingevoerdenaam.equals(Dranknaam.naam)) {
							// dranknaam is juist en drankje is op voorraad
								
								match = true;
								bewustedrank = Dranknaam;				
									if (Dranknaam.voorraad > 0)
									{
									System.out.println(Dranknaam.naam+ ", lekker. Dat hebben we gelukkig op voorraad, komt eraan.");
									}
									else
									{
										System.out.println("Het drankje wat je besteld hebt, is helaas op.");
									}
							}	
														
					}
			if (match == false) {
				System.out.println("Wat je besteld hebt, hebben we helaas niet.");
			}
				
			return bewustedrank;
			
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
					
					
					Drankvoorraad drankvoorraad = new Drankvoorraad();
					Drankje bestelddrankje = new Drankje();
					bestelddrankje = drankvoorraad.checkvoorraad(invoer);
					
					if (portemonnee < bestelddrankje.prijs)
					{
						System.out.println("Je hebt nog " + portemonnee + " en kunt dit drankje niet betalen"); 
					}
					if (beschonken >20 && bestelddrankje.alcoholpercentage>0)
					{
						System.out.println("Sorry je bent te dronken, ik mag je geen alcohol meer geven. *hik*"); 
					}
					else
					{
					 portemonnee = portemonnee - bestelddrankje.prijs;
					 beschonken = beschonken + bestelddrankje.alcoholpercentage;
					 bestelddrankje.voorraad--;
					
					 System.out.println("-- " + naam +": Ik heb nu nog " + portemonnee +" in m'n portemonnee.");
					
				//	 System.out.println(bestelddrankje.voorraad);
					}
				
					
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
		 Drankvoorraad.toondrankvoorraad();
			String s = tekstinvoer.Tekstinvoer();  
			klantfuncties.bestellen(s);
			System.out.println("==========");
			String result = "ja";
			while (result == "ja") // oneindige loop haha
			{
			System.out.println("Wil je nog iets bestellen? (Toets nee om de kroeg te verlaten.)");
			 Drankvoorraad.toondrankvoorraad();
				s = tekstinvoer.Tekstinvoer();  
				klantfuncties.bestellen(s);
				System.out.println("==========");
			}
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

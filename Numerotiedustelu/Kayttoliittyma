package Numerotiedustelu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Käyttöliittymä {

	Scanner lukija;
	Henkilö henkilö;
	List<Henkilö> henkilöt = new ArrayList<>();

	public Käyttöliittymä(Scanner lukija) {
		this.lukija = lukija;

	}

	public void valinnat() {

		System.out.println("numerotiedustelu\n" + 
				"käytettävissä olevat komennot:\n" + 
				"1 lisää numero\n" + 
				"2 hae numerot\n" + 
				"3 hae puhelinnumeroa vastaava henkilö\n" + 
				"4 lisää osoite\n" + 
				"5 hae henkilön tiedot\n" + 
				"6 poista henkilön tiedot\n" + 
				"7 filtteröity listaus\n" + 
				"x lopeta");

	}

	public void valinnanKäsittely(String käsky) {


		/*switch*/ if(käsky.equals("1")) {
			lisääNumero();
		}
		if(käsky.equals("2")) {
			haeNumero();
		}
		if(käsky.equals("3")) {
			haeHenkilö();
		}
		if(käsky.equals("4")) {
			lisaaOsoite();
		}
		if(käsky.equals("5")) {
			haeHenkilönTiedot();
		}
		if(käsky.equals("6")) {
			poistaHenkilönTiedosta();
		}
		if(käsky.equals("7")) {
			filteröityListaus();
		}

	}

	public boolean lisääNumero() {
		System.out.print("kenelle: ");
		String nimi = lukija.nextLine();
		System.out.print("numero: ");
		String puhelinnumero = lukija.nextLine();
		for(Henkilö h : henkilöt) {
			if(h.getNimi().equals(nimi)) {
				h.annaPuhelinnumerot(puhelinnumero);
				return true;
			}
		}
		Henkilö ihminen = new Henkilö(nimi, puhelinnumero);
		henkilöt.add(ihminen);
		return true;
	}

	public boolean haeNumero() {
		System.out.print("kenen: ");
		String kenen = lukija.nextLine();
		for(Henkilö h : henkilöt) {
			if(h.getNimi().equals(kenen)) {
				for(String puhelinnumero : h.puhelinnumero) {
					System.out.println("\t" + puhelinnumero);
				}
				return true;
			}
		}
		System.out.println("ei löytynyt");
		return false;
	}

	public boolean haeHenkilö() {
		System.out.print("numero: ");
		String kenennumero = lukija.nextLine();
		for(Henkilö h : henkilöt) {
			if(h.puhelinnumero.contains(kenennumero)) {
				System.out.println(h.getNimi());
				return true;
			}
		}
		System.out.println("ei löytynyt");
		return false;
	}

	public boolean lisaaOsoite() {
		System.out.print("kenelle: ");
		String kenelle = lukija.nextLine();
		System.out.print("katu: ");
		String katu = lukija.nextLine();
		System.out.print("kaupunki: ");
		String kaupunki = lukija.nextLine();
		for(Henkilö h : henkilöt) {
			if(h.nimi.equals(kenelle)) {
				h.annaOsoite(katu, kaupunki);
				return true;
			}
		}
		Henkilö ihminen = new Henkilö(kenelle);
		henkilöt.add(ihminen);
		ihminen.annaOsoite(katu, kaupunki);
		return true;
	}

	public boolean tulostaNumero(String kenen) {

		for(Henkilö h : henkilöt) {
			if(h.getNimi().equals(kenen)) {
				for(String puhelinnumero : h.puhelinnumero) {
					System.out.println(puhelinnumero);
				}
				return true;
			}
		}
		System.out.println("ei löytynyt");
		return false;


	}

	public void haeHenkilönTiedot() {
		System.out.print("kenen: ");
		String kenen = lukija.nextLine();
		for(Henkilö h : henkilöt) {
			if(h.getNimi().equals(kenen)){
				List<HashMap<String, String>> osoite = h.palautaOsoite();
				if(osoite.isEmpty()) {
					System.out.println("osoitetta ei löydy");
				}
				for(HashMap<String, String> osoitteet : osoite) {
					System.out.println("\t osoite: " + osoitteet.get("katu") + " " +  osoitteet.get("kaupunki"));

				}

				System.out.println("\t puhelinnumerot: ");
				tulostaNumero(kenen);

			}
		}

	}

	public void poistaHenkilönTiedosta() {
		System.out.print("kenet: ");
		String kenet = lukija.nextLine();
		for(Henkilö h : henkilöt) {
			if(h.getNimi().equals(kenet)) {
				henkilöt.remove(h);
			}
		}
	}

	public void filteröityListaus() {
		System.out.print("hakusana (jos tyhjä, listataan kaikki): ");
		String hakusana = lukija.nextLine();
		List<Henkilö> löydöt = new ArrayList<>();
		for(Henkilö h : henkilöt) {
			if(h.getNimi().contains(hakusana)) {
				if (!löydöt.contains(h)) {
					löydöt.add(h);
				}

			}
			for(HashMap<String, String> osoitteet: h.palautaOsoite()) {
				if(osoitteet.get("katu").contains(hakusana) || osoitteet.get("kaupunki").contains(hakusana)) {
					if (!löydöt.contains(h)) {
						löydöt.add(h);
					}
				}
			}
		}

		if(löydöt.isEmpty()) {
			System.out.println("ei löytöjä");
		}else {
			for(Henkilö h : löydöt) {
				System.out.println("   " + h.getNimi());
				List<HashMap<String, String>> osoite = h.palautaOsoite();

				for(HashMap<String, String> osoitteet : osoite) {
					System.out.println("     osoite: " + osoitteet.get("katu") + " " +  osoitteet.get("kaupunki"));
				}
				System.out.println("   puhelinnumerot: ");
				tulostaNumero(h.getNimi());
			}
		}
	}


	public void aloitus() {
		valinnat();
		while(true) {
			System.out.print("komento: ");
			String käsky = lukija.nextLine();
			valinnanKäsittely(käsky);
			if(käsky.equals("x")) {
				System.exit(0);
			}
		}
	}
}

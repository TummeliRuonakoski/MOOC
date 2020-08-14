package SäännöllisetLausekkeet;

import java.util.Scanner;

public class Tarkistin {
	
	Scanner lukija;

	public Tarkistin(Scanner lukija) {
		this.lukija = lukija;

	}

	public boolean onViikonpaiva(String merkkijono) {
		System.out.println("Anna merkkijono: ");
		merkkijono = lukija.nextLine();
		if (merkkijono.matches("ma|ti|ke|to|pe|la|su")) {
			System.out.println("muoto on oikea");
			return true;
		}else {
			System.out.println("Muoto ei ole oikea");
			return false;
			
		}
		
	}
	
	public boolean kaikkiVokaaleja(String merkkijono) {
		System.out.println("Anna merkkijono: ");
		merkkijono = lukija.nextLine();
		if (merkkijono.matches("(a|e|i|o|u|y|ä|ö|å)+")) {
			System.out.println("kaikki kirjaimet ovat vokaaleita");
			return true;
		}else {
			System.out.println("kaikki kirjaimet eivät ole vokaaleita");
			return false;
			
		}
	}
	
	public boolean kellonaika(String merkkijono) {
		System.out.println("Anna merkkijono: ");
		merkkijono = lukija.nextLine();
		if(merkkijono.matches("([01][0123456789]|[02][0123]):[012345][0123456789]:[012345][0123456]")) {
			System.out.println("muoto on oikea");
			return true;
		}else {
			System.out.println("Muoto ei ole oikea");
			return false;
			
		}
	}
	
	

	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		Tarkistin t = new Tarkistin(lukija);
		t.onViikonpaiva("");
		t.kaikkiVokaaleja("");
		t.kellonaika("");

	}

}

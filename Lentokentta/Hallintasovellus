package Lentokenttä;



import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Hallintasovellus {

public static void main(String[] args) {

	Scanner lukija = new Scanner(System.in);
		System.out.println("Lentokentän hallinta");
		System.out.println("____________________");
		System.out.println("Valitse toiminto:"  + "\n" +  
				"[1] lisää lentokone" + "\n" + 
				"[2] lisää lento" + "\n" + 
				"[x] postu hallintamoodista");

		String hallintatoiminto = lukija.nextLine();

		HashMap<String, Lentokone> lentokoneet = new HashMap<String, Lentokone>();
		HashMap<String, Lento> lennot = new HashMap<String, Lento>();
		Lentokone lentokone;
		Lento lento;

		while(true) {

			if(hallintatoiminto.equals("1")) {

				System.out.println("Anna lentokoneen tunnus: ");
				String koneentunnus = lukija.nextLine();

				System.out.println("Anna lentokoneen kapasiteetti: ");
				int koneenkapasiteetti = lukija.nextInt();

				lentokone = new Lentokone(koneentunnus, koneenkapasiteetti);
				lentokoneet.put(koneentunnus, lentokone);

			}
			if(hallintatoiminto.equals("2")) {
				System.out.println("Anna lentokoneen tunnus: ");
				String lentokoneentunnus = lukija.nextLine();
				lentokone = lentokoneet.get(lentokoneentunnus);

				System.out.println("Anna lähtöpaikan tunnus: ");
				String lahtopaikka = lukija.nextLine();
				System.out.println("Anna kohdepaikan tunnus: ");
				String kohdepaikka = lukija.nextLine();


				lento = new Lento(lentokone,lahtopaikka, kohdepaikka);
				lennot.put(lahtopaikka +  kohdepaikka,  lento );


			} 
			if (hallintatoiminto.equals("x")) {
				break;
			}

			System.out.println("");
			System.out.println("Valitse toiminto:"  + "\n" +  
					"[1] lisää lentokone" + "\n" + 
					"[2] lisää lento" + "\n" + 
					"[x] postu hallintamoodista");
			hallintatoiminto = lukija.nextLine();
		}

		System.out.println("Lentopalvelu");
		System.out.println("____________");
		System.out.println("Valitse toiminto:"  + "\n" +  
				"[1] tulosta lentokoneet" + "\n" + 
				"[2] tulosta lennot" + "\n" + 
				"[3] tulosta lentokoneen tiedot" + "\n" +
				"[x] lopeta");
		String palvelutoiminto = lukija.nextLine();

		while(true) {
			if(palvelutoiminto.equals("1")) {
				Set<String> avaimet = lentokoneet.keySet();
				for (String avain : avaimet) {
					Lentokone lentokoneJoukosta = lentokoneet.get(avain);
					System.out.println(lentokoneJoukosta);
				}
			}


			if(palvelutoiminto.equals("2")) {
				Set<String> reitit = lennot.keySet();
				String merkkijono = "";
				
				for(String reitti : reitit) {
					Lento reittiJoukosta = lennot.get(reitti);
					Lentokone lentokoneLennosta = reittiJoukosta.lentokone;
					merkkijono = lentokoneLennosta.tunnus + " " + "(" +
							lentokoneLennosta.getkapasiteetti() + " henkilöä)";
					merkkijono += "(" + reittiJoukosta.lahtopaikka + "-" + 
							reittiJoukosta.kohdepaikka + ")";
					
					System.out.println(merkkijono);

				}

			} 
			if(palvelutoiminto.equals("3")) {
				System.out.println("Mikä kone? ");
				String kone = lukija.nextLine();
				Lentokone haettuLentokone = null;
				haettuLentokone = lentokoneet.get(kone);
				if(haettuLentokone != null) {
					System.out.println(haettuLentokone);
				}else {
					System.out.println("Konetta ei löydy.");
				}
			} 
			if(palvelutoiminto.equals("x")) {
				break;

			}

			System.out.println("");
			System.out.println("Valitse toiminto:"  + "\n" +  
					"[1] tulosta lentokoneet" + "\n" + 
					"[2] tulosta lennot" + "\n" + 
					"[3] tulosta lentokoneen tiedot" + "\n" +
					"[x] lopeta");
			palvelutoiminto = lukija.nextLine();
		}
		lukija.close();
	}
}


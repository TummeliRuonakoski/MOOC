package Hirsipuu;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Sanalista {


	private List<String> sanalista;

	public Sanalista() {

		sanalista = new ArrayList<>();

	}

	public Sanalista(String tiedostonimi){
		sanalista = new ArrayList<>();
		FileReader tiedostolukija;

		try {
			tiedostolukija = new FileReader(tiedostonimi);
			BufferedReader puskuroivalukija = new BufferedReader(tiedostolukija);
			String tiedostorivi;
			tiedostorivi = puskuroivalukija.readLine();

			while(tiedostorivi !=null) {
				sanalista.add(tiedostorivi);
				tiedostorivi = puskuroivalukija.readLine();
			}
			puskuroivalukija.close();	
		}
		catch(FileNotFoundException e) { 
			e.printStackTrace();
			System.out.println("Tiedostoa ei löytynyt");
		}
		catch(IOException e) { 
			e.printStackTrace();
		}
	}


	public List<String> sanat(){
		return sanalista;

	}

	public Sanalista sanatJoidenPituusOn(int pituus) {
		Sanalista sopiva = new Sanalista();
		for(String yksisana : sanalista) {
			if(yksisana.length() == pituus) {
				sopiva.sanalista.add(yksisana);
			}
		}
		return sopiva;
	}

	public Sanalista sanatJoissaEiEsiinnyKirjainta(char kirjain) {

		Sanalista sopiva = new Sanalista();
		for(String yksisana : sanalista) {
			if(!yksisana.contains("" + kirjain)) {
				sopiva.sanalista.add(yksisana);
			}
		}

		return sopiva;
	}

	public Sanalista sanatJoissaMerkit(String merkkijono) {

		Sanalista sopiva = new Sanalista();

		for(String yksisana : sanalista) {
			boolean kelpaa = true;
			if(yksisana.length() != merkkijono.length()) {
				kelpaa = false;
			}else {
				for(int i = 0; i < yksisana.length() ; i++) {
					if(yksisana.charAt(i) != '-' &&
							yksisana.charAt(i) == merkkijono.charAt(i)){
					}else {
						kelpaa = false;
					}
				}
			}
			if (kelpaa == true) {
				sopiva.sanalista.add(yksisana);
			}
		}
		return sopiva;
	}

	public int koko() {
		return sanalista.size();
	}

}

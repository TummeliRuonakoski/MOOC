package Hirsipuu;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Hirsipuu {

	Scanner lukija = new Scanner(System.in);
	Sanalista sanalista;
	List <Character> arvaukset = new ArrayList<>();
	int arvauksienmaara = 10;
	private String arvattavasana = "";

	public Hirsipuu() {
		

		String path = new File("").getAbsolutePath();
		sanalista = new Sanalista(path + "/src/Hirsipuu/hirsipuusanalista.txt");
		
	}
	
	public void annaLista(Sanalista s) {
		this.sanalista = s;
	}
	
	public String sananArpominen() {
		int koko = sanalista.sanat().size();
		Random arpoja = new Random();
		int indeksi = arpoja.nextInt(koko);
		arvattavasana = sanalista.sanat().get(indeksi);
		
		return arvattavasana;
	}
	 public boolean uudenSananArpominen() {
		 if(arvauksienmaara == 5 || arvauksienmaara == 1) {
			 sananArpominen();
			 return true;
		 }else {
			 return false;
		 }
	 }

	public boolean arvaa() {
		System.out.print("Arvaus: ");
		String arvaus = lukija.nextLine();
		char merkki = arvaus.charAt(0);
		arvaukset.add(merkki);
		if(arvattavasana.contains(arvaus)) { 
			System.out.println("Löytyi ainakin yksi " + merkki + "-kirjain");
			return true;
		}else {
			arvauksienmaara--;
			System.out.println("Ei " + merkki +"-kirjaimia");
			return false;
		}
	}

	public List<Character> arvaukset(){
		return arvaukset;
	}

	public int arvauksiaJaljella() {
		return arvauksienmaara;
	}

	public String sana() {
		String esitettäväsana = "";
		for(int i = 0; i < arvattavasana.length(); i++) {
			if (!arvaukset.contains(arvattavasana.charAt(i))){
				esitettäväsana += "-";
			}else {
				esitettäväsana += arvattavasana.charAt(i);
			}
		}
		return esitettäväsana;
	}

	public String oikeaSana() {
		return arvattavasana;
	}

	public boolean onLoppu() {
		if(arvauksienmaara == 0){
			System.out.println("Parempaa onnea ensikerralla!");
			System.out.println("Sana oli: " + oikeaSana());
			return true;
		}else if(sana().equals(arvattavasana)) {
			System.out.println("Onnea, arvasit sanan!");
			return true;
		}else {
			return false;

		}
	}
}
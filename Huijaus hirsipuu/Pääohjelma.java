package Hirsipuu;

public class Pääohjelma {

	public static void main(String[] args) {
		
		Hirsipuu hirsipuu = new Hirsipuu();
		
		hirsipuu.sananArpominen();
		while(!hirsipuu.onLoppu()) {
			System.out.println("Sinulla on " + hirsipuu.arvauksiaJaljella() + " arvausta jäljellä.");
			System.out.println("Olet käyttänyt nämä merkit: " + hirsipuu.arvaukset());
			System.out.println("Sana: " + hirsipuu.sana());
			hirsipuu.arvaa();
			hirsipuu.uudenSananArpominen();
			System.out.println("");
			
		}
	}
}

package Lentokenttä;

public class Lento {
	String lahtopaikka;
	String kohdepaikka;
	Lentokone lentokone;
	
	public Lento(Lentokone lentokone, String lahtopaikka, String kohdepaikka) {
		this.lahtopaikka = lahtopaikka;
		this.kohdepaikka = kohdepaikka;
		this.lentokone = lentokone;
	}
	public String getLahtopaikka() {
		return this.lahtopaikka;

	}
	
	public void setLahtopaikka(String lahtopaikka) {
        this.lahtopaikka = lahtopaikka;
    }
	public String getKohdepaikka() {
		return this.kohdepaikka;

	}
	
	public void setKohdepaikka(String kohdepaikka) {
        this.kohdepaikka = kohdepaikka;
    }
	
	public String toString() {
		return "(" + lahtopaikka + ("-") + kohdepaikka + ") ";
	}

}

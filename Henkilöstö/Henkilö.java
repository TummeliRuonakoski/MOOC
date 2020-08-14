package Henkilöstö;

public class Henkilö {
	
	private String nimi;
	private Koulutus koulutus;
	
	public Henkilö(String nimi, Koulutus koulutus) {
		this.koulutus = koulutus;
		this.nimi = nimi;
	}
	
	public String hetNimi() {
		return nimi;
	}
	
	public Koulutus getKoulutus() {
		return koulutus;
	}
	
	public String toString() {
		return nimi + ", " + koulutus;
	}

	public static void main(String[] args) {
		
		Henkilö arto = new Henkilö("Arto", Koulutus.FT);
		System.out.println(arto);

	}

}

package Lentokenttä;



public class Lentokone {

	String tunnus;
	int kapasiteetti;
	String lahtopaikka;
	String saapumispaikka;
	

	public Lentokone(String tunnus, int kapasiteetti) {
		this.tunnus = tunnus;
		this.kapasiteetti = kapasiteetti;

	}

	public String getLisaatunnus() {
		return this.tunnus;

	}
	
	public void setLisaatunnus(String tunnus) {
        this.tunnus = tunnus;
    }

	public int getkapasiteetti() {
		return this.kapasiteetti;

	}
	
	public void setkapasiteetti(int kapasiteetti) {
        this.kapasiteetti = kapasiteetti;
    }
	
	public String toString() {
		return tunnus + " (" + kapasiteetti + "henkilöä)" ;
	}

}

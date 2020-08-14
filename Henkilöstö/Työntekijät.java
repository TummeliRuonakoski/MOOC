package Henkilöstö;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Työntekijät {

	private List<Henkilö> työntekijät;

	public Työntekijät() {
		työntekijät = new ArrayList<Henkilö>();
	}

	public void lisaa(Henkilö lisattava) {
		työntekijät.add(lisattava);
	}

	public void lisaa(List<Henkilö> lisattavat) {
		for(Henkilö henkilö : lisattavat) {
			työntekijät.add(henkilö);
		}

	}

	public void tulosta() {
		Iterator<Henkilö> iteraattori = työntekijät.iterator();
		while (iteraattori.hasNext()) {
			Henkilö kaikkiTyöntekijät = iteraattori.next();
			System.out.println(kaikkiTyöntekijät);
		}

	}

	public void tulosta(Koulutus koulutus) {
		Iterator<Henkilö> iteraattori = työntekijät.iterator();
		while (iteraattori.hasNext()) {
			if(iteraattori.next().getKoulutus() == koulutus) {
				System.out.println(iteraattori);
			}
		}
	}

	public void irtisano(Koulutus koulutus) {
		Iterator<Henkilö> iteraattori = työntekijät.iterator();
		while (iteraattori.hasNext()) {
			if(iteraattori.next().getKoulutus() == koulutus) {
				iteraattori.remove();
			}
		}
	}

	public static void main(String[] args) {

		Työntekijät yliopisto = new Työntekijät();
		yliopisto.lisaa(new Henkilö("Matti", Koulutus.FT));
		yliopisto.lisaa(new Henkilö("Pekka", Koulutus.FilYO));
		yliopisto.lisaa(new Henkilö("Arto", Koulutus.FT));

		yliopisto.tulosta();

		yliopisto.irtisano(Koulutus.FilYO);

		System.out.println("==");

		yliopisto.tulosta();

	}

}

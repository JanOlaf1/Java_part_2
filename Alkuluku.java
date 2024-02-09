import java.util.Scanner;

public class Alkuluku {
	/*
	 * Tämä ohjelma, nimeltään Alkuluku, kysyy käyttäjältä yhden kokonaisluvun ja
	 * tarkistaa, onko käyttäjän syöttämä luku alkuluku. Ohjelma käyttää
	 * toistorakennetta, jossa se yrittää jakaa käyttäjän antamaa lukua sitä
	 * pienemmillä kokonaisluvuilla. Alkaen luvusta 2 ja jatkuen kokeilemista luku
	 * kerrallaan, ohjelma päättelee, onko käyttäjän antama luku alkuluku. Jos
	 * jollain kierroksella jako menee tasan, ei käyttäjän antama luku ole alkuluku.
	 * Jos toisaalta toistorakenne päättyy ilman, että yksikään jako on mennyt
	 * tasan, annettu luku on alkuluku
	 */
	public static void main(String[] args) {
		Scanner tutka = new Scanner(System.in);
		System.out.print("Syötä jokin positiivinen kokonaisluku: ");
		int kayttajanSyote = tutka.nextInt();

		if (onkoAlkuluku(kayttajanSyote)) {
			System.out.println("Luku " + kayttajanSyote + " on alkuluku.");
		} else {
			System.out.println("Luku " + kayttajanSyote + " ei ole alkuluku.");
		}
		tutka.close();
	}

	private static boolean onkoAlkuluku(int luku) {
		if (luku < 2) {
			return false;
		}
		for (int i = 2; i < luku; i++) {
			if (luku % i == 0) {
				return false;
			}
		}
		return true;
	}
}

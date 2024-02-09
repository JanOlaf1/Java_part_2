import java.util.Scanner;
import java.text.DecimalFormat;

public class Matkavertailu {
	public static void main(String[] args) {
		/*
		 * Tämä ohjelma, Matkavertailu, antaa käyttäjälle mahdollisuuden selvittää,
		 * kannattaako ostaa matkoille kuukausilippu vai maksaa yksittäisiä matkoja.
		 * Ohjelma kysyy käyttäjältä matkojen lukumäärän kuukaudessa, yksittäisen matkan
		 * hinnan ja kuukausilipun hinnan. Sen jälkeen se vertailee kustannuksia ja
		 * ilmoittaa käyttäjälle, kumpi vaihtoehdoista on halvempi ja kuinka paljon.
		 */
		Scanner tutka = new Scanner(System.in);
		System.out.println("Montako matkaa teet kuukaudessa: ");
		int matka = tutka.nextInt();
		System.out.println("Anna yksittäisen lipun hinta: ");
		double hinta = tutka.nextDouble();
		System.out.println("Anna kuukausilipun hinta: ");
		double kuukausi = tutka.nextDouble();
		double lasku = (double) matka * hinta;
		DecimalFormat kaksi = new DecimalFormat("0.00");
		if (lasku > kuukausi) {
			double saasto = lasku - kuukausi;
			System.out.println("Kuukausilippu on " + kaksi.format(saasto) + " euroa halvempi kuin yksittäinen");

		} else {
			double saasto = kuukausi - lasku;
			System.out.println("Yksittäinen on " + kaksi.format(saasto) + " euroa halvempi kuin kuukausilippu");
		}
		tutka.close();

	}
}

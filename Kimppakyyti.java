import java.util.Scanner;
import java.text.DecimalFormat;

public class Kimppakyyti {
	/*
	 * Tässä on ohjelma nimeltään Kimppakyyti, joka laskee polttoainekustannukset
	 * kimppakyytiläisten kesken annettujen tietojen perusteella:
	 */
	public static void main(String[] args) {
		Scanner tutka = new Scanner(System.in);
		System.out.println("Anna ajetut kilometrit: ");
		int matka = tutka.nextInt();
		System.out.println("Anna kulutus per 100 km: ");
		double kulutus = tutka.nextDouble();
		System.out.println("Anna polttoaineen litrahinta: ");
		double litrahinta = tutka.nextDouble();
		System.out.println("Anna kimppakyytiläisten lukumäärä: ");
		int ihmiset = tutka.nextInt();
		DecimalFormat kakksi = new DecimalFormat("0.00");
		double tulos = (double) (matka * kulutus / 100 * litrahinta / ihmiset);
		System.out.println("Bensakustannus per henkilö on " + kakksi.format(tulos) + " euroa");
		tutka.close();

	}
}

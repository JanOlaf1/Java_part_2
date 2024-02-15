import java.util.Scanner;
import java.text.DecimalFormat;

public class Luottolaskuri {
	public static void main(String[] args) {
		Scanner tutka = new Scanner(System.in);
		DecimalFormat dos = new DecimalFormat("0.00");
		System.out.println("Anna luotollisen ostoksen hinta: ");
		double hinta = tutka.nextDouble();
		System.out.println("Anna kuukausierien lukumäärä: ");
		double lasku_era = tutka.nextDouble();
		for (int i = 1; i <= lasku_era; i++) {
			double maksu_maara = hinta / lasku_era;
			double jaljella = hinta - (maksu_maara * i);
			System.out.println(i + ". erä " + dos.format(maksu_maara) + " euroa, luottoa jäljellä "+ dos.format(jaljella) + " euroa");
tutka.close();
		}

	}
}

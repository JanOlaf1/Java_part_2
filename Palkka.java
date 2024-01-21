import java.util.Scanner;
import java.text.DecimalFormat;
public class Palkka {
	public static void main(String[] args) {
		Scanner tutka = new Scanner(System.in);
		System.out.println("Anna palkka: ");
		int palkka = tutka.nextInt();
		System.out.println("Anna veroprosentti: ");
		int veroprosentti = tutka.nextInt();
		System.out.println("Anna ikä: ");
		int ikä = tutka.nextInt();

		double vero = palkka * veroprosentti / 100.0;

		double työeläkevakuutusMaksu;
		if (ikä >= 53 && ikä <= 62) {
			työeläkevakuutusMaksu = palkka * 0.0825;
		} else {
			työeläkevakuutusMaksu = palkka * 0.0675;
		}

		double työttömyysvakuutus = palkka * 0.015;

		double käteenJäävä = palkka - vero - työttömyysvakuutus - työeläkevakuutusMaksu;

		DecimalFormat kaksi = new DecimalFormat("0.00");
		
		System.out.println("Bruttopalkka " + palkka);
		System.out.println("Veron osuus " + kaksi.format(vero));
		System.out.println("Työeläkevakuutusmaksun osuus " + kaksi.format(työeläkevakuutusMaksu));
		System.out.println("Työttömyysvakuutuksen osuus " + kaksi.format(työttömyysvakuutus));
		System.out.println("Käteen jää " + kaksi.format(käteenJäävä));
		tutka.close();
	}
}

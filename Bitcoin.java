import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

/*Tämä ohjelma, nimeltään Bitcoin, 
 *on suunniteltu laskemaan Bitcoinin vuotuinen tuotto, 
 *kun tuottoennusteena käytetään vuoden 2017 tulosta. 
 *Vuonna 2017 Bitcoiniin sijoitettu rahasumma kasvoi 15,06 kertaiseksi. 
 *Ohjelma huomioi, 
 *että alkuperäistä investoitua rahasummaa ei lasketa mukaan sijoituksen tuottoon.*/
public class Bitcoin {
	public static void main(String[] args) {
		Scanner vastaus = new Scanner(System.in);
		System.out.println("Anna Bitcoineihin investoidun rahan määrä: ");

		String input = vastaus.nextLine().replace(',', '.');

		double tulos = Double.parseDouble(input);

		DecimalFormat pilkku = new DecimalFormat("0.0", DecimalFormatSymbols.getInstance(Locale.US));

		double lasku = (15.06 * tulos) - tulos;
		System.out.println("Bitcoin tuotti vuodessa " + pilkku.format(lasku) + " euroa");

		vastaus.close();
	}
}

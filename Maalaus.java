import java.util.Scanner;
import java.text.DecimalFormat;

public class Maalaus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat kaksiDesimaalia = new DecimalFormat("0.00");

        System.out.println("Anna huoneen leveys, pituus ja korkeus: ");
        double leveys = scanner.nextDouble();
        double pituus = scanner.nextDouble();
        double korkeus = scanner.nextDouble();

        System.out.println("Paljonko litralla saadaan maalattua neliöitä: ");
        double maalausTehokkuus = scanner.nextDouble();

        double maalinTarve = ((leveys + leveys + pituus + pituus) * korkeus) / maalausTehokkuus;

        System.out.println("Maalin tarve on " + kaksiDesimaalia.format(maalinTarve).replace(".", ",") + " litraa");

        scanner.close();
    }
}

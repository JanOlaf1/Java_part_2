import java.util.Scanner;
import java.text.DecimalFormat;
public class Peltipoliisi {
    public static void main(String[] args) {
        Scanner tutka = new Scanner(System.in);
DecimalFormat kaksi = new DecimalFormat("0.00");
        System.out.println("Anna nopeutesi: ");
        int nopeus = tutka.nextInt();
        int raja = 80;

        if (nopeus > raja && nopeus <= raja + 20) {
            System.out.println("Rikesakko");
        } else if (nopeus > raja + 20) {
            System.out.println("Päiväsakko");
            System.out.println("Anna nettokuukausitulosi: ");
            double tulot = tutka.nextDouble();
            double sakko = (tulot - 255) / 60;

            if (sakko >= 6) {
                System.out.println("Päiväsakon määrä on " + kaksi.format(sakko) + " euroa");
            } else {
                System.out.println("Päiväsakon määrä on 6,00 euroa");
            }
        } else {
            System.out.println("Ei sakkoja");
        }
        tutka.close();
    }
}

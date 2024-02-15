import java.util.Scanner;
import java.text.DecimalFormat;

public class Kotitalousvahennys {
    /*
     * Tämä ohjelma, nimeltään Kotitalousvahennys, laskee käyttäjän saaman
     * kotitalousvähennyksen määrän. Ohjelma kysyy työkorvausten euromääriä niin
     * kauan, kunnes käyttäjä antaa korvauksen määräksi nolla. Kotitalousvähennyksen
     * määrä on 40% työkorvauksesta. Vähennyksen omavastuu on 100 euroa, ja vähennys
     * lasketaan kaavalla työkorvausten summa * 40 / 100.0 - omavastuu.
     * Kotitalousvähennyksen enimmäismäärä on 2 250 euroa.
     */
    public static void main(String[] args) {
        Scanner tutka = new Scanner(System.in);
        int omavastuu = 100;
        double summa = 0;
        double lasku = 0;

        DecimalFormat two = new DecimalFormat("0.00");

        while (true) {
            System.out.println("Anna työkorvauksen määrä (0 lopettaa): ");
            double vastaus = tutka.nextDouble(); 

            if (vastaus == 0) {
                summa = (lasku * 40 / 100.0 - omavastuu);

                if (summa > 2250) {
                    summa = 2250;
                } else if (summa <= 0) {
                    summa = 0;
                }

                break;
            }

            lasku += vastaus;
        }

        System.out.println("Kotitalousvähennyksen määrä on " + two.format(summa) + " euroa");

        tutka.close();
    }
}

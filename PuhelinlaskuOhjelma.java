import java.util.Scanner;
import java.text.DecimalFormat;
public class PuhelinlaskuOhjelma {
    public static void main(String[] args) {
        Scanner tutka = new Scanner(System.in);
        double yhteissumma = 0.0;
DecimalFormat kaksi = new DecimalFormat("0.00");
        for (int i = 1; i <= 2; i++) {
            System.out.println("Anna rahasumma puhelinlaskulle " + i);
            String input = tutka.nextLine();

            try {
                double summa = Double.parseDouble(input);
                yhteissumma += summa;
            } catch (NumberFormatException numero) {
                System.out.println("Virheellinen syöte, syötä luku.");
                i--; 
            }
        }

        System.out.printf("Haluttu yhteissumma lukuna on ", kaksi.format(yhteissumma));
        tutka.close();
    }
}

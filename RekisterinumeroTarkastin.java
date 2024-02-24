import java.util.Scanner;

public class RekisterinumeroTarkastin {
    public static void main(String[] args) {
        Scanner tutka = new Scanner(System.in);
        System.out.println("Syötä rekisterinumero (q-kirjain lopettaa): ");
        String rekisterinumero = tutka.nextLine();

        while (!rekisterinumero.equalsIgnoreCase("q")) {
            if (onKelvollinenRekisterinumero(rekisterinumero)) {
                System.out.println( rekisterinumero + " on kelvollinen rekisterinumero.");
            } else {
                System.out.println( rekisterinumero + " ei ole kelvollinen rekisterinumero.");
            }

            System.out.println("Syötä rekisterinumero (q-kirjain lopettaa): ");
            rekisterinumero = tutka.nextLine();
        }

        tutka.close();
    }

    private static boolean onKelvollinenRekisterinumero(String rekisterinumero) {
    	String regex = "^[AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZzÄäÅåÖö]{2,3}-\\d{1,3}$";
        return rekisterinumero.matches(regex);
    }
}

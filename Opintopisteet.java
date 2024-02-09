import java.util.Scanner;

public class Opintopisteet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Anna lukukausien määrä: ");
        int lukukausienMaara = scanner.nextInt();

        int yhteensaOpintopisteet = 0;

        for (int i = 1; i <= lukukausienMaara; i++) {
            System.out.print("Anna " + i + ". lukukauden opintopisteesi: ");
            int opintopisteetLukukaudella = scanner.nextInt();
            yhteensaOpintopisteet += opintopisteetLukukaudella;
        }

        int tavoiteOpintopisteet = lukukausienMaara * 30;
        int puuttuvatOpintopisteet = tavoiteOpintopisteet - yhteensaOpintopisteet;
        int tutkintoonVaadittavatOpintopisteet = 210;
        int puuttuvatTutkintoonOpintopisteet = tutkintoonVaadittavatOpintopisteet - yhteensaOpintopisteet;

        System.out.println("Sinulla pitäisi olla tähän mennessä " + tavoiteOpintopisteet + " opintopistettä.");
        System.out.println("Sinulla on " + yhteensaOpintopisteet + " opintopistettä.");

        if (yhteensaOpintopisteet < tavoiteOpintopisteet) {
            System.out.println("Olet jäljessä tavoitteesta.");
        } else if (yhteensaOpintopisteet == tavoiteOpintopisteet) {
            System.out.println("Olet tavoitteessa.");
        } else {
            System.out.println("Olet edellä tavoitteesta.");
        }

        System.out.println("Tutkinnosta puuttuu vielä " + puuttuvatTutkintoonOpintopisteet + " opintopistettä.");

        scanner.close();
    }
}

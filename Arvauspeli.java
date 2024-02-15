import java.util.Random;
import java.util.Scanner;

public class Arvauspeli {

    static Random satunnaisgeneraattori = new Random(); // älä muuta tätä riviä!

    public static void main(String[] args) {
    	// Tämän satunnaisen luvun on oltava ohjelmasi oikea vastaus!
        int satunnaisluku = satunnaisgeneraattori.nextInt(100);

        arvaaLuku(satunnaisluku);
    }

    public static void arvaaLuku(int oikeaLuku) {
        Scanner tutka = new Scanner(System.in);
        int arvaus;

        System.out.println("Arvaa ajattelemani luku väliltä 0-99:");

        do {
            arvaus = tutka.nextInt();

            if (arvaus < oikeaLuku) {
                System.out.println("Oikea luku on suurempi kuin " + arvaus + "!");
            } else if (arvaus > oikeaLuku) {
                System.out.println("Oikea luku on pienempi kuin " + arvaus + "!");
            } else {
                System.out.println("Oikein!");
            }

            if (arvaus != oikeaLuku) {
                System.out.println("Arvaa uudelleen:");
            }

        } while (arvaus != oikeaLuku);

        tutka.close();
    }
}

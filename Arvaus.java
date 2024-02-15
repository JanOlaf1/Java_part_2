import java.util.Scanner;

public class Arvaus {
    public static void main(String[] args) {
        Scanner tutka = new Scanner(System.in);
        int mysteeri_luku = 78; 
        System.out.println("Arvaa lukua väliltä 1-100: ");
        
        int yritykset = 0;
        while (true) {
            int arvaus = tutka.nextInt();
            yritykset++;

            if (arvaus == mysteeri_luku) {
                System.out.println("Arvasit oikein. Arvauksia oli " + yritykset);
                break;
            } else if (arvaus > mysteeri_luku) {
                System.out.println("Arvaa pienempää: ");
            } else {
                System.out.println("Arvaa suurempaa: ");
            }
        }

        tutka.close();
    }
}

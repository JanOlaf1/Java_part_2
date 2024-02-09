import java.util.Scanner;

/*Tämä ohjelma, nimeltään Puoluetuki, 
 *on suunniteltu laskemaan puolueen vuotuisen puoluetuen määrän. 
 *Ohjelma huomioi, että yhden kansanedustajan puoluetuki on 148 175 euroa.*/
public class Puoluetuki {
	public static void main(String[] args) {
		Scanner vastaus = new Scanner(System.in);
		System.out.println("Anna kansanedustajien lukumäärä: ");
		int luku = vastaus.nextInt();
		int laskettu = 148175 * luku;
		System.out.println("Puoluetuen määrä on " + laskettu + " euroa");
		vastaus.close();
	}

}

import java.util.Scanner;

public class Paivasakko {
	public static void main(String[] args) {
		Scanner sk = new Scanner(System.in);
		System.out.println("Anna nettotulot: ");
		int nettotulot = sk.nextInt();
		int paivasakko = (nettotulot - 255) / 60;
		System.out.println("Nettotuloilla " + nettotulot + " päiväsakko on " + paivasakko + " euroa");
	sk.close();
	}
}

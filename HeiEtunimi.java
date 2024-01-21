import java.util.Scanner;

public class HeiEtunimi {
	public static void main(String[] args) {
		Scanner nimi = new Scanner(System.in);
		System.out.println("Syötä etunimi? ");
		String vastaus = nimi.nextLine();
		System.out.println(vastaus);
		nimi.close();
	}

}

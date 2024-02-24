import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Erapaiva {
	/*
	 * Program tells when is the due date for the bill. Inputed time is 14 days/2
	 * weeks
	 */
	public static void main(String[] args) {
		Scanner tutka = new Scanner(System.in);
		System.out.println("Anna laskun päivämäärä (vvvv-kk-pp): ");
		String syöte = tutka.next();
		DateTimeFormatter formaatio = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate laskupva = LocalDate.parse(syöte, formaatio);
		LocalDate erapaiva = laskupva.plusDays(14);
		System.out.println("Eräpäivä on " + erapaiva.format(formaatio));
		tutka.close();
	}
}

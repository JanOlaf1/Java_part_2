import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Juhannus {
    public static void main(String[] args) {
        Scanner tutka = new Scanner(System.in);
        System.out.println("Syötä vuosi: ");
        int vuosi = tutka.nextInt();
        
        LocalDate kesä = LocalDate.of(vuosi, 6, 20);
        DayOfWeek vkoPäivä = kesä.getDayOfWeek();

        int oikeaPvä = (DayOfWeek.SATURDAY.getValue() + 7 - vkoPäivä.getValue()) % 7;
        LocalDate juhannus = kesä.plusDays(oikeaPvä);

        System.out.println("Juhannus on " + juhannus.getDayOfMonth() + "." + juhannus.getMonthValue() + "." + juhannus.getYear() + ".");

        tutka.close();
    }
}

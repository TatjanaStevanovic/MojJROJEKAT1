import java.time.LocalDate;
import java.util.Scanner;

public class TestPunoletnosti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesite godinu rodjenja: ");

        int godinaRodjenja = scanner.nextInt();
        // >= <= > <
        /*
        resenje 1 za bonus
        System.out.print("Unesite kalendarsku godinu");
        int kalendarskaGodina = scanner.nextInt();
         */
        LocalDate localDate = LocalDate.now(); // resenje 2 za bonus
        int kalendarskaGodina = localDate.getYear();
        //localDate.getMonth();
        //localDate.getDayOfMonth();
        if (kalendarskaGodina - godinaRodjenja >= 18) {
            System.out.println("Osoba je punoletna");
        } else {
            System.out.println("Osoba je maloletna");

        }
    }
}

import java.util.Scanner;

public class Skener {
    public static void main(String[] args) { // Za main metodu skranica 'psvm'
        System.out.println("Ovaj program skenira broj sa stanadardnog ulaza"); // Za print skracenica 'sout'

        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesi neki broj sa tastature: ");

        int kutijaZaBrojKorinika = scanner.nextInt();
        //int if = 10; 'rezervisane' reci ne mogu koristiti kao imena promeljivih

        //System.out.println("Vas broj je: " + kutijaZaBrojKorinika);

        if (kutijaZaBrojKorinika == 10) {
            System.out.println("Vas broj je 10");
        } else {
            System.out.println("Vas broj nije 10");
        }

    }
}











import java.util.Scanner;

public class daniUNedelji {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // \n oznacava novi red
        System.out.println("Unesi dan u nedelji: \n 1-Ponedeljak" +
                " \n 2-Utorak \n 3-sreda \n 4-cetvrtak" +
                " \n 5-petak \n 6-subota \n 7-nedelja");

        int dan = scanner.nextInt();

        if (dan == 1) {
            System.out.println("danas je ponedeljak");
        } else if (dan == 2) {
            System.out.println("danas je utorak");
        } else if (dan == 3) {
            System.out.println("danas je sreda");
        } else if (dan == 4) {
            System.out.println("danas je cetvratk");
        } else if (dan == 5) {
            System.out.println("danas je petak");
        } else if (dan == 6) {
            System.out.println("danas je subota");
        } else if (dan == 7) {
            System.out.println("danas je nedelja");
        } else {
            System.out.println("Ne postoji dan " + dan + " u nedelji");
        }
    }
}

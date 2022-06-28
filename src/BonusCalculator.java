import java.util.Scanner;

public class BonusCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite pocetnu platu");
        double plata = scanner.nextDouble();

        System.out.println("Unesite broj upspesnih prodaja");
        int brojProdaja = scanner.nextInt();

        if (brojProdaja >= 10) {
            System.out.println("Vasa nova plata je " + (plata + plata * 0.2));
        } else if (brojProdaja >= 5) {
            System.out.println("Vasa nova plata je " + (plata + plata * 0.1));
        } else if (brojProdaja >= 2) {
            System.out.println("Vasa nova plata je " + (plata + plata * 0.05));
        } else if (brojProdaja == 1) {
            System.out.println("Vasa nova plata je " + (plata + plata * 0.01));
        } else {
            System.out.println("Niste izvrsili ni jednu prodaju");


            

        }
    }
}
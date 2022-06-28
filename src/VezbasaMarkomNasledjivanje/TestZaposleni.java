package VezbasaMarkomNasledjivanje;

import java.util.Scanner;

public class TestZaposleni {
    public static void main(String[] args) {

        Zaposleni pera = new Zaposleni("Pera", "Peric", 1000);
        System.out.println("Inicijalna plata "+pera.getPlata());
        //manipulacija polja (stanja) objekata 'pera'
        //pera.plata = 100; ne moze ako je plata private
        //pera.ime = "Milos";
//        System.out.println("ups, plata je smanjena..." + pera.getPlata());
//        System.out.println("Pera je sad: " + pera.getIme());
        System.out.println("Pera je vredno radio...");
        pera.setPlata(1200);
        System.out.println("Nova" + pera.getPlata());
        Scanner scan = new Scanner(System.in);


    }Zaposleni pera = new Zaposleni("Pera", "Peric", 1000); //lokacija 123
//        Zaposleni zika = new Zaposleni("Zika", "Zikic", 1000); //456
//        Zaposleni mika = new Zaposleni("Mika", "Mikic", 1000); //789




}





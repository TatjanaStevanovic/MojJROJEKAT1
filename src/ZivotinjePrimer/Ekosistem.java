package ZivotinjePrimer;

import java.util.ArrayList;

public class Ekosistem {
    public static void main(String[] args) {
        Zivotinja z1 = new Macka("Manki", "Wiskas", 10);
        Patka p1 = new Patka("Paja", "crvi", 5);
        Zivotinja z2 = new Macka("Silver", "Wiskas", 10);

        ArrayList<Zivotinja> listaZivotinja = new ArrayList<>();

        listaZivotinja.add(z1);
        listaZivotinja.add(p1);
        listaZivotinja.add(z2);

        for (Zivotinja z : listaZivotinja) {
            if (z instanceof Macka) {
                System.out.print("Macka se zove ");
            }
            if (z instanceof Patka) {
                System.out.print("Patka se zove ");

            }
            System.out.print(z.getIme() + " i kaze ");
            z.proizvediZvuk();
        }
    }
}

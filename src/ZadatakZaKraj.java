public class ZadatakZaKraj {
    public static void main(String[] args) {

    }
    //implementirati metodu brojSamoglasnika:
    //ulazni parametri : String rec
    //izlazni tip: int

    public static int brojSamoglasnika(String rec) {
        String[] nizKaraktera = rec.split("");
        int brojSamoglasnika = 0;
        for (int i = 0; i < nizKaraktera.length; i++) {
            if (nizKaraktera[i].equalsIgnoreCase("a") ||
                    nizKaraktera[i].equalsIgnoreCase("e") ||
                    nizKaraktera[i].equalsIgnoreCase("i") ||
                    nizKaraktera[i].equalsIgnoreCase("o") ||
                    nizKaraktera[i].equalsIgnoreCase("u"))
                brojSamoglasnika++;
        }

        return brojSamoglasnika;
    }
}

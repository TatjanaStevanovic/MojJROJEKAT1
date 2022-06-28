import java.util.Arrays;

public class BrojReci {
    //napravi metodu koja prima kao parametar String a vraca kao rezultat broj reci u datom string-u.

    public static void main(String[] args) {

        String recenica= "Ovo je mnogo tesko!";
        String[] jedanNiz=recenica.split( "");


        for(int i=0; i< jedanNiz.length; i++) {
            System.out.println(jedanNiz[i]);
        }
    }
}

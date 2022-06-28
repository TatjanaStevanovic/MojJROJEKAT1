public class NizZadatak {
    public static void main(String[] args) {

        int[] niz = {1, 222, 333, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        //System.out.println(niz[0]); // prvi element niza
        //System.out.println(niz[1]); // drugi element element niza
        //System.out.println(niz[2]); // treci element element niza


        for (int i = 0; i < niz.length; i++) {
            if (niz[i] % 3 == 0 && niz[i] % 5 == 0) {
                System.out.println("FizzBuzz " + niz[i]);
            } else if (niz[i] % 5 == 0) {
                System.out.println("Fizz " + niz[i]);
            } else if (niz[i] % 3 == 0) {
                System.out.println("Buzz " + niz[i]);
            } else {
                System.out.println(niz[i]);
            }
        }
    }
}
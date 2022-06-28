package VezbasaMarkomNasledjivanje;

public class PravougliTrougao extends Trougao{
//Napraviti klasu: PravougliTrougao
//- polja: double a, b,c
//- konstruktor koji prima a,b,c
//- metodu obim koja racuna obim trougla
//- metodu povrsina koja racuna povrsinu pravouglog trougla

    public PravougliTrougao(double kateta1, double kateta2, double hipotenuza) {
        super(kateta1, kateta2, hipotenuza);
    }

    public double povrsina() {
        return super.getA() * super.getB() / 2;
    }


}

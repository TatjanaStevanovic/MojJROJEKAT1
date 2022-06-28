package VezbasaMarkomNasledjivanje;

public class TestTrougao {
    public static void main(String[] args) {
        JednakostranicniTrougao t1 = new JednakostranicniTrougao(3.0); //a = 3.0
        System.out.println("Obim: " + t1.obim());
        System.out.println("Povrsina: " + t1.povrsina());

        JednakokrakiTrougao t2 = new JednakokrakiTrougao(4, 10);
        System.out.println("Obim: " + t2.obim());
        System.out.println("Povrsina: " + t2.povrsina());

        PravougliTrougao t3 = new PravougliTrougao(3, 4, 5);
        System.out.println("Obim: " + t3.obim());
        System.out.println("Povrsina: " + t3.povrsina());

    }
}
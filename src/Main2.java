public class Main2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        double sum = ((double) a) / ((double) b);

        System.out.println(sum);

        double a1 = 5.0;
        double b1 = 10.0;

        double sum1 = a1 / b1;

        // wypisuje na ekran jakas liczbe
        System.out.println(sum1);

        /*double d = 5.5;
        int i = (int) d;

        System.out.println(i);*/

        int l1 = 7;
        int l2 = 5;

        int mod = l1 % l2;
        System.out.println(mod);

        String imie = "Mateusz";
        String nazwisko = "Bereda";

        System.out.println(imie + " " + nazwisko);

        char litera1 = 'A';
        char litera2 = 'l';
        char litera3 = 'a';

        String slowo = "" + litera1 + litera2 + litera3;
        System.out.println(slowo);

        int liczba1 = 5;
        int liczba2 = 10;

        boolean wynikPorownania = liczba1 != liczba2;
        System.out.println(wynikPorownania);

        boolean bool1 = false;
        boolean bool2 = true;

        System.out.println(!bool2);

        liczba1 = liczba1 + 1;

        liczba1++;

        liczba1--;

        int i = 0;
        System.out.println("****************************************");
        System.out.println(i++);
        System.out.println(++i);

        System.out.println(i--);
        System.out.println(--i);
    }
}

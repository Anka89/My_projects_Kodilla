public class OperacjeNaZmiennych {
    public static void main (String[] args) {

        int Liczba = 10;
        int dzielnik = 50;
        String space = " ";
        int modulo = Liczba % dzielnik;

        if(modulo == 0) {

            System.out.println("Liczba 7 jest dzielnikiem liczby" + space + Liczba + space + ":)");

        } else {

            System.out.println("Liczba 7 NIE jest dzielnikiem liczby" + space + Liczba + space + ":(");
        }
    }
}

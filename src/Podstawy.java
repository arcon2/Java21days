public class Podstawy {
    public static void main(String[] args) {


        int wynik1, wynik2, wynik3, wynik4, wynik5;
        double wynik6;
        int liczba1 = 56;
        int liczba2 = 16;

        wynik1 = liczba1 + liczba2;
        wynik2 = liczba1 - liczba2;
        wynik3 = liczba1 * liczba2;
        wynik4 = liczba1 / liczba2;
        wynik5 = liczba1 % liczba2;
        wynik6 =wynik4+(wynik5*0.1);

        System.out.println("Wynik dodawania          = "+wynik1);
        System.out.println("Wynik odejmowania        = "+wynik2);
        System.out.println("Wynik mnożenia           = "+wynik3);
        System.out.println("Wynik dzielenia          = "+wynik4);
        System.out.println("Wynik dzielenia modulo   = "+wynik5);
        System.out.println("Wynik dzielenia poprawny = "+wynik4+","+wynik5);
        System.out.println("Wynik dzielenia poprawny = "+wynik6);

        wynik4++;
        wynik4++;
        wynik4++;
        System.out.println("Inkrementacja ++ "+wynik4);
        wynik4--;
        wynik4--;
        wynik4--;
        System.out.println("Dekrementacja -- "+wynik4);
    }
}

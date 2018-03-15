import java.util.Scanner;

public class SystemPunktowy
{
    public static void main(String[] args) {
        double punktyStyl, punktyEfekt, punktyRezultat, wynikStyl, wynikEfekt, wynikRezultat, wynik;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj punkty za styl: ");
        punktyStyl=scanner.nextDouble();
        System.out.println("Podaj punkty za efekt: ");
        punktyEfekt=scanner.nextDouble();
        System.out.println("Podaj punkty za rezultat: ");
        punktyRezultat=scanner.nextDouble();

        wynikStyl=punktyStyl*0.2;
        wynikEfekt=punktyEfekt*0.3;
        wynikRezultat=punktyRezultat*0.5;
        wynik=wynikStyl+wynikEfekt+wynikRezultat;

        System.out.println("Wynik to "+wynik);


    }
}

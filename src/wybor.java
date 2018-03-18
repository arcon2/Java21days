import java.util.Scanner;

public class wybor {
    public static void main(String[] args) {
        String imie, nazwisko;
        int wiek;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie: ");
        imie = scanner.next();
        System.out.println("podaj nazwisko: ");
        nazwisko = scanner.next();
        System.out.println("Podaj wiek: ");
        wiek = scanner.nextInt();
        System.out.println("Wydrukować dane naciśnij 1");
        System.out.println("Jeśli nie naciśnij 2");

        int dane;
        dane = scanner.nextInt();
        switch (dane) {
            case 1:
                System.out.println("Twoje imie to " + imie);
                System.out.println("Twoje nazwisko to " + nazwisko);
                System.out.println("Twooj wiek to " + wiek);
                break;
            case 2:
                System.out.println("Brak wydruku");
                break;
            default:
                System.out.println("Nie ma takiej opcji");
        }
    }
}

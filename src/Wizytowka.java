import java.util.Scanner;

public class Wizytowka
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String imie, nazwisko;
        int telefon;
        System.out.println("Podaj imie: ");
        imie=scanner.next();
        System.out.println("Podaj nazwisko: ");
        nazwisko=scanner.next();
        System.out.println("Podaj telefon: ");
        telefon=scanner.nextInt();
        System.out.println("-------------------------");
        System.out.println("|                      ");
        System.out.println("| Imie      | "+imie);
        System.out.println("| Nazwisko  | "+nazwisko);
        System.out.println("| Tel:      | "+telefon);

        System.out.println("-------------------------");
    }
}

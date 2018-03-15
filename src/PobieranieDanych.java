import java.util.Scanner;

public class PobieranieDanych
{
    public static void main(String[] args) {
        String imie, nazwisko;
        int wiek;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj zwoje imie: ");
        imie=scanner.next();
        System.out.println("Podaj swoje nazwisko: ");
        nazwisko=scanner.next();
        System.out.println("podaj swoi wiek w latach: ");
        wiek= scanner.nextInt();
        System.out.println("Witaj "+imie+" "+nazwisko);
        System.out.println("Masz "+wiek+" lat");
    }
}

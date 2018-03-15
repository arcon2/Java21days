import java.util.Scanner;

public class Instrukcje
{
    public static void main(String[] args) {

        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        a=scanner.nextInt();

    if (a == 10) {
        System.out.println("Twoja liczba jest równa 10");
    } else if (a < 10) {
        System.out.println("Twoja liczba jest mniejsza od 10");
    } else if (a > 10) {
        System.out.println("Twoja liczba jest większa od 10");
    }

}


    }


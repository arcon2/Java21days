import java.util.Scanner;

public class Switch
{
    public static void main(String[] args) {
        int lata;
        Scanner scaner = new Scanner(System.in);
        System.out.println("Podaj wiek: ");
        lata=scaner.nextInt();

        switch (lata){

            case 1:
                System.out.println("Masz tok");
                break;
            case 2:
                System.out.println("Masz dwa lata");
                break;
            case 3:
                System.out.println("Masz dwa lata");
                break;
            case 4:
                System.out.println("Masz trzy lata");
                break;
            case 5:
                System.out.println("Masz cztery lata");
                break;
                default:
                System.out.println("Nie ma takiej opcji");
        }



    }

}

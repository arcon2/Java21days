import java.util.Scanner;

public class SortowanieLiczb
{
    public static void main(String[] args) {

        int a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę a: ");
        a=scanner.nextInt();
        System.out.println("Podaj liczbę b: ");
        b=scanner.nextInt();
        System.out.println("Podaj liczbę c: ");
        c=scanner.nextInt();

       for (int i=0;i<=100;i++)
       {
           if (a==i)
               System.out.println("a= "+a);
           if (b==i)
               System.out.println("b= "+b);
           if (c==i)
               System.out.println("c= "+c);
       }

    }
}

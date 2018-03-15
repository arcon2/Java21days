public class Petle
{
    public static void main(String[] args) {
        //tablica
        int tablica []=new int[7];
        tablica[0]=9;
        tablica[1]=6;
        tablica[2]=8;
        tablica[3]=4;
        tablica[4]=7;


        //pętla for
        for(int i=0;i<tablica.length;i++) {
            System.out.println(tablica[i]);
        }
        //pętla while
        int n=10;
        while (n>0)
        {
            System.out.println("Cokolwiek "+n);
            n--;
        }
        //petla do while
        int d=0;
        do {
            System.out.println("tekst");
            d++;
        }
        while (d<5);
        {
            System.out.println("Koniec");
        }

    }
}

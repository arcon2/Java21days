public class Tablice
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

        int tablicaDruga[] = new int[7];
        for (int y=0; y<tablicaDruga.length; y++) {
            System.out.println(y);
        }

        //tablice wielowyniarowe
        int tabliceDwie [][] =  {{2,3,4},{1,2,3}};
        for (int i=0;i<tabliceDwie.length;i++)
        {
            for (int j=0;j<tabliceDwie[i].length;j++)
            {
                System.out.println(tabliceDwie[i][j]);
            }
        }

    }


}

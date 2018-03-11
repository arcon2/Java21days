public class DzienCzwartyCwiczenie02 {
    public static void main(String[] args) {
        int[] denver ={1700000,4600000,2100000};
        int[] phil = new int[denver.length];
        int[] total = new int[denver.length];
        int avargate;

        phil[0]=1_800_000;
        phil[1]=5_000_000;
        phil[2] = 2_500_000;

        total[0]=denver[0]+phil[0];
        total[1]=denver[1]+phil[1];
        total[2]=denver[2]+phil[2];
        avargate=(total[0]+total[1]+total[2])/3;

        System.out.println("Produkcja w 2012: ");
        System.out.format("%,d%n",total[0]);
        System.out.println("Produkcja w 2013: ");
        System.out.format("%,d%n",total[1]);
        System.out.println("Produkcja w 2014: ");
        System.out.format("%,d%n",total[2]);
        System.out.println("średnia produkcja: ");
        System.out.format("%,d%n",avargate);

    }
}

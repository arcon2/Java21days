import java.util.StringTokenizer;

public class DzienTrzeciCwiczenie01 {
    public static void main(String[] args) {
        String imie, nazwisko;
        StringTokenizer dataUrodzenia;
        String  dataUrodzeniaCzlowieka;
        String i;
        String n;


        imie="Arkadiusz";
        nazwisko="Mistrz";
        dataUrodzeniaCzlowieka="22/08/1972";
        dataUrodzenia=new StringTokenizer(dataUrodzeniaCzlowieka,"/");



        System.out.println(imie+" "+nazwisko+" urodził się dnia "+dataUrodzenia.nextToken());
        System.out.println(imie+" "+nazwisko+" urodził się mies "+dataUrodzenia.nextToken());
        System.out.println(imie+" "+nazwisko+" urodził się rok  "+dataUrodzenia.nextToken());
    }
}

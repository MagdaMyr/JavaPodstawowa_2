/*
Zad. 2	//switch
Napisz program, który dla podanej daty określi dzień tygodnia. Do programu przekazujemy trzy argumenty:
d (dzień), m (miesiąc, gdzie 1 oznacza styczeń, 2 luty itd.), y (rok). Skorzystaj z następujących wzorów:
y0 = y − (14 − m) / 12
x = y0 + y0/4 − y0/100 + y0/400
m0 = m + 12 × ((14 − m) / 12) − 2
d0 = (d + x + 31m0 / 12) mod 7
d0 odpowiada wyznaczonemu dniu tygodnia, gdzie 0 oznacza niedzielę, 1 poniedziałek itd.
Dla podanych wartości d, m, y wyświetl dzień tygodnia, korzystając z konstrukcji switch.
 */

import java.util.Scanner;

public class ZadDom2 {
    public static void main(String[] args) {
        //1. Pobieramy od uzytkownika kolejno: dzien, miesiac, rok
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj dzien: ");
        int d = sc.nextInt();
        System.out.println("Podaj miesiac: ");
        int m = sc.nextInt();
        System.out.println("Podaj rok: ");
        int y = sc.nextInt();
        String date = d + "." + m + "." + y;

        //2. wykonujemy kolejno podane wzory
        int y0 = y - (14 - m) / 12;
        int x = y0 + (y0 / 4) - (y0 / 100) + (y0 / 400);
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + 31 * m0 / 12) % 7;

        //3. Mapujemy liczbe na dzien przy pomocy switch
        System.out.print(date + " - ");
        switch(d0){
            case 0:
                System.out.print("niedziela");
                break;
            case 1:
                System.out.print("poniedzialek");
                break;
            case 2:
                System.out.print("wtorek");
                break;
            case 3:
                System.out.print("sroda");
                break;
            case 4:
                System.out.print("czwartek");
                break;
            case 5:
                System.out.print("piatek");
                break;
            case 6:
                System.out.print("sobota");
                break;
            default:
                System.out.println("Blad!");
        }
    }
}

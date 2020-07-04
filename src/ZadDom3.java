/*
Zad. 3	//pętle, operatory
Kod ISBN jest to 10-cyfrowy kod, który jednoznacznie identyfikuje daną książkę. Cyfra najbardziej na prawo jest
tzw. sumą kontrolną, i może być określona na podstawie pozostałych 9 cyfr z warunku:
d1 + 2d2 + 3d3 + ... + 10d10, gdzie dx oznacza cyfrę x patrząc od prawej.
Ta suma powinna być wielkrotnością liczby 11. Wartość kontrolna d1 może być jakąkolwiek liczbą
pomiędzy 0 a 10 (konwencja ISBN oznacza 10 poprzez X).
Przykład: dla kodu ISBN 020131452(d1) suma wg powyższego wzoru wynosi:
d1 + 2*2 + 3*5 + 4*4 + 5*1 + 6*3 + 7*1 + 8*0 + 9*2 + 10*0. Jedyną możliwą wartością kontrolną dla d1 może być tu 5,
ponieważ tylko podstawiając do wzoru 5 za d1 otrzymamy liczbę będącą wielokrotnością 11.
Twoim zadaniem jest napisanie programu, który przyjmuje ciąg 9 cyfr, wyznacza sumę kontrolną (d1)
i wyświetla pełen numer ISBN (10 cyfr z sumą kontrolną).
 */

import java.util.Scanner;

public class ZadDom3 {
    public static void main(String[] args){
        //ISBN-10: 83-900210-1-3

        //1. Wprowadzamy kod ISBN
        Scanner sc = new Scanner(System.in);
        System.out.println("Wprowadz 9 cyfr kodu ISBN: ");
        String isbn9 = sc.nextLine();
        char[] isbn9Chars = isbn9.toCharArray();    // ['8', '3', '9', '0', '0', '2', '1', '0', '1']
        int[] isbn9Nums = new int[9];

        for(int i = 0; i < isbn9Chars.length; i++) {
            //korzystamy z faktu, ze char to int zgodny z asiitable --> http://asciitable.com/
            //0 --> 48
            //isbn9Nums[i] = Integer.parseInt(String.valueOf(isbn9Chars[i]));
            isbn9Nums[i] = isbn9Chars[i] - 48;
        }

        //2. Wyznaczyc sume dla ISBN wg wzoru
        //isbn = 020131452(d1)
        //d1 + 2*2 + 3*5 + 4*4 + 5*1 + 6*3 + 7*1 + 8*0 + 9*2 + 10*0
        int isbnSum = 0;
        for(int i = 2; i < 11; i++){
            isbnSum += (i * isbn9Nums[10 - i]);
        }
        // i = 2, idx = 8
        // i = 3, idx = 7
        // i = 10, idx = 0

        //3. Wyznaczyc d1 - suma z d1 ma byc wielokrotnoscia 11
        int d1 = 11 - (isbnSum % 11);

        /* int d = 0;
        int tempSum;
        do {
            tempSum = isbnSum;
            tempSum += d;
            d++;
        }
        while(tempSum %11 ==0);
        int dp = d - 1; */

        if(d1 == 10) {
            System.out.println("Twój numer ISBN: " + isbn9 + 'X');
        }
        else {
            System.out.println("Twój numer ISBN: " + isbn9 + d1);
        }
    }
}

/*
Zad. 1	//tablice, pętle
Odczuwalną temperaturę możemy wyliczyć ze wzoru:
w = 35.74 + 0.6215 t + (0.4275 t - 35.75) v^(0.16)
Gdzie t jest temperaturą wyrażoną w Fahrenheitach, a v - prędkością wiatru (w milach na godzinę, mph).
Utwórz tablicę dwuwymiarową, której jeden wymiar odpowiada temperaturze w Fahrenhaitach, od -40 F
(co odpowiada -40 stopni Celsiusza) do 50 F (10 st C) co 10 F, a drugi wymiar - prędkości wiatru w mph,
od wartości od 5 mph (ok. 8 hm/h) do 75 mph (ok. 120 km/h), co 5 mph. Dla poszczególnych par wartości
wyznacz odczuwalną temperaturę i zapisz w odpowiednim miejscu tabeli (na ich "przecięciu").
Następnie pobierz od użytkownika wartość temperatury i prędkości w dozwolonych zakresach, odszukaj w
utworzonej tablicy odpowiadającą im wartość odczuwalnej temperatury i ją wyświetl.
 */
import java.util.Scanner;
public class ZadDom1 {
    public static void main(String[] args) {
        //0. utworz 2 tablice przechowuje v i temp zrodlowe
        double[] vArr = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75};
        double[] tempArr = {-40, -30, -20, -10, 0, 10, 20, 30, 40, 50};
        //1. utwórz tablice 2-wymiarowa
        //2. potrzebuje: typprzechowanej wartosci i rozmiar, czyli
        //typ: double
        //rozm w kierunku temp.: -40, -30, -20, ... 50 -> 10 elementow
        //rozm w kierunku v: 5, 10, 15, 20, 25, -> 15 elelmentow
        double[][] resultMatrix = new double[vArr.length][tempArr.length];

        //3. rM(1, 3) = f(10, -10) = -7,5;
        //Odczytac wartosc v i temp do obliczen i podstawic do wzoru - wynik umiescic w odp miejscu tab rM
        for (int v = 0; v < vArr.length; v++){
            for (int t = 0; t < tempArr.length; t++){
                resultMatrix[v][t] = 35.74 + 0.6215 * tempArr[t] + (0.4275 * tempArr[t] - 35.75) * Math.pow(vArr[v], 0.16);
            }
        }

        //mam juz uzupelniona cala tab wartosci - wyswietlic
        for (int v = 0; v < vArr.length; v++){
            for (int t = 0; t < tempArr.length; t++){
                System.out.println(String.format("f(%d, %d) = %f", (int) vArr[v], (int) tempArr[t], resultMatrix[v][t]));
            }
        }
        System.out.println("Tabela wartosci: ");
        for (int v = 0; v < vArr.length; v++) {
            for (int t = 0; t < tempArr.length; t++){
                System.out.println(resultMatrix[v][t] + "\t");
            }
            System.out.println();
        }
        System.out.println("Podaj v: <5, 10, 15... 75>");
        //5 -> vArr[0]
        //75 -> vArr[14]
        //userInput/5 - 1
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        int vIdx = userInput / 5 - 1;
        System.out.println("Podaj temp: <-40, -30... 50>");
        userInput = sc.nextByte();
        int tempIdx = (userInput + 40) / 10;

        System.out.println(String.format("f(%d, %d) = %f", (int) vArr[vIdx], (int) tempArr[tempIdx], resultMatrix[vIdx][tempIdx]));
    }
}

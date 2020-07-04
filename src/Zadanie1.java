public class Zadanie1 {
    public static void main(String[] args) {

        double temp = -40; //temperatura
        double wiatr = 5; //wiatr
        double srTemp = 0;
        srTemp = 35.74 + (0.6215 * temp) + ((0.4275 * temp) - 35.75) * Math.pow(wiatr, 0.16);

        double[][] tablica = new double[11][16];

        for(int i=0; i<tablica.length; i++){
            for (int j = 0; j < 16; j++){
                srTemp = 35.74 + (0.6215 * temp) + ((0.4275 * temp) - 35.75) * Math.pow(wiatr, 0.16);
                tablica[i][j] = srTemp;
                temp = temp + 10; //-30
                wiatr = wiatr + 5; //10
                System.out.print(tablica[i][j]+ " ");
            }
            wiatr = wiatr + 5;
            temp = temp - 90;
            System.out.println();
        }
        }
    }
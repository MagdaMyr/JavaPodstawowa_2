import java.util.Scanner;
public class Cwiczenie3 {
    public static void main(String[] args) {
        //y = f(x)
        long[] y = new long[1001];  //0...1000
        //y.length = 1001 - zwraca wielkosc tablicy
        for(int x = 0; x < y.length; x++) {
            //f(x)=x^3+23x^2-6x+99
            //f(1)=1+23-6+99=...
            //Math.pow(x, y) - zwraca double, nalezy przerzutowac na long
            y[x] = (long)(Math.pow(x, 3) + 23 * Math.pow(x, 2)) - 6 * x + 99;
            System.out.println(String.format("f(%d) = %d^3 + 23 * %d^2 -6 * %d + 99 = %d",
                    x, x, x, x, y[x]));
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("POLICZONE. Podaj dla jakiego x chcesz poznac wartosc funkcji: ");
        int n = sc.nextInt();

        System.out.println(String.format("f(%d) = %d^3 + 23 * %d^2 -6 * %d + 99 = %d",
                n, n, n, n, y[n]));
    }
}
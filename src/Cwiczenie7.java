import java.util.Scanner;

public class Cwiczenie7 {
    public static void main(String[] args) {
        System.out.println("Pokaz wartosc n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if(i % 2 != 0)
                System.out.println(i);
        }
    }
}

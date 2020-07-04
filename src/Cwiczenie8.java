/*import java.util.Scanner;
public class Cwiczenie8 {
    public static void main(String[] args){
        System.out.println("Proszę podac dla jakiej wartosci ma zostac wyznaczona silnia: ");
        int n = Scanner.nextInt();
        int it = 2;
        long silnia = 1; // w przypadku int dla duzych liczb np 17!
        StringBuilder strBldr = new StringBuilder();
        strBldr.append(n + "! = 1 * ");

        while(it <= n){
            silnia *= it;
            strBldr.append(it + " * ");
            it++;
        }
        String silniaTxt = strBldr.toString(); // 3! = 1*2*3* [spacja]
        int lastIndexOfMultiplication = silniaTxt.lastIndexOf('*');
        silniaTxt = silniaTxt.substring(0, lastIndexOfMultiplication); //3!= 1*2*3[spacja]
        silniaTxt += ("=" + silnia);

        System.out.println(silniaTxt); // 3! = 1*2*3 = 6
    }
}
/*/
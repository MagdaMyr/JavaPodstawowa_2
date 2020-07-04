public class Cwiczenie4 {
    public static void main(String[] args) {
        double randomNum = Math.random();
        System.out.println("Wygenerowana liczba: " + randomNum);
        //if- else
        //jeżeli liczba jest wieksza lub rowna 0.5...
        //w przeciwnym wypadku ...
        if (randomNum >= 0.5) {
            System.out.println("Wygenerowana liczba jest wieksza lub rowna 0.5");
        } else { // czyli jest mniejsza od 0.5
            System.out.println("Wygenerowana liczba jest mniejsza od 0.5");
        }
    }
}
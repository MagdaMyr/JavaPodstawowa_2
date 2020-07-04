public class Cwiczenie5 {
    //otrzymujemy wynik w punktach np. 75 i mowimy jaka jest z tego ocena
    //literowa: A, B, C, D, F
    //jest to koncepcja mapowania wartosci liczbowej na wartosc znakowa
    public static void main(String[] args) {
        int score = 75;
        if (score >= 90) {
            System.out.println("Ocena A");
        } else if (score >= 80) {
            System.out.println("Ocena B");
        } else if (score >= 70) {
            System.out.println("Ocena C");
        } else if (score >= 60) {
            System.out.println("Ocena D");
        } else if (score < 60) {
            System.out.println("Ocena F");
        }
    }
}

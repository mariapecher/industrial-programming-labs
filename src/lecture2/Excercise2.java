package lecture2;

public class Excercise2 {

    public static void printDigits(int n) {
        if (n < 10) {
            System.out.print(n);
            return;
        }

        printDigits(n / 10);
        System.out.print(" " + (n % 10));
    }
}

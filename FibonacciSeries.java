import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of terms in the Fibonacci Series: ");
        int numTerms = sc.nextInt();

        int num1 = 0, num2 = 1, num3, i;

        System.out.println("Fibonacci Series:");

        for (i = 0; i < numTerms; i++) {
            System.out.print(num1 + " ");

            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }

        sc.close();
    }
}
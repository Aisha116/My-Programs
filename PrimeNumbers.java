public class PrimeNumbers {

    public static void main(String[] args) {
        int startRange = 10;
        int endRange = 50;

        System.out.println("Prime numbers between " + startRange + " and " + endRange + " are:");
        generatePrimes(startRange, endRange);
    }

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to generate prime numbers within a range
    public static void generatePrimes(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
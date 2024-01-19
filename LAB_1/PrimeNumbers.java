// WAP in java to display prime no. between 0 to 100?

public class PrimeNumbers {

    public static void main(String[] args) {
        System.out.println("Prime numbers between 0 and 100:");

       
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Method to check if a number is prime
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; 
            }
        }

        return true;
    }
}


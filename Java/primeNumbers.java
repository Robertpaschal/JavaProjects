public class primeNumbers {
    public static void main(String[] args) {
        System.out.println("Prime number between 1 and 100:");

        System.out.printf("2 ");

        for (int n = 3; n <= 100; n++) {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(n); i ++){
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.printf("%d ", n);
            }
        }
        System.out.println();
    }
}

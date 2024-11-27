public class controlFlow {
    public static void main(String[] args) {
        int size = 12;

        System.out.print(" ");
        for (int a = 1; a <= size; a++) {
            System.out.printf("%4d", a);
        }
        System.out.println();

        for (int a = 1; a <= size; a++) {
            System.out.printf("%2d |", a);
            for (int b = 1; b <= size; b++) {
                System.out.printf("%4d", a * b);
            }
            System.out.println();
        }
    }
}

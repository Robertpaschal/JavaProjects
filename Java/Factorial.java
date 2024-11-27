public class Factorial {
    public static void main(String[] args) {
        int ans = 1;
        for (int n = 5; n > 0; n--) {
            ans *= n;
        }
        System.out.println("Factorial: " + ans);
    }
}

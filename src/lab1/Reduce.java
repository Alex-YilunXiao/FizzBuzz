package lab1;

public class Reduce {
    public static void main(String[] args) {
        int steps = reduce();
        System.out.println(steps);
    }

    private static int reduce() {
        int n = 100;
        int steps = 0;
        while (n > 0) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n - 1;
            }
            steps++;
        }
        return steps;
    }
}
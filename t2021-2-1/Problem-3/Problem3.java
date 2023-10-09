import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of 'x': ");
        int x = scanner.nextInt();

        if (x < 1) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.print("Output: ");
            for (int a = 1; a <= x; a++) {
                if (a % 2 != 0) {
                    System.out.print(a);

                    if (a < x && (a + 2) <= x) {
                        System.out.print(", ");
                    }
                }
            }
        }

        scanner.close();
    }
}

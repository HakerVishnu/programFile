import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of 'x': ");
        int x = scanner.nextInt();

        if (x < 1) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.print("Output: ");
            for (int a = 1; a <= x; a++) {
                System.out.print(a * 2 - 1);

                if (a < x) {
                    System.out.print(", ");
                }
            }
        }

        scanner.close();
    }
}

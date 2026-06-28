import java.util.Scanner;

public class factorial {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the factorial number");
        int n = sc.nextInt();
        System.out.print(n + "!\n");
        System.out.println("Display the formula of factorial series");
        System.out.print(n);
        for (int i = n - 1; i >= 1; i--) {

            System.out.print("*" + i);

        }
        System.out.println("\nThe result is");
        double mult = 1;
        for (int j = 1; j <= n; ++j) {
            mult = mult * j;

        }
        System.out.print(mult);

    }
}

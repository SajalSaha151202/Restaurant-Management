import java.util.Scanner;

public class Dis_term1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the number");
        int n = sc.nextInt();
        System.out.println("Display the numbers");
        for (int i = 1; i <= n; i++) {

            double sum = (2 * i - 1) * (Math.pow((-1), (i - 1)));
            System.out.print(sum + "\n");
        }

    }
}
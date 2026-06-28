import java.util.Scanner;

public class Dis_term3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the number");
        int n = sc.nextInt();
        System.out.println("Display the numbers");
        for (int i = 1; i <= n; i++) {

            double sum = Math.pow(i, 2) - 1;
            System.out.print(sum + "\n");
        }

    }
}

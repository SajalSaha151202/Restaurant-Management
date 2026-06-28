import java.util.Scanner;

public class Dis_term5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the number");
        int n = sc.nextInt();
        System.out.println("Display the numbers series");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(j);
            }
            System.out.print(" ");
        }

    }
}

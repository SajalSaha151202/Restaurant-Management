import java.util.Scanner;

public class Dis_term4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the number");
        int n = sc.nextInt();
        System.out.println("Display the numbers");
        int a = 0, b = 1, c = 2;
        for (int i = 1; i <= n; i++) {

            System.out.print(a + " ");
            int d = a + b + c;
            a = b;
            b = c;
            c = d;

        }

    }
}

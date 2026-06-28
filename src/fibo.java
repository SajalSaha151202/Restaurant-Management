import java.util.Scanner;

public class fibo {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.println("the fibonacci series is: ");
        System.out.println(a);
        System.out.println(b);
        for (int i = 0; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }

    }
}

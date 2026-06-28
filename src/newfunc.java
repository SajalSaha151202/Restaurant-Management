import java.util.Scanner;

public class newfunc {
    public static int Add(int m, int n) {
        int s = 0;
        s = m + n;
        return s;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a, b, r;
        System.out.print("enter the first number: ");
        a = sc.nextInt();
        System.out.print("enter the second number: ");
        b = sc.nextInt();

        r = Add(a, b);
        System.out.print("the sum is: " + r);
    }
}

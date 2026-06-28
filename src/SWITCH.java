import java.util.Scanner;

public class SWITCH {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        while (n != 0) {
            System.out.print("Enter the number : ");
            n = sc.nextInt();
            if (n == 0)
                break;
            if (n % 2 == 0) {
                System.out.println("It is even number\n");
            } else {
                System.out.println("It is odd number\n");
            }
        }

    }
}

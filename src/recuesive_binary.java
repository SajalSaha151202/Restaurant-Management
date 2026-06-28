import java.util.Scanner;

public class recuesive_binary {
    static void printBinary(int n) {
        int binary = 0, place = 1;
        while (n > 0) {
            int rem = n % 2;
            binary = binary + rem * place;
            place = place * 10;
            n = n / 2;

        }
        System.out.print("\t" + binary);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first number: ");
        int n1 = sc.nextInt();
        System.out.print("enter the last number: ");
        int n2 = sc.nextInt();
        for (int i = n1; i <= n2; i++) {
            if (i > 0) {
                printBinary(i);
            }
        }
    }
}

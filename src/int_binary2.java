import java.util.Scanner;

public class int_binary2 {
    public static void main(String args[]) {
        int n, r;
        String d = " ";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = in.nextInt();
        while (n != 0) {
            r = n % 2;
            d = Integer.toString(r) + d;
            n = n / 2;
        }
        System.out.println("The binaryy equivalent =" + d);
    }
}

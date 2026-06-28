import java.util.Scanner;

public class Sum_dig {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number ");
        int n = sc.nextInt();
        int sum = 0;
        while (n != 0) {
            int d = n % 10;
            sum = d + sum;
            n /= 10;
        }
        System.out.print("The sum of the digits in the number: " + sum);
        System.out.print("The sum of the digits in the number: " + sum);
    }
}


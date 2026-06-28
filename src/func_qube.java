import java.util.Scanner;

public class func_qube {
    public static double cube(int m) {

        double s = Math.pow(m, 3);
        return (s);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range: ");
        int n = sc.nextInt();
        System.out.println("display the numbers: ");
        for (int i = 1; i <= n; i++) {
            System.out.print("\t" + i);

        }
        System.out.println("display cube of the numbers: ");
        double r;
        for (int i = 1; i <= n; i++) {
            r = cube(i);
            System.out.print("\t" + i);
        }
    }
}

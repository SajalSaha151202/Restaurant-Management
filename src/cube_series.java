import java.util.Scanner;

public class cube_series {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter any length : ");
        int l = sc.nextInt();
        for (int i = 1; i <= l; i++) {
            double series = Math.pow(i, 3);

            System.out.println(series);
        }
    }
}

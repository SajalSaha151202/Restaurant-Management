import java.util.InputMismatchException;
import java.util.Scanner;

public class MainApp1 {
    public static void main(String args[]) {
        System.out.println("----- App Started -----");
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter no1");
            int no1 = sc.nextInt();
            System.out.println("Enter no2");
            int no2 = sc.nextInt();
            int res = no1 / no2;
            System.out.println("Result: " + res);
        } catch (InputMismatchException | ArithmeticException ex) {
            System.out.println("Exception Occured: " + ex);
        }
        System.out.println("----- App Finished Successfully -----");
    }
}

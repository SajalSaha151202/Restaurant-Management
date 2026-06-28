import java.util.InputMismatchException;
import java.util.Scanner;

public class MainApp {
    public static void main(String args[]) {
        System.out.println("----- App Started -----");
        Scanner sc = new Scanner(System.in);
        ;
        try {
            System.out.println("Enter no 1");
            int no1 = sc.nextInt();
            System.out.println("Enter no 2");
            int no2 = sc.nextInt();
            int res = no1 / no2;
            System.out.println("Result: " + res);
        } catch (InputMismatchException ime) {
            System.out.println("Input Mismatch Exception Occured " + ime);
        } catch (ArithmeticException ae) {
            System.out.println("Arithmetic Exception Occured " + ae);
        } finally {
            System.out.println("-----App Finished Successfully -----");
        }
    }

}

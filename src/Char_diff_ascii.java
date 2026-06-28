import java.util.Scanner;

public class Char_diff_ascii {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st character: ");
        char c1 = sc.next().charAt(0);
        System.out.print("Enter the 2nd character: ");
        char c2 = sc.next().charAt(0);
        int ascii_1 = c1;
        int ascii_2 = c2;
        int explicitAscii_1 = (int) c1;
        int explicitAscii_2 = (int) c2;
        System.out.println("the ascii value of " + c1 + " is: " + ascii_1);
        System.out.println("the ascii value of " + c2 + " is: " + ascii_2);
        int diff = ascii_1 - ascii_2;
        System.out.println("the difference of ascii value is: " + diff);


    }
}

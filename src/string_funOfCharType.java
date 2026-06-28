import java.util.Scanner;

public class string_funOfCharType {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character: ");
        char c = sc.next().charAt(0);
        if (Character.isLetter(c) == true) {
            if (Character.isUpperCase(c) == true) {
                System.out.print(c + " is upper case");
            }
            if (Character.isLowerCase(c) == true) {
                System.out.print(c + " is lower case");
            }
        } else {
            if (Character.isDigit(c) == true) {
                System.out.print(c + " is digit");
            } else {
                System.out.print(c + " is special character");
            }
        }
    }
}


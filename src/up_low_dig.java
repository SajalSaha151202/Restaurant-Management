import java.util.Scanner;

public class up_low_dig {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character: ");
        char ch = sc.next().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            System.out.print(ch + " is lower case character");
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(" and it is the vowel character");
            } else {
                System.out.println(" and it is the consonant character");
            }
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.print(ch + " is upper case character");
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.println(" and it is the vowel character");
            } else {
                System.out.println(" and it is the consonant character");
            }
        } else if (ch >= '0' && ch <= '9') {
            System.out.print(ch + " is integer character");
        } else {
            System.out.print("it is operational character");
        }
    }
}

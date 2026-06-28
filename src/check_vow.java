import java.util.Scanner;

public class check_vow {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter any character: ");
        char ch = sc.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println(ch + " is the vowel character");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is the digit character");
        } else {
            System.out.println(ch + " is the consonant character");
        }
    }
}

import java.util.Scanner;

public class upper_lower {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.next();
        if (Character.isUpperCase(s.charAt(0)) == true) {
            System.out.println("the string is in uppercase ");
            System.out.println("the lower case string is: ");
            for (int i = 0; i < s.length(); i++) {
                char a = Character.toLowerCase(s.charAt(i));
                System.out.print(a);
            }
        } else {
            System.out.println("the string is in lowercase ");
            System.out.println("the Upper case string is: ");
            for (int i = 0; i < s.length(); i++) {

                char b = Character.toUpperCase(s.charAt(i));
                System.out.print(b);
            }
        }
    }
}
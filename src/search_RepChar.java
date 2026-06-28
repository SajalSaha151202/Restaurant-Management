import java.util.Scanner;

public class search_RepChar {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        System.out.println("Enter the character to check the no of  repeating: ");
        char ch = sc.next().charAt(0);
        System.out.print("the no of repeating: ");
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;

            }
        }
        System.out.print(count);
    }
}

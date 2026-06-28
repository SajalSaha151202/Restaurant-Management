import java.util.Scanner;

public class alphabet {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i, j, p;
        char chr[] = new char[20];
        char t;
        String wd, str = " ";
        System.out.println("Enter your word: ");
        wd = sc.next();
        p = wd.length();
        for (i = 0; i < p; i++) {
            chr[i] = wd.charAt(i);
        }
        System.out.println("The ascending letter of string is: ");
        for (i = 0; i < p - 1; i++) {
            for (j = (i + 1); j < p; j++) {
                if (chr[i] > (chr[j])) {
                    t = chr[i];
                    chr[i] = chr[j];
                    chr[j] = t;
                    System.out.print(chr[j]);
                }
            }
        }

    }
}
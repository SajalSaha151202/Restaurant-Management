import java.util.Scanner;

public class polimorphism_succesive_discount {
    public static double discount(int n, int a) {

        int single_discount = n - (n * a / 100);
        System.out.println("the final amount after single discount: " + single_discount);
        return (single_discount);
    }

    public static double discount(int n, int a, int b) {
        int single_discount = n - (n * a / 100);
        int double_discount = single_discount - (single_discount * b / 100);
        System.out.println("the final amount after double discount: " + double_discount);
        return (double_discount);
    }

    public static double discount(int n, int a, int b, int c) {
        int single_discount = n - (n * a / 100);
        int double_discount = single_discount - (single_discount * b / 100);
        int triple_discount = double_discount - (double_discount * c / 100);
        System.out.println("the final amount after triple discount: " + triple_discount);
        return (triple_discount);
    }

    public static double discount(int n, int a, int b, int c, int d) {
        int single_discount = n - (n * a / 100);
        int double_discount = single_discount - (single_discount * b / 100);
        int triple_discount = double_discount - (double_discount * c / 100);
        int fourth_discount = triple_discount - (triple_discount * d / 100);
        System.out.println("the final amount after fourth discount: " + fourth_discount);
        return (fourth_discount);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("the actual amount is: ");
        int v = sc.nextInt();
        System.out.println("Enter the first discount percentage is: ");
        int w = sc.nextInt();
        System.out.println("Enter the second percentage is: ");
        int x = sc.nextInt();
        System.out.println("Enter the third percentage is: ");
        int y = sc.nextInt();
        System.out.println("Enter the fourth percentage is: ");
        int z = sc.nextInt();
        discount(v, w);
        discount(v, w, x);
        discount(v, w, x, y);
        discount(v, w, x, y, z);
    }
}

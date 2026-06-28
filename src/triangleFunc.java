import java.util.Scanner;

public class triangleFunc {
    public static int triangle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of first arms: ");
        int x = sc.nextInt();
        System.out.print("Enter the length of second arms: ");
        int y = sc.nextInt();
        System.out.print("Enter the length of third arms: ");
        int z = sc.nextInt();
        if (x == y && y == z) {
            System.out.print("It is equilateral triangle ");
        } else if ((x == y && y != z) || (x != y && y == z) || (x == z && x != y)) {
            System.out.print("It is iso-lateral triangle ");
        } else if (x != y && y != z && x != z) {
            System.out.print("It is scalar triangle ");
        }
        return 0;
    }

    public static void main() {
        triangle();
    }

}

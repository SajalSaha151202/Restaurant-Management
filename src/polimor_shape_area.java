import java.util.Scanner;

public class polimor_shape_area {
    public static double Area(double r) {
        double circle_area = 3.14 * r * r;
        return (circle_area);

    }

    public static int Area(int s) {
        int Square_area = s * s;
        return (Square_area);

    }

    public static int Area(int p, int h) {
        int parallelogram_area = p * h;
        return (parallelogram_area);
    }

    public static double Area(long d1, long d2) {
        double rhombus_area = 0.5 * d1 * d2;
        return (rhombus_area);
    }

    public static double Area(int a, int b, int h) {
        double trapezium_area = 0.5 * (a + b) * h;
        return (trapezium_area);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the radius of the circle: ");
        double a = sc.nextInt();
        System.out.println("enter the side of the square: ");
        int b = sc.nextInt();
        System.out.println("enter the hight of the parallelogram: ");
        int H = sc.nextInt();
        System.out.println("enter the braces of the parallelogram: ");
        int B = sc.nextInt();
        System.out.println("enter the first diagonal of the rhombus: ");
        long D1 = sc.nextInt();
        System.out.println("enter the second diagonal of the rhombus: ");
        long D2 = sc.nextInt();
        System.out.println("enter the small length of the trapezium: ");
        int l = sc.nextInt();
        System.out.println("enter the large length of the trapezium: ");
        int L = sc.nextInt();
        System.out.println("enter the hight of the trapezium: ");
        int h = sc.nextInt();

        double m = Area(a);
        System.out.println("The area of the circle is : " + m + "cm^2");
        double f = Area(b);
        System.out.println("The area of the square is : " + f + "cm^2");
        int u = Area(H, B);
        System.out.print("The area of the parallelogram is : " + u + "cm^2");
        double v = Area(D1, D2);
        System.out.println("The area of the rhombus is : " + v + "cm^2");
        double w = Area(l, L, h);
        System.out.println("The area of the trapezium is : " + w + "cm^2");
    }
}

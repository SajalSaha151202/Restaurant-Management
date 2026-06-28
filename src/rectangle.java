import java.util.Scanner;

public class rectangle {
    int length;
    int breadth;

    rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    void compute() {
        int area = length * breadth;
        System.out.println("The area is: " + area);
    }
}

class result {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle:  ");
        int len = sc.nextInt();
        System.out.print("Enter the breadth of the rectangle:  ");
        int bre = sc.nextInt();
        rectangle ob = new rectangle(len, bre);
        ob.compute();

    }
}

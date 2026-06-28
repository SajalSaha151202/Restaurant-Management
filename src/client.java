import java.util.Scanner;

public interface client {
    void input();// these are methods or functions which public, static and final( in by default)

    void output();
}

class saj implements client {
    String name;
    double sal;

    public static void main(String args[]) {
        client c = new saj();
        c.input();
        c.output();
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        name = sc.nextLine();
        System.out.println("Enter the salary: ");
        sal = sc.nextDouble();
    }

    public void output() {
        System.out.println(name);
        System.out.println(sal);
    }
}

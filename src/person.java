import java.util.Scanner;

public class person {
    String name;
    int age;

    person(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("the name of the student: " + name);
        System.out.println("the age of the student: " + age);
    }
}

class information {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the student: ");
        String Name = sc.nextLine();
        System.out.println("Enter the age of the student: ");
        int Age = sc.nextInt();
        person ob = new person(Name, Age);
        ob.display();
    }

}

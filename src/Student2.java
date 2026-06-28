public class Student2 {
    int id;
    String name;

    // Parameterized constructor
    Student2(int i, String n) {
        id = i;
        name = n;
    }

    // Copy constructor
    Student2(Student2 s) {
        id = s.id;
        name = s.name;
    }

    void display() {
        System.out.println(id + " " + name);
    }
}

class vins {
    public static void main(String[] args) {
        Student2 s1 = new Student2(101, "Sajal");
        Student2 s2 = new Student2(s1);   // copy constructor

        s1.display();
        s2.display();
    }
}


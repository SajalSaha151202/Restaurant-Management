public class Student1 {
    int id;
    String name;

    Student1() {
        id = 0;
        name = "unknown";

    }

    Student1(int i, String s) {
        id = i;
        name = s;

    }

}

class vains {
    public static void main(String args[]) {
        Student1 s = new Student1();
        Student1 s1 = new Student1(101, "sajal");
        System.out.println(s.id);
        System.out.println(s.name);
        System.out.println(s1.id);
        System.out.println(s1.name);

    }
}

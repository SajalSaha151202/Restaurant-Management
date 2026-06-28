interface A {
    void display();
}

interface B extends A {
    void show();
}

class C implements B {
    public void display() {
        System.out.println("Hello");
    }

    public void show() {
        System.out.println("Welcome");
    }
}

class mainclass {
    public static void main(String args[]) {
        C sc = new C();
        sc.display();
        sc.show();
    }
}

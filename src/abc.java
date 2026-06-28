class abc {
    private int a;

    void geta() {
        a = 5;
    }

    int input() {
        return (a);
    }
}

class xyz extends abc {
    public int z;
    private int x;

    void getz() {
        x = 8;
    }

    void add() {
        z = x + input();
    }

    void display() {
        System.out.print("the sum is: " + z);
    }
}

class uvw {
    public static void main(String args[]) {
        xyz ai;
        ai = new xyz();
        ai.geta();
        ai.getz();
        ai.add();
        ai.display();

    }
}
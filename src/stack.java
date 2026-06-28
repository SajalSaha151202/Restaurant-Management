import java.util.Scanner;

public class stack {
    int size;
    int top;
    int arr[];

    stack(int n) {
        size = n;

        arr = new int[size];
    }

    void push(int v) {
        if (top == size - 1) {
            System.out.println("The stack is overflowed");
        } else {
            top++;
            top = arr[v];
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("The stack is empty");
        } else {
            top--;
            System.out.println("Delete successfully");
        }
    }

    void display() {
        for (int i = 0; i <= top; i++) {
            System.out.println(arr[i]);
        }
    }
}

class execute {
    public static void main(String args[]) {
        System.out.println("enter the value");
        stack sc = new stack(5);
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        sc.push(a);
        int b = s.nextInt();
        sc.push(b);
        int c = s.nextInt();
        sc.push(c);
        int d = s.nextInt();
        sc.push(d);
        int e = s.nextInt();
        sc.push(e);
        sc.display();

    }
}

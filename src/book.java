import java.util.Scanner;

public class book {
    String title;
    double price;

    book(String t, double p) {
        title = t;
        price = p;
    }

    book(book p) {
        title = p.title;
        price = p.price;

    }

    void display() {
        System.out.println("the name of the book is: " + title);
        System.out.println("the price of the book is: " + price);
    }
}

class instruction {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the book name: ");
        String tit = sc.nextLine();
        System.out.println("Enter the book price: ");
        int pri = sc.nextInt();
        book ob = new book(tit, pri);
        ob.display();
        book ob1 = new book(ob);
    }
}
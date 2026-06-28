import java.util.Scanner;

public class laptop {
    String name;
    int price;
    double dis = 1;
    double amt = 0;

    laptop(String n, int p) {
        name = n;
        price = p;
    }

    void compute_amt() {
        if (price <= 25000) {
            dis = 5.0;
            amt = price - (price * dis / 100);
        } else if (price > 25000 && price <= 50000) {
            double dis = 7.5;
            amt = price - (price * dis / 100);
        } else if (price > 50000 && price <= 100000) {
            dis = 10.0;
            amt = price - (price * dis / 100);
        } else {
            dis = 15.0;
            amt = price - (price * dis / 100);
        }

    }

    void display() {
        System.out.println("the name of the customer: " + name);
        System.out.println("the price of the laptop: " + price);
        System.out.println("the discount  with respect to price of the laptop: " + dis);
        System.out.println("the actual amount after discount: " + amt);
    }
}

class purchase_laptop {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name and price: ");
        String nm = sc.nextLine();
        int pr = sc.nextInt();
        laptop ob = new laptop(nm, pr);
        ob.compute_amt();
        ob.display();
    }
}


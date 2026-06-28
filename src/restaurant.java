import java.util.Scanner;

public class restaurant {
    public static double amt(int n, int N) {

        double mult = n * N;
        System.out.println("the amount of the quantity: " + mult);
        return (mult);

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to restaurant");
        char st;
        double totbill = 0;
        do {
            System.out.println("1. veg\n2. nonveg\n");
            System.out.println("Enter the choice(1 or 2): ");
            int s = sc.nextInt();
            switch (s) {
                case 1:
                    System.out.println("a. Veg Starter\nb. Veg Main course\nc. Veg Desert");
                    System.out.println("enter the choice of veg(with one small letter): ");
                    char veg = sc.next().charAt(0);
                    switch (veg) {
                        case 'a':
                            System.out.println("Veg Starter");
                            System.out.println("A. Paneer Pakora(Rs.50 per plate)\nB. Veg pakora(Rs.20 per plate)\nC. Veg Spring roll(Rs.60 per plate)");
                            System.out.println("Enter the choice of starter(with one block letter): ");
                            char sta = sc.next().charAt(0);
                            switch (sta) {
                                case 'A':
                                    System.out.println("paneer pokora");
                                    System.out.println("Enter the number of plates: ");
                                    int n1 = 50;
                                    int n2 = sc.nextInt();
                                    double amot = amt(n1, n2);
                                    totbill = totbill + amot;
                                    break;
                                case 'B':
                                    System.out.println("Veg pokora");
                                    System.out.println("Enter the number of plates: ");
                                    int n3 = 20;
                                    int n4 = sc.nextInt();
                                    double amout = amt(n3, n4);
                                    totbill = totbill + amout;
                                    break;
                                case 'C':
                                    System.out.println("Veg Spring roll");
                                    System.out.println("Enter the number of plates: ");
                                    int n5 = 60;
                                    int n6 = sc.nextInt();
                                    double amount = amt(n5, n6);
                                    totbill = totbill + amount;
                                    break;
                                default:
                                    System.out.println("Invalid input");
                            }
                            break;
                        case 'b':
                            System.out.println("Veg Main course");
                            System.out.println("A. Paneer Butter Masala(Rs.80 per plate)\nB. Shahi paneer(Rs.90 per plate)\nC. Dal Makhani(Rs.100 per plate)\nD. Malai kofta(Rs.105 per plate)");
                            System.out.println("Enter the choice of starter(with one block letter): ");
                            char mai = sc.next().charAt(0);
                            switch (mai) {
                                case 'A':
                                    System.out.println("Paneer Butter Masala");
                                    System.out.println("Enter the number of plates: ");
                                    int n1 = 80;
                                    int n2 = sc.nextInt();
                                    double amots = amt(n1, n2);
                                    totbill = totbill + amots;
                                    break;
                                case 'B':
                                    System.out.println("Shahi paneer");
                                    System.out.println("Enter the number of plates: ");
                                    int n3 = 90;
                                    int n4 = sc.nextInt();
                                    double amouts = amt(n3, n4);
                                    totbill = totbill + amouts;
                                    break;
                                case 'C':
                                    System.out.println("Dal Makhani");
                                    System.out.println("Enter the number of plates: ");
                                    int n5 = 100;
                                    int n6 = sc.nextInt();
                                    double amount_s = amt(n5, n6);
                                    totbill = totbill + amount_s;
                                    break;
                                case 'D':
                                    System.out.println("Malai kofta");
                                    System.out.println("Enter the number of plates: ");
                                    int n7 = 105;
                                    int n8 = sc.nextInt();
                                    double amounts = amt(n7, n8);
                                    totbill = totbill + amounts;
                                    break;
                                default:
                                    System.out.println("Invalid input");
                            }
                            break;
                        case 'c':
                            System.out.println("Veg Desert");
                            System.out.println("A. Gulab jamun(Rs.12 per plate)\nB. Rasgulla(Rs.10 per plate)\nC. Ice cream(Rs.60 per plate)\nD. Yogurt honey & fruit(Rs.65 per plate)");
                            System.out.println("Enter the choice of starter(with one block letter): ");
                            char des = sc.next().charAt(0);
                            switch (des) {
                                case 'A':
                                    System.out.println("Gulab jamun");
                                    System.out.println("Enter the number of plates: ");
                                    int n1 = 12;
                                    int n2 = sc.nextInt();
                                    double Amot = amt(n1, n2);
                                    totbill = totbill + Amot;
                                    break;
                                case 'B':
                                    System.out.println("Rasgulla");
                                    System.out.println("Enter the number of plates: ");
                                    int n3 = 10;
                                    int n4 = sc.nextInt();
                                    double Amout = amt(n3, n4);
                                    totbill = totbill + Amout;
                                    break;
                                case 'C':
                                    System.out.println("Ice cream");
                                    System.out.println("Enter the number of plates: ");
                                    int n5 = 60;
                                    int n6 = sc.nextInt();
                                    double Amount = amt(n5, n6);
                                    totbill = totbill + Amount;
                                    break;
                                case 'D':
                                    System.out.println("Yogurt honey & fruit");
                                    System.out.println("Enter the number of plates: ");
                                    int n7 = 65;
                                    int n8 = sc.nextInt();
                                    double Amount_s = amt(n7, n8);
                                    totbill = totbill + Amount_s;
                                    break;
                                default:
                                    System.out.println("Invalid input");
                            }
                            break;
                        default:
                            System.out.println("Invalid input");
                    }
                    break;
                case 2:
                    System.out.println("a. Nonveg Starter\nb. Nonveg Main course\nc. Nonveg Desert");
                    System.out.println("enter the choice of veg(with one small letter): ");
                    char vg = sc.next().charAt(0);
                    switch (vg) {
                        case 'a':
                            System.out.println("Nonveg Starter");
                            System.out.println("A. Chicken Pakora(Rs.60 per plate)\nB. Chicken lollipop(Rs.70 per plate)\nC. Fishfry(Rs.65 per plate)\nD. Mutton Seekh Kabab(Rs.75 per plate)");
                            System.out.println("Enter the choice of starter(with one block letter): ");
                            char sta = sc.next().charAt(0);
                            switch (sta) {
                                case 'A':
                                    System.out.println("Chicken Pakora");
                                    System.out.println("Enter the number of plates: ");
                                    int n1 = 60;
                                    int n2 = sc.nextInt();
                                    double ammot = amt(n1, n2);
                                    totbill = totbill + ammot;
                                    break;
                                case 'B':
                                    System.out.println("Chicken lollipop");
                                    System.out.println("Enter the number of plates: ");
                                    int n3 = 70;
                                    int n4 = sc.nextInt();
                                    double ammout = amt(n3, n4);
                                    totbill = totbill + ammout;
                                    break;
                                case 'C':
                                    System.out.println("Fishfry");
                                    System.out.println("Enter the number of plates: ");
                                    int n5 = 65;
                                    int n6 = sc.nextInt();
                                    double ammount = amt(n5, n6);
                                    totbill = totbill + ammount;
                                    break;
                                case 'D':
                                    System.out.println("Mutton Seekh Kabab");
                                    System.out.println("Enter the number of plates: ");
                                    int n7 = 65;
                                    int n8 = sc.nextInt();
                                    double ammounts = amt(n7, n8);
                                    totbill = totbill + ammounts;
                                    break;
                                default:
                                    System.out.println("Invalid input");
                            }
                            break;
                        case 'b':
                            System.out.println("Nonveg Main course");
                            System.out.println("A. Butter Chicken(Rs.85 per plate)\nB. Chicken curry(Rs.95 per plate)\nC. Chicken Bharta(Rs.105 per plate)\nD. Mutton Kosha(Rs.120 per plate)\nE. Fish curry(Rs.115 per plate)");
                            System.out.println("Enter the choice of starter(with one block letter): ");
                            char mai = sc.next().charAt(0);
                            switch (mai) {
                                case 'A':
                                    System.out.println("Butter Chicken");
                                    System.out.println("Enter the number of plates: ");
                                    int n1 = 85;
                                    int n2 = sc.nextInt();
                                    double Ammot = amt(n1, n2);
                                    totbill = totbill + Ammot;
                                    break;
                                case 'B':
                                    System.out.println("Chicken curry");
                                    System.out.println("Enter the number of plates: ");
                                    int n3 = 95;
                                    int n4 = sc.nextInt();
                                    double Ammout = amt(n3, n4);
                                    totbill = totbill + Ammout;
                                    break;
                                case 'C':
                                    System.out.println("Chicken Bharta");
                                    System.out.println("Enter the number of plates: ");
                                    int n5 = 105;
                                    int n6 = sc.nextInt();
                                    double Ammount = amt(n5, n6);
                                    totbill = totbill + Ammount;
                                    break;
                                case 'D':
                                    System.out.println("Mutton Kosha");
                                    System.out.println("Enter the number of plates: ");
                                    int n7 = 120;
                                    int n8 = sc.nextInt();
                                    double Ammounts = amt(n7, n8);
                                    totbill = totbill + Ammounts;
                                    break;
                                case 'E':
                                    System.out.println("Fish curry");
                                    System.out.println("Enter the number of plates: ");
                                    int n9 = 115;
                                    int n0 = sc.nextInt();
                                    double Amounts = amt(n9, n0);
                                    totbill = totbill + Amounts;
                                    break;
                                default:
                                    System.out.println("Invalid input");
                            }
                            break;
                        case 'c':
                            System.out.println("Nonveg Desert");
                            System.out.println("A. Egg Pudding(Rs.20 per plate)\nB. Traditional French Vanilla(Rs.70 per plate)\nC. Red Velvet Cake(Rs.90 per plate)\nD. Chocolate Mousse(Rs.86 per plate)");
                            System.out.println("Enter the choice of starter(with one block letter): ");
                            char des = sc.next().charAt(0);
                            switch (des) {
                                case 'A':
                                    System.out.println("Egg Pudding");
                                    System.out.println("Enter the number of plates: ");
                                    int n1 = 20;
                                    int n2 = sc.nextInt();
                                    double amut = amt(n1, n2);
                                    totbill = totbill + amut;
                                    break;
                                case 'B':
                                    System.out.println("Traditional French Vanilla");
                                    System.out.println("Enter the number of plates: ");
                                    int n3 = 70;
                                    int n4 = sc.nextInt();
                                    double amuut = amt(n3, n4);
                                    totbill = totbill + amuut;
                                    break;
                                case 'C':
                                    System.out.println("Red Velvet Cake");
                                    System.out.println("Enter the number of plates: ");
                                    int n5 = 90;
                                    int n6 = sc.nextInt();
                                    double amuunt = amt(n5, n6);
                                    totbill = totbill + amuunt;
                                    break;
                                case 'D':
                                    System.out.println("Chocolate Mousse");
                                    System.out.println("Enter the number of plates: ");
                                    int n7 = 86;
                                    int n8 = sc.nextInt();
                                    double amuunts = amt(n7, n8);
                                    totbill = totbill + amuunts;
                                    break;
                                default:
                                    System.out.println("Invalid input");
                            }
                            break;
                        default:
                            System.out.println("Invalid input");
                    }
                    break;
                default:
                    System.out.println("Invalid input");
            }
            System.out.println("the order recieved successfully");
            System.out.println("Do you want more (for yes[y/Y] and no[n/N]): ");
            st = sc.next().charAt(0);
        } while (st == 'y' || st == 'Y');
        System.out.println("Total bill of order is " + totbill + "RS");
        System.out.println("Thank you ");


    }
}

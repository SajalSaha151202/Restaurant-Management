import java.util.Scanner;

public class prime_func {
    public static int prim(int a) {
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                System.out.println(i + " output 0");
            } else {
                System.out.println(i + " output 1");
            }
        }
        return 0;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("the length of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("enter the elements in array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.print("check the element of the array are prime or not ");
        for (int i = 0; i < arr.length; i++) {
            prim(i);
        }
    }
}

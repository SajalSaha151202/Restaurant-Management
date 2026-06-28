import java.util.Scanner;

public class swap_array {
    public static int swap(int a) {
        a = 9 - a;
        return (a);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("the array of the intigers: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("the array of the intigers after swaping: ");
        for (int i = 0; i <= arr.length; i++) {
            int r = swap(arr[i]);
            System.out.print(r + " ");
        }


    }
}
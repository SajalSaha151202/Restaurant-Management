import java.util.Scanner;

public class arr_reverse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Display the elements in the array as reverse: ");
        for (int i = (arr.length - 1); i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
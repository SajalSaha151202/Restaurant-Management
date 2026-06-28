import java.util.Scanner;

public class arr_max {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("the maximum element in the array is: ");
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else {
                max = arr[i - 1];
            }
        }
        System.out.println("the max number is: " + max);
    }
}
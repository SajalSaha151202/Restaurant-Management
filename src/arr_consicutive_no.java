import java.util.Scanner;

public class arr_consicutive_no {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == (arr[i] - 1) || arr[i - 1] == (arr[i] + 1)) {
                System.out.println("the two numbers " + arr[i - 1] + " and " + arr[i] + " are consecutive");
            }
        }
    }
}

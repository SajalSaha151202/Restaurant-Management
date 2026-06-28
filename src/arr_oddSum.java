import java.util.Scanner;

public class arr_oddSum {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        int add = 0;
        System.out.println("the sum of the even numbers: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum = sum + arr[i];
            }
        }
        System.out.print(sum + "\n");
        System.out.println("the sum of the odd numbers: ");
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] % 2 != 0) {
                add = add + arr[j];
            }
        }
        System.out.println(add);
    }
}



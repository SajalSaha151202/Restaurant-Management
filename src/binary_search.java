import java.util.Scanner;

public class binary_search {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements in array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to search in array: ");
        int ns = sc.nextInt();
        int k = 0, p = 0, lb = 0, ub = n - 1;
        while (lb <= ub) {
            p = (lb + ub) / 2;
            if (arr[p] < ns) {
                ub = p - 1;
            }
            if (arr[p] == ns) {
                k = 1;
                break;
            }
        }
        if (k == 1)
            System.out.println("the searching is successful");
        else
            System.out.println("the searching is unsuccessful");


    }
}

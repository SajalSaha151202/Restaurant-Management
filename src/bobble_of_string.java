import java.util.Scanner;

public class bobble_of_string {
    public static void main(String args[]) {
        {
            Scanner in = new Scanner(System.in);
            int i, j;
            String arr[] = new String[10];
            String t = "";
            for (i = 0; i < 10; i++) {
                System.out.println("Enter the name in the cell: ");
                arr[i] = in.next();
            }
            for (i = 0; i < 9; i++) {

                for (j = i + 1; j < 10; j++) {
                    if (arr[i].compareTo(arr[j]) > 0) {
                        t = arr[i];
                        arr[i] = arr[j];
                        arr[j] = t;
                    }
                }
            }
            System.out.println("The names arranged in ascending order are: ");
            for (i = 0; i < 10; i++) {
                System.out.println(arr[i]);
            }
        }
    }
}
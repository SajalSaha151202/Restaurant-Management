public class arr {
    public static void main(String args[]) {
        int arr[] = {5, 6, 7, 8, 9};
        System.out.println("the sum of the numbers: ");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}

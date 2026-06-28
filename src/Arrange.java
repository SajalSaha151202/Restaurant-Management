import java.util.Scanner;

public class Arrange {
    String str;
    int i, p;
    char ch;

    Arrange(String s) {
        str = s;
        p = str.length();
    }

    public static void main(String args[]) {

        Arrange ob = new Arrange("");
        ob.accept();
        ob.arrange();
        ob.display();
    }

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word: ");
        str = sc.nextLine();
        p = str.length();
    }

    void arrange() {
        char arr[] = str.toCharArray();
        char temp;
        for (int i = 0; i < p; i++) {
            for (int j = (i + 1); j < p; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        str = new String(arr);
    }

    void display() {
        System.out.println("The ascending arangement of letters: " + str);

    }
}
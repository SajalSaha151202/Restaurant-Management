import java.util.Scanner;

public class hcflcm {
    int a, b;

    hcflcm(int x, int y) {
        a = x;
        b = y;
    }

    void cal_lcm() {

        int ans = (a > b) ? a : b;
        while (true) {
            if (ans % a == 0 && ans % b == 0) {

                break;

            }
            ans++;
        }
        System.out.println("the result of lcm is:" + ans);

    }

    void cal_hcf() {
        int remainder = a;
        int divisor = b;
        int dividend;
        int hcf;
        while (divisor != 0) {
            dividend = divisor;
            divisor = remainder % divisor;
            remainder = dividend;
        }
        hcf = remainder;
        System.out.println("the result of hcf is: " + hcf);
    }
}

class constructer {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first no: ");
        int a1 = sc.nextInt();
        System.out.println("Enter the second no: ");
        int b1 = sc.nextInt();
        hcflcm ob = new hcflcm(a1, b1);
        ob.cal_lcm();

        ob.cal_hcf();
    }
}

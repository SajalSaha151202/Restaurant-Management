public class func {
    public static void main(String args[]) {
        try {
            int a = 15;
            int b = 2;
            System.out.println("Values of a=" + a);
            System.out.println("Values of b=" + b);

            int c = a / b;
            System.out.println("a/b =" + c);
        } catch (Exception e) {
            System.out.println("Exception Thrown: " + e);
        } finally {
            System.out.println("Finally the block executed!");
        }
    }
}

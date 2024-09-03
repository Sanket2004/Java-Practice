package Exception_Handling.Try_Catch;

public class Ex2 {
    public static void main(String[] args) {
        try {
            System.out.println(4 / 0);
        } catch (Exception e) {
            System.out.println("ArithmeticException: divided by 0");
        }
        // } catch (ArithmeticException e) {
        // System.out.println("Exception : divided by 0");
        // }
    }
}

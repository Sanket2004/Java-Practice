package Exception_Handling.Try_Catch;

import java.util.*;

public class Ex7 {
    static void func(int a, int b) throws ArithmeticException, ArrayIndexOutOfBoundsException {
        System.out.println("10 / " + a + " = " + 10 / a);
        int[] arr = { 1, 2, 3 };
        System.out.println("The element at position " + b + " is : " + arr[b]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            try {
                func(sc.nextInt(), sc.nextInt());
            } catch (ArithmeticException e) {
                System.out.println("Can't divide by zero");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Out of bounds !");
            }
        }
        sc.close();
    }
}

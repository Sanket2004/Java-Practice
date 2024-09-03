package Exception_Handling.Try_Catch;

public class Ex3 {
    public static void main(String[] args) {
        try {
            try {
                int a[] = { 10, 28, 35 };
                for (int i = 0; i < a.length + 1; i++) {
                    System.out.println(a[i]);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array size is out of bound");
            }
            System.out.println(5 / 0);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException : Cannot divided by zero");
        }
    }

}

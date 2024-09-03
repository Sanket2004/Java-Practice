package Exception_Handling.Try_Catch;

public class Ex4 {
    public static void main(String[] args) {
        try {
            System.out.println(5 / 0);
            try {
                int a[] = { 10, 28, 35 };
                for (int i = 0; i < a.length + 1; i++) {
                    System.out.println(a[i]);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array size is out of bound");
            }
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException : Cannot divided by zero");
        }
    }
}

// If the try block's first statement
// get some error it will directly
// goto to the catch block and the
// rest try block body will not be executed.

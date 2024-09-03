package Exception_Handling.Try_Catch;

public class Ex6 {
    static void func(int a) throws Exception{
        System.out.println(10/a);
    }
    public static void main(String[] args) {
        try {
            func(10);
            func(0);
        } catch (Exception e) {
            System.out.println("Cannot divide by zero");
        }
    }
}

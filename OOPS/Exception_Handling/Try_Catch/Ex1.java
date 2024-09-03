package Exception_Handling.Try_Catch;

public class Ex1 {
    public static void main(String[] args) {
        int a = 10;
        for (int i = 3; i >= 0; i--) {
            try {
                System.out.println(a / i);
                //System.out.println("End of the program.");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
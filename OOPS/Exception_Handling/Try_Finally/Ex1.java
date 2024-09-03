package Exception_Handling.Try_Finally;

public class Ex1 {
    public static void main(String[] args) {
        try {
            System.out.println(4 / 0);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Finally executed");
        }
        System.out.println("end");
    }
}

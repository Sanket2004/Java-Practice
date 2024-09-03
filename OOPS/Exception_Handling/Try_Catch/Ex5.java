package Exception_Handling.Try_Catch;
public class Ex5 {
    static void canVote(int age) {
        if (age < 18) {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("You are not an adult !");
            }
        } else {
            System.out.println("You can vote");
        }
    }
    public static void main(String[] args) {
        canVote(28);
        canVote(15);
    }
}

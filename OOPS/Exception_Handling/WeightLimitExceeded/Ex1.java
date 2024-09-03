package Exception_Handling.WeightLimitExceeded;

import java.util.Scanner;

public class Ex1 {
    void validWeight(int weight) throws weightLimitExceeded {
        if (weight > 15)
            throw new weightLimitExceeded(weight);
        else
            System.out.println("You are ready to fly !");
    }

    public static void main(String[] args) {
        Ex1 ob = new Ex1();
        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i < 2; i++) {
                try {
                    ob.validWeight(sc.nextInt());
                } catch (weightLimitExceeded e) {
                    System.out.println(e);
                }
            }
        }
    }
}

package Exception_Handling.WeightLimitExceeded;

public class weightLimitExceeded extends Exception{
    weightLimitExceeded(int x){
        System.out.println(Math.abs(15-x) + " Kg");
    }
}

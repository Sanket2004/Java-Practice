package CP;

//Problem Statement –
//
//        A chocolate factory is packing chocolates into the packets. The chocolate packets here represent an array  of N number of integer values. The task is to find the empty packets(0) of chocolate and push it to the end of the conveyor belt(array).

import java.util.ArrayList;

public class moveZeroToLast {
    public static void moveToLast(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        for (int j : arr) {
            if (j != 0) {
                list.add(j);
            } else {
                count++;
            }
        }
        for(int i = 0; i<count; i++){
            list.add(0);
        }
        System.out.println(list);
    }
}

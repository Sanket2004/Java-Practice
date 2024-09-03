package CP;

//Given an integer array Arr of size N the task is to find the count of elements whose value is greater than all of its prior elements.
//
//        Note : 1st element of the array should be considered in the count of the result.

public class greaterThanPrior {
    public static int greaterElementCount(int[] arr) {
        int max = arr[0], count = 1;
        for(int ele:arr){
            if(ele>max){
                max = ele;
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(greaterElementCount(new int[]{3, 4, 5, 8, 9}));
    }
}


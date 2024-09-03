package CP;

import java.util.Scanner;

public class ReverseAddANumber {
    public static int reverseNumber(int num) {
        int res = 0;
        while(num != 0){
            res = res*10 + num % 10;
            num /= 10;
        }
        return res;
    }

    public static boolean isPalindrome(int num) {
         return reverseNumber(num) == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        System.out.print("The sum of original number ("+num+") and reversed number ("+reverseNumber(num)+") is : " + (num+reverseNumber(num))+"\n");
        System.out.print(isPalindrome(num)?num + " is a palindrome number": num + " is not a palindrome number");
    }
}

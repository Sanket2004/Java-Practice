package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class PrimeCheck {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            set.add(i);
        }
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            Integer i = it.next();
            if (!isPrime(i)){
                it.remove();
            }
        }

        for(Integer i : set) {
            System.out.print(i+ " ");
        }
    }

    public static boolean isPrime(int n) {
        if(n < 2) return false;
        if(n == 2) return true;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
}


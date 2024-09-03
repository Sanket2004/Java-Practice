
//COMPILE TIME POLYMORPHISM OR METHOD OVERLOADING

class clc{
    public int add(int n1, int n2){
        return (n1+n2);
    }
    public int add(int n1){
        return (n1+1);
    }
}

public class DMD2 {
    public static void main(String[] args) {
        clc c = new clc();
        int r = c.add(5);
        System.out.println(c.add(10, 15));
        System.out.println(r);
    }
}


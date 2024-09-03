package Exception_Handling.Assignment1;

class MyClass extends Exception {
    double num;

    MyClass(double num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "MyClass: x = " + num;
    }
}

class MyTestClass {
    public static void main(String[] args) {
        int i = (int) (Math.random());
        for (int x = 0; x < 10; x++) {
            double j = Math.random() * 30;
            try {
                int result = 20 / i;
            } catch (ArithmeticException e) {
                MyClass mc = new MyClass(j);
                System.out.println(mc);
            }
        }
    }
}

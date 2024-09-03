
class Animal {
    public void show() {
        System.out.println("Animal is generalized..");
    }
}

class Tiger extends Animal {
    public void show() {
        System.out.println("Executing Tiger..");
    }
}

class Cat extends Animal {
    public void show() {
        System.out.println("Executing Cat..");
    }
}

public class DynamicMethodDispatching {
    public static void main(String[] args) {
        Animal a = new Tiger();
        a.show();

        a = new Cat();
        a.show();
    }
}

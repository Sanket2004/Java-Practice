import java.util.*;

class StackExample {
    int arr[] = new int[100];
    int size, top;

    public StackExample() {
        top = -1;
        Scanner sc = new Scanner(System.in);
        System.out.println("==================");
        System.out.println("STACK OPERATIONS");
        System.out.println("==================");
        System.out.print("ENTER SIZE OF STACK : ");
        size = sc.nextInt();
    }

    public void exception(String s) {
        System.out.println(s);
    }

    public void push(int val) {
        if (top == size - 1) {
            exception("STACK IS FULL !!");
        } else {
            top++;
            arr[top] = val;
        }

    }

    public void pop() {
        if (isEmpty()) {
            exception("STACK IS EMPTY !!");
        } else {
            int temp = arr[top];
            top--;
            System.out.println("POPPED ELEMENT: " + temp);
        }

    }

    public void peek() {
        if (isEmpty()) {
            exception("STACK IS EMPTY !!");
        } else {
            System.out.println("PEEK ELEMENT : " + arr[top]);
        }
    }

    public boolean isEmpty() {
        if (top == -1)
            return true;
        else
            return false;
    }

    public void show() {
        for (int i = 0; i <= top; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackExample obj = new StackExample();
        while (true) {
            System.out.println("1. PUSH");
            System.out.println("2. POP");
            System.out.println("3. PEEK");
            System.out.println("4. CHECK EMPTY");
            System.out.println("5. SHOW STACK");
            System.out.println("6. Exit");
            System.out.print("ENTER CHOICE : ");
            int ch = sc.nextInt();

            if (ch == 1) {
                System.out.println("ENTER ELEMENT :");
                int val = sc.nextInt();
                obj.push(val);
                System.out.println("ELEMENT PUSHED !!");
            } else if (ch == 2) {
                obj.pop();
            } else if (ch == 3) {
                obj.peek();
            } else if (ch == 4) {
                System.out.println("CHECK EMPTY : " + obj.isEmpty());
            } else if (ch == 5) {
                obj.show();
            }
        }
    }
}

import java.io.*;

public class binarySearchRecursive {

    public static int search(int[] arr, int low, int high, int key) {
        if (high >= low) {
            int mid = (low + high) / 2;
            if (arr[mid] == key)
                return mid;
            if (arr[mid] > key)
                return search(arr, low, mid - 1, key);
            return search(arr, mid + 1, high, key);
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter size of array: ");
        int n = Integer.parseInt(in.readLine());
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + i + " of the array: ");
            arr[i] = Integer.parseInt(in.readLine());
        }
        System.out.print("Enter the value to be searched: ");
        int key = Integer.parseInt(in.readLine());
        System.out.print("The element found at " + search(arr, 0, arr.length - 1, key) + " index.");
    }
}

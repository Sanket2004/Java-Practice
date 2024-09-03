import java.io.*;

public class binarySearchIterative {
    public static int search(int[] arr, int key) {
        int high = arr.length - 1;
        int low = 0;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (arr[mid] == key)
                return mid;
            if (arr[mid] > key)
                high = mid - 1;
            else
                low = mid + 1;
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
        System.out.print("The element found at " + search(arr, key) + " index.");
    }
}
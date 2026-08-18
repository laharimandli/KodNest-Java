
import java.util.Scanner;

public class SearchAndReverseArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int key = sc.nextInt();

        SearchAndReverse sr = new SearchAndReverse();

        sr.search(arr, key);
        sr.reverse(arr);
    }
}

class SearchAndReverse {

    void search(int arr[], int key) {
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }

    void reverse(int arr[]) {
        System.out.print("Reverse order: ");

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}

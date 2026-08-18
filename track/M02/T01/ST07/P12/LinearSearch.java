
import java.util.Scanner;

class LinearSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {10, 20, 30, 40, 50};
        ArraySearch as = new ArraySearch();
        as.search(arr, 90);
    }
}

class ArraySearch {

    void search(int ref[], int key) {
        boolean found = true;
        for (int i = 0; i < ref.length; i++) {
            if (ref[i] == key) {
                System.out.println("Element Found at index: " + i);
                found = false;
                break;
            }
        }
        if (found) {
            System.out.println("Element Not Found..");
        }

    }

}

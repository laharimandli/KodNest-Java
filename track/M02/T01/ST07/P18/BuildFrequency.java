
import java.util.Scanner;

public class BuildFrequency {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int key = sc.nextInt();

        Freq freq = new Freq();
        freq.countFreq(arr, key);
    }
}

class Freq {

    int count = 0;

    void countFreq(int ref[], int key) {
        for (int i = 0; i < ref.length; i++) {
            if (ref[i] == key) {
                count++;
            }
        }

        System.out.println("Frequency of " + key + ": " + count);
    }
}

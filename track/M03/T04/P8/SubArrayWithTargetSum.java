
import java.util.Scanner;

public class SubArrayWithTargetSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int startindex = -1;
        int endindex = -1;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == target) {
                    startindex = i;
                    endindex = j;
                    break;
                }
                if (sum > target) {
                    break;
                }
            }
            if (startindex != -1) {
                break;
            }
        }
        if (startindex != -1) {
            System.out.println(startindex + " " + endindex);
        } else {
            System.out.println(startindex);
        }
    }
}

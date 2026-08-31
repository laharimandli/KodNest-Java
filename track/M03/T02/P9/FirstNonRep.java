
import java.util.*;

public class FirstNonRep {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int nonRep = -1;

        for (int i = 0; i < size; i++) {

            boolean repeated = false;

            for (int j = 0; j < size; j++) {

                if (i != j && arr[i] == arr[j]) {
                    repeated = true;
                    break;
                }
            }

            if (!repeated) {
                nonRep = arr[i];
                break;
            }
        }

        System.out.println(nonRep);
    }
}

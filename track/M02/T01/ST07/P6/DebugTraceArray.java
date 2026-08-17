
public class DebugTraceArray {

    public static void main(String[] args) {
        int[] original = {14, 18, 22, 26};
        int updatedIndex = 1;
        int updatedValue = 25;
        int requestedIndex = 4;

        int[] snapshot = new int[original.length];

        for (int i = 0; i < original.length; i++) {
            snapshot[i] = original[i];
        }

        int[] liveView = original;
        liveView[updatedIndex] = updatedValue;

        System.out.print("Original: ");
        for (int i = 0; i < original.length; i++) {
            System.out.print(original[i] + " ");
        }
        System.out.println();

        System.out.print("Snapshot: ");
        for (int i = 0; i < snapshot.length; i++) {
            System.out.print(snapshot[i] + " ");
        }
        System.out.println();
        System.out.println("Same object: " + (liveView == original));

        System.out.print("Requested value: ");

        if (requestedIndex >= 0 && requestedIndex < original.length) {
            System.out.println("original[requestedIndex]");
        } else {
            System.out.println("Invalid Index");
        }

    }
}


import java.util.Scanner;

public class ConvertBuilderToString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        StringBuilder builder = new StringBuilder(text);

        // Append ! and convert the builder to String.
        builder.append("!");
        String str = new String(builder);
        System.out.println("Builder: " + builder);
        System.out.println("String: " + str);
    }
}

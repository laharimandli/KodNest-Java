
public class String2 {

    public static void main(String[] args) {
        String s3 = new String("Java");
        String s4 = new String("Java");
        if (s3 == s4) {
            System.out.println("References are equal");
        } else {
            System.out.println("References are not equal");
        }
    }
}

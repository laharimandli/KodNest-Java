
public class Static {

    public static void main(String[] args) {
        Demo.display1();

        Demo d1 = new Demo();
        Demo d2 = new Demo();
        d1.display2();
    }
}

class Demo {

    static int var1;
    static int var2;

    static {
        System.out.println("Inside Static Block...");
        var1 = 10;
        var2 = 20;
    }

    static void display1() {
        System.out.println("Inside static Display Method...");
        System.out.println(var1);
        System.out.println(var2);
    }
    int var3;

    {
        System.out.println("Inside non-static Block...");
        System.out.println(var3);
    }

    void display2() {
        System.out.println("Inside non-static Display Method...");
        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
    }

}

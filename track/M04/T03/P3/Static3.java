
class Static3 {

    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo();
        Demo d3 = new Demo();
    }
}

class Demo {

    static {
        System.out.println("3rd Static Block");
    }

    static {
        System.out.println("2nd Static Block");
    }

    static {
        System.out.println("1st Static Block");
    }

    {
        System.out.println("3rd Non-Static Block");
    }

    {
        System.out.println("1st Non-Static Block");
    }

    {
        System.out.println("2nd Non-Static Block");
    }
}

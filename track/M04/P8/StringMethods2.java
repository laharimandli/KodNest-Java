
class StringMethods2 {

    public static void main(String[] args) {
        String str = "KodNest Technologies";
        System.out.println(str);
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.charAt(3));
        // System.out.println(str.charAt(99));
        System.out.println(str.contains("Nest"));
        System.out.println(str.contains("nest"));
        System.out.println(str.startsWith("Kod"));
        System.out.println(str.endsWith("ies"));
        System.out.println(str.endsWith("kod"));
        System.out.println(str.indexOf('K'));
        System.out.println(str.indexOf('e'));
        System.out.println(str.length());
        System.out.println(str.replace('e', 'A'));
        System.out.println(str.substring(5));
        System.out.println(str.substring(5, 14));
        String s1 = "  java  ";
        String s2 = "jaa vaaaa   ";
        System.out.println(s1.trim());
        System.out.println(s2.trim());

    }

}

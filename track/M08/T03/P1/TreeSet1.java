
import java.util.TreeSet;

class TreeSet1 {

    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(100);
        ts.add(50);
        ts.add(150);
        ts.add(25);
        ts.add(75);
        ts.add(125);
        ts.add(175);
        System.out.println(ts);
        System.out.println(ts.headSet(75)); // excludes 75
        System.out.println(ts.headSet(75, true));  // if true - includes 75

        System.out.println(ts.tailSet(100)); // it gives including 100
        System.out.println(ts.tailSet(100, false));  // false - excludes 100

        System.out.println(ts.higher(100)); // immediate higher value
        System.out.println(ts.higher(80)); // even though 80 not in set , it gives immediate higher  as 100, 100 exist in set
        System.out.println(ts.higher(0)); // 0 not present in set , so immediate higher is 25
        System.out.println(ts.higher(200)); // returns null , no value present after 200

        System.out.println(ts.lower(100)); // returns immediate lower value 
        System.out.println(ts.lower(30)); // returns immedidate lower ,even though not present in set
        System.out.println(ts.lower(10));  // return null , no value present before 10

        System.out.println(ts.ceiling(100)); // returns 100
        System.out.println(ts.ceiling(80));  // 80 not in set, so it returns immediate higher to 80 as 100
        System.out.println(ts.ceiling(200)); // returns null

        System.out.println(ts.floor(125)); // returns 125
        System.out.println(ts.floor(70));  // 70 not in set, so it returns immediate lower to 70 as 50
        System.out.println(ts.floor(20)); // returns null

    }

}

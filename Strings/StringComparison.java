package Arrays_2D;

public class StringComparison {
    public static void main(String[] args) {
        String name1 = "Tony";
        String name2 = "Tony2";

        // 1 s1> s2 : +ve value
        // 2 s1==s2: 0
        // 3 s1< s2: -ve value

        if (name1.compareTo(name2) == 0) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        // OR
        if (name1 == name2) {
            System.out.println("Equal strings");
        } else {
            System.out.println("not equal");
        }

        // OR
        if (new String("Tony") == new String("Tony")) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("not equal");
        }

    }
}

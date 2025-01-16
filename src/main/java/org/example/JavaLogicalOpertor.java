package org.example;

public class JavaLogicalOpertor {
    public static void main(String[] args) {
        // Java logical and comparison operators

        boolean b = 3 > 2;
        // comparison
        System.out.println( 3 > 2);
        System.out.println(2 < 3);
        System.out.println(2 >= 3);
        System.out.println(2 <= 3);
        System.out.println(2 == 3);
        System.out.println(2 != 3);

        // logical
        System.out.println(0 < 5 && 5 < 10);
        System.out.println(0 < 5 || 5 < 10);
        System.out.println(!(0 < 5));
        System.out.println(!false);
        System.out.println(!true);
        System.out.println(true ^ true);

    }
}

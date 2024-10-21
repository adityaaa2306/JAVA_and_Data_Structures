// Defining an array: (a blank list)
// type [] arrayName = new type[size]

// Defining an array: (known elements)
// type [] arrayName = {1,2,3,4,5}

// assume index 0 to be marks for physics, 1 for chemistry and 2 for english
package Arryas_Introduction;

public class Array_Intro {
    public static void main(String[] args) {
        // int[] marks = new int[3];
        // marks[0] = 97; // phy
        // marks[1] = 95; // chem
        // marks[2] = 98; // eng

        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        // for (int i = 0; i < 3; i++) {
        // System.out.println(marks[i]);
        // }

        // _____________________________________________________________________________________________________________________

        int[] marks = { 75, 89, 96 };

        for (int i = 0; i < 3; i++) {
            System.out.println(marks[i]);
        }
    }
}

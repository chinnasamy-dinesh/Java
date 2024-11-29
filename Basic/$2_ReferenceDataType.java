/**
 *
 * Title: Learning Reference Data Types (Array, String, Class, Interface, Enumeration & Annotation) in Java
 * <p>
 * Author: Dinesh Chinnasamy
 *
 */

package Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringJoiner;

public class $2_ReferenceDataType {

    public static void main(String[] args) {
        learningArray();
        //learningString();
    }

    // It provides the fixed-size data structure that stores the elements of the same type.
    public static void learningArray() {
        //Array Declaration type 1
        int[] arrayDeclaration1 = new int[5];
        arrayDeclaration1[0] = 1;
        arrayDeclaration1[1] = 2;
        arrayDeclaration1[2] = 3;
        arrayDeclaration1[3] = 4;
        arrayDeclaration1[4] = 5;
        // Output to provide a particular element within the array size of 5
        System.out.println("Index 4 of Array Declaration Type 1: "+arrayDeclaration1[4]);
        // Output to print all the Array elements in the Array.
        System.out.println("Arrays in Array Declaration Type 1: "+Arrays.toString(arrayDeclaration1));

/*        //Array Declaration type 2
        int arrayDeclaration2[] = new int[5];
        arrayDeclaration2[0] = 5;
        arrayDeclaration2[1] = 4;
        arrayDeclaration2[2] = 3;
        arrayDeclaration2[3] = 2;
        arrayDeclaration2[4] = 1;
        // Output to provide a particular element within the array size of 5
        System.out.println("Index 4 of Array Declaration Type 2: "+arrayDeclaration2[4]);
        // Output to print all the Array elements in the Array.
        System.out.println("Arrays in Array Declaration Type 2: "+Arrays.toString(arrayDeclaration2));*/

        //Array Declaration type 3
        char[] arrayDeclaration3 = new char[] {'a','b','c','d','e'};
        // Output to provide a particular element within the array size of 5
        System.out.println("Index 4 of Array Declaration 3: "+arrayDeclaration3[4]);
        // Output to print all the Array elements in the Array.
        System.out.println("Arrays in Array Declaration Type 3: "+Arrays.toString(arrayDeclaration3));

        //Array Declaration type 4
        String[] arrayDeclaration4 = {"Dinesh","Nerthee","Joshvik","Appa","Amma"};
        // Output to provide a particular element within the array size of 5
        System.out.println("Index 4 of Array Declaration 4: "+arrayDeclaration4[4]);
        // Output to print all the Array elements in the Array.
        System.out.println("Arrays in Array Declaration Type 4: "+Arrays.toString(arrayDeclaration4));

        // Finding the length of the Array
        int len = arrayDeclaration1.length;
        System.out.println("Length of Array Declaration Type 1: "+len);

        // Clone Array
        String[] cloneArrayDeclaration4 = arrayDeclaration4.clone();
        System.out.println("Cloning the array: " + Arrays.toString(cloneArrayDeclaration4));

        // 2 Dimensional Array
        String[][] numberName = {{"1","Dinesh"},{"2","Nerthee"},{"3","Joshvik"},{"4","Diner"}};
        System.out.println("2 Dimensional Array variable in row 2 colomn 1: " + numberName[1][0]);

    }

    /*  Strings are the type of objects that can store the character of values and in Java,
        every character is stored in 16 bits i,e using UTF 16-bit encoding.
        A string acts the same as an array of characters in Java.*/
    public static void learningString() {
        // Creating String Variable & Value
        String mySentence = "This Method gives a basic of string in java.";
        System.out.println("My Sentence: " + mySentence);

        // Convert all the string value to Upper Case & Lower Case
        System.out.println("String Uppercase: " + mySentence.toUpperCase());
        System.out.println("String Lowercase: " + mySentence.toLowerCase());

        //finding the length of the given string value
        System.out.println("Length of the String: " + mySentence.length());



    }

}

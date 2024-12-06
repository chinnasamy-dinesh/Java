/**
 *
 * Title: Learning Operators in Java
 * Summary: Operators are the building blocks of Java expressions, allowing you to perform calculations, comparisons, and more.
 * Author: Dinesh Chinnasamy
 *
 */

package com.learning.Operators;

public class Operators {

    public static void main(String[] args) {
        arithmeticOperators();
        unaryOperators();
    }

    public static void arithmeticOperators() {

        // They are used to perform simple arithmetic operations on primitive and non-primitive data types.

        // Arithmetic operators on integers
        int a = 15, b = 10, c = 25;

        // Arithmetic operators on Strings
        String num1 = "15";
        String num2 = "25";

        // Convert Strings to integers
        int a1 = Integer.parseInt(num1);
        int b1 = Integer.parseInt(num2);

        System.out.println("Arithmetic Operators");
        System.out.println("a + b = " + (a + b + c));
        System.out.println("a - b = " + (a - b - c));
        System.out.println("a * b = " + (a * b * c));
        System.out.println("a / b = " + (a / (c / b)));
        System.out.println("a % b = " + (a % b) % c);
        System.out.println("a1 + b1 = " + (a1 + b1));
    }

    //
    public static void unaryOperators() {

        // Unary operators need only one operand. They are used to increment, decrement, or negate a value. (+, -, ++, --, !)
        int a =  1;
        boolean c = true;

        // – : Unary minus, used for negating the values.
        int b = -a;
        System.out.println("Unary Operators");
        System.out.println("b: " + b);

        // + : Unary plus indicates the positive value (numbers are positive without this, however).
        // It performs an automatic conversion to int when the type of its operand is the byte, char, or short. This is called unary numeric promotion.
        System.out.println("a: " + a);

        // ++ : Increment operator, used for incrementing the value by 1. There are two varieties of increment operators.
        //  Post-Increment: Value is first used for computing the result and then incremented.
        //  Pre-Increment: Value is incremented first, and then the result is computed.
        b = a++;
        System.out.println("a++: " + b);
        b = ++a;
        System.out.println("++a: " + b);

        // –– : Decrement operator, used for decrementing the value by 1. There are two varieties of decrement operators.
        //  Post-decrement: Value is first used for computing the result and then decremented.
        //  Pre-Decrement: The value is decremented first, and then the result is computed.
        int b1 = a--;
        System.out.println("a--: " + b1);
        b1 = --a;
        System.out.println("--a: " + b1);

        // ! : Logical not operator, used for inverting a boolean value.
        System.out.println("c: " + (!c));

    }
}

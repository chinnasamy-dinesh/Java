/**
 *
 * Title: Learning Primitive Data Types in Java
 *
 * Author: Dinesh Chinnasamy
 *
 */

package Basic;

public class PrimitiveDataType {
    public static void main(String[] args) {
        learningInteger();
        learningChar();
        learningBoolean();
        learnigTypeCasting();
    }

    public static void learningInteger () {
        // any variable in java has to have a type information
        byte byteVariable = 127; // Signed 8-bit (-127 to 127)
        short shortVariable = -32767; // Signed 16-bit (-32767 to 32768)
        int integerVariable = 214748364; // Signed 32-bit (-2,147,483,647 to 2,147,483,648)
        long longVariable = 1314291314; // Signed 64-bit (-9.22337E+17 to 9.22337E+18)

        float floatVariable = 13.1429f; // 32-bit single precision
        double doubleVariable = 13.1429; // 64-bit double precision

        System.out.println("Byte: "+byteVariable);
        System.out.println("Short: "+shortVariable);
        System.out.println("Int: "+integerVariable);
        System.out.println("Long: "+longVariable);
        System.out.println("Float: "+floatVariable);
        System.out.println("Double: "+doubleVariable);
    }

    public static void learningChar() {
        char charVariable = 'a'; // 16-bit unicode character
        System.out.println("Char: "+charVariable);
    }

    public static void learningBoolean(){
        boolean isBooleanVariable = true; // true or false statement
        System.out.println("isBooleanVariable: "+isBooleanVariable);
    }

    public static void learnigTypeCasting() {
        int typecast2Byte = (byte)214748364; // only can be applied on higher datatype to lowerdatatype
        System.out.println("int2byte: "+typecast2Byte);
    }

}
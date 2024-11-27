/**
 *
 * Title: Learning Reference Data Types in Java
 * <p>
 * Author: Dinesh Chinnasamy
 *
 */

package Basic;

public class $2_ReferenceDataType {

    public static void main(String[] args) {
        learningArray();
    }

    public static void learningArray() {
        //Array Declaration type 1
        int[] arrayDeclaration1 = new int[5];
        arrayDeclaration1[0] = 1;
        arrayDeclaration1[1] = 2;
        arrayDeclaration1[2] = 3;
        arrayDeclaration1[3] = 4;
        arrayDeclaration1[4] = 5;
        System.out.println(arrayDeclaration1[4]);

        //
        int arrayDeclaration2[] = new int[5];
        arrayDeclaration2[0] = 5;
        arrayDeclaration2[1] = 4;
        arrayDeclaration2[2] = 3;
        arrayDeclaration2[3] = 2;
        arrayDeclaration2[4] = 1;
        System.out.println(arrayDeclaration2[4]);
    }

}

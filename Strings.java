public class Strings {
    public static void main(String[] args) 
    {
        String str = "This is a java string program to learn java", firstName = "Dinesh", lastName = "Chinnasamy";
        int len = str.length();
        String upper = str.toUpperCase(), lower = str.toLowerCase();
        System.out.println("Length of the String: "+len+"\nString to Lower Case: "+lower+"\nString to Upper Case: "+upper);
        // Concadination
        System.out.println("String Concadinated: "+firstName.concat(lastName));
    


    }
}

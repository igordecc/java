package defaultDataTypes.nonPrimitive;

public class Strings {
    public static void main(String[] args) {
        try{
            String theString = args[0];
            System.out.println(theString);
            theString = theString.toUpperCase();
            theString = theString.toLowerCase();
            theString = theString + "abc"; // concatenation
            int index = theString.indexOf("abc");

            theString = theString + "\\ 123 \' 123 \" 123"; // use special characters throw backslash
            System.out.print(theString);

        }
        catch(Exception e) {
            System.out.println("Enter the String to args");
        }
    }
}
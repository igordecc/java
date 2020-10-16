package defaultDataTypes;

// 'default', built in, core - idk, and it doesnt matter

public class  Primitive{
    public static void main(String[] args){
        int intNumber = 123;

        float floatNumber = 1.2343234f;
        char charLetter = 'D';
        boolean boolValueTrue = true;
        boolean boolFalseValue = false;
        String shortString = "ya Igor";

        // different sizes of int
        byte oneByteSized = 127; // from -128 to 127 <- 2**8
        short twoByteSized = -32700; // from -32768 to   32767 <-- 2 ^16
        int fourByteSized = -2_147_483_648; // from -2,147,483,648 to 2,147,483,647  --- 2^32
        long eightBytes = 123; //

        // different sizes of float
        float fourBytesFloat = 123;
        double eightBytesFloat = 123;

        char abc = 'A'; // 2 bytes, ASCII

        System.out.println("ok");
    }
}

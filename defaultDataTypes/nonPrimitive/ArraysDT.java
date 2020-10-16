package defaultDataTypes.nonPrimitive;

import java.util.Arrays;

public class ArraysDT {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(args)); // args is String array
        int len = args.length;
        String[] anotherArgs = args.clone();
        if (len > 0) {
            System.out.println(args[len-1]);
        }
    }
}
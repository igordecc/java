package streamApi;

import java.util.stream.Stream;
import java.util.Arrays;
import java.util.ArrayList;

public class UtilStream {
    public static void main(String[] args) {
        String[] arr = new String[] {"1" , "2", "3"}; // array
        Stream<String> streamFromArray = Arrays.stream(arr);
        Stream<String> streamByStreamMethod = Stream.of("a", "b", "c");

        ArrayList<String> something = new ArrayList<String>();
        something.add("first element");
        something.add("second element");
        something.add("third element");

        something.parallelStream().forEach(element -> System.out.println(element)); // lambda function
        // method reference
        // dial with consumer functions
        // consumer - function that accept input and return void
        something.parallelStream().forEach(System.out::println);

        // stream operations

        long count = something.stream().distinct().count();
        // distinct // intermediate operation - allows chaining
        // count // terminal operation - returns long type value
        System.out.println(count);

        // example

        boolean isExist = false;
        for (String string : something) {
            if (string.contains("third element")) {
                isExist = true;
            } else{
                isExist = false;
            }
        }
        System.out.println(isExist);
        // stream analog
        isExist = something.stream().anyMatch(element -> element.equals("third element"));  // if any of the elements true, return true
        System.out.println("is Exist: " + isExist);
        boolean notExist = something.stream().noneMatch(element -> element.equalsIgnoreCase("")); // if none of the elements true, returns true
        System.out.println("not Exists: " + notExist);
        boolean allContains = something.stream().allMatch(element -> element.contains(" ")); // if for all elements true, returns true
        System.out.println("all Contains: " + allContains);
    }
}
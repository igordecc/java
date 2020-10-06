import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections {
    public static void main(String[] args){
        
        List<String> list = Arrays.asList("New York", "New Daily", "San Francisco");
        System.out.println(list);
        
        // use method add
        List<String> listTwo = new ArrayList<>();
        listTwo.add("one");
        listTwo.add("two");
        System.out.println(listTwo);

        // for Each
        // print using "method references"
        list.forEach(System.out::println);
        listTwo.forEach(System.out::println);
    }


}
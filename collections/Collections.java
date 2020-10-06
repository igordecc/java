import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections {
    public static void main(String[] args){
        //ListStrings(args);
        ListIntegers(args);
    }

    public static void ListStrings(String[] args) {
        
        System.out.println("// defining at start");
        List<String> list = Arrays.asList("New York", "New Daily", "San Francisco");
        System.out.println(list);
        
        System.out.println("// method add");
        List<String> listTwo = new ArrayList<>();
        listTwo.add("one");
        listTwo.add("two");
        System.out.println(listTwo);

        System.out.println("// `for Each` and method references");
        list.forEach(System.out::println);
        listTwo.forEach(System.out::println);

        System.out.println("// `for` loop");
        for (String string : list) {
            System.out.println(string);
        }
    }

    public static void ListIntegers(String[] args) {
        List<Integer> list = Arrays.asList(3,2,1,3,4,5,6);
        System.out.println("// for cycle");
        for (Integer integer : list) {
            System.out.println(integer);
        }
        
        System.out.println("// sorting with null `sort`");  
        List<Integer> l1 = createList();
        System.out.println(l1);
        l1.sort(null);
        l1.forEach(System.out::println);

        System.out.println("// sorting with lambda expression");  
        List<String> l2 = createStringList();
        l2.sort((s1,s2) -> s1.compareToIgnoreCase(s2));
        l2.forEach(System.out::println);
    }

    private static List<Integer> createList() {
        List<Integer> list = Arrays.asList(1,2,6,9,4,45,5,7,7,8);
        return list;
    }
    
    private static List<String> createStringList() {
        List<String> list = Arrays.asList("Santa Barbara", "New York", "San Francisco");
        return list;
    }
}
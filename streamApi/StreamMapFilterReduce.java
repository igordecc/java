package streamApi;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;

public class StreamMapFilterReduce {
    public static void main(String[] args) {
        // defining array list
        List<String> somelist = Arrays.asList("first", "second", "third", "dad", "mom", "dfdfdf");
        ArrayList<String> stringList = new ArrayList<>(somelist);

        System.out.print("filter results: ");
        stringList.stream().filter(element -> element.contains("o")).forEach(System.out::println);

        System.out.print("map results: ");
        stringList.stream().map(element -> element.toUpperCase()).forEach(System.out::println);

        System.out.println("reduce result: ");
        String result = stringList.stream().reduce("", (stringA, stringB)-> stringA + stringB + " :P ");
        System.out.println(result);

        System.out.println("Collectors result: ");
        List<String> brandNewList = stringList.stream().map(element -> element.toUpperCase()).collect(Collectors.toList());
        System.out.println(brandNewList);
    }
}


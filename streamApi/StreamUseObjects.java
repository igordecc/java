package streamApi;

import java.lang.reflect.Array;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.Collection;

public class StreamUseObjects {
    public static void main(String[] args) {
        Stream<String> streamEmpty = Stream.empty(); // empty stream

        // different versions of stream
        String[] arr = new String[]{"a", "b", "c", "d"};
        Stream<String> stream0 = Arrays.stream(arr, 1, 4);
        Collection<String> collection1 = Arrays.asList("a", "b", "c"); // array for streams
        Stream<String> stream1 = collection1.stream();
        Stream<String> stream2 = Stream.of("one", "two", "three");

        // 

    }
}
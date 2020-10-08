import java.util.List;
import java.util.Arrays;
import java.util.Queue;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.ArrayDeque;

public class Collections2 {
    public static void main(String[] args) {
        System.out.println();
    }

    public static List<String> createSList() {
        List<String> list = Arrays.asList("San Diego", "Florencia", "Ya Maika");
        return list;
    }

    public static List<Integer> createIList() {
        List<Integer> list = Arrays.asList(1,23,54,64,6,7,2,9);
        return list;
    }

    public static Queue<Integer> createQueue() {
        Queue<Integer> queue = new PriorityQueue<>(11);
        queue.addAll(createIList());
        return queue;
    }

    public static LinkedList<Integer> createLList() {
        LinkedList<Integer> llist = new LinkedList<>();
        llist.add(333);
        llist.addFirst(24);
        llist.addLast(67);
        return llist;
    }

    public static Deque<Integer> createDeque() {
        Deque<Integer> deque = new LinkedList<>();
        deque.add(123);
        deque.addFirst(30);
        deque.addLast(99);
        deque.addFirst(30);
        deque.addLast(99);
        deque.removeFirst();
        deque.pollLast();
        return deque;
    }

    public static ArrayList<String> createArrayList() {
        // main feature - resizable
        ArrayList<String> alist = new ArrayList<String>(Arrays.asList("abc", "adc", "mmo"));
        alist.addAll(Arrays.asList("kda", "mmr", "dmg"));
        return alist;
    }

    public static String[] defaultSArray() {
        // to print use:  Arrays.toString(defaultSArray())
        String[] arr = {"kek", "w"};
        String[][] arr2 = {{"kek", "w"}, {"one", "two"}};
        return new String[] {"wee", "rough"};
    }
}
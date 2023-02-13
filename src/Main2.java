import java.sql.ClientInfoStatus;
import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("b");
        set.add("c");
        set.add("g");
        set.add("a");
        set.add("p");
        List<String> list = heapSort(set);
        System.out.println(list);
    }

    public static <E> List<E> heapSort(Collection<E> collection) {
        Queue<E> queue = new PriorityQueue<E>(collection);
        List<E> result = new ArrayList<E>();
        while (!queue.isEmpty()) {
            result.add(queue.remove());
        }
        return result;
    }
}

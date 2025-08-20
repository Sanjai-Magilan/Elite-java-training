package collections;
import java.util.*;
public class lists {
        public static void main(String[] args){
            List<String> name = new ArrayList<>();
            System.out.println("List");
            name.add("sanjai");
            name.add("magilan");                // has duplicates
            name.add("s");
            name.add("sanjai");
            System.out.println(name);
        

            Set<String> id = new TreeSet<>();// hashset no order but treeset or linkedhashset will print in order
            System.out.println("Set");
            id.add("sanjai");
            id.add("magilan");                  // no duplicates
            id.add("s");
            id.add("sanjai");
            System.out.println(id);

            Map<Integer ,String> rollcall = new HashMap<>();
            rollcall.put(0, "san");
            rollcall.put(1, "mag");
            System.out.println(rollcall);
            System.out.println("Value for key 1: " + rollcall.get(1));
            System.out.println("Contains key 0? " + rollcall.containsKey(0));

            Queue<String> queue = new LinkedList<>();

            // Add elements (offer or add)
            queue.offer("Sanjai");
            queue.offer("Magilan");
            queue.offer("Alice");

            System.out.println("Queue: " + queue);
            // Peek: check head without removing
            System.out.println("Head of queue (peek): " + queue.peek());
            // Poll: remove and return head
            System.out.println("Removed (poll): " + queue.poll());
            System.out.println("Queue after poll: " + queue);
            // Remove: similar to poll but throws exception if empty
            System.out.println("Removed (remove): " + queue.remove());
            System.out.println("Final Queue: " + queue);
        }   
}

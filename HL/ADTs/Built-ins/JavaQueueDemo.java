import java.util.LinkedList;
import java.util.Queue;

public class JavaQueueDemo
{
    public static void main(String[] args)
    {
        System.out.println("Java QUEUE\n");
        Queue<String> q = new LinkedList<>();
        System.out.println("enqueueing/add()");
        q.add("Ed"); // add = enqueue in this context
        q.add("Anne");
        q.add("Joel");
        q.add("Quesadilla");
        q.add("Darla");
        q.add("Jose");

        System.out.println(q + " size(): "+ q.size() );
        System.out.println("peek: " + q.peek());
        System.out.println("remove(\"Quesadilla\"): " + q.remove("Quesadilla"));
        System.out.println(q);
        System.out.println("dequeue/remove(): " + q.remove());  // dequeue in
                                                                // this context
        System.out.println(q);

    }
}

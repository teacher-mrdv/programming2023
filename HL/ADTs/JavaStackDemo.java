import java.util.Stack;

public class JavaStackDemo
{
    public static void main(String[] args)
    {
        Stack<String> namesStack = new Stack<String>(); // create a stack
        namesStack.push("Anne");
        namesStack.push("Joel");
        namesStack.push("Jane");
        namesStack.push("Ian");
        namesStack.push("Bella");
        System.out.println("Java STACK\n");
        System.out.print(namesStack);
        System.out.println(" size = " + namesStack.size());
        System.out.println("peek(): " + namesStack.peek()); // shows the top
        // w/o popping it
        System.out.println("Removing(1): " + namesStack.remove(1));
        System.out.println(namesStack);
        System.out.println("Removing(\"Ian\"): " + namesStack.remove("Ian"));
        System.out.println(namesStack);

        while(!namesStack.isEmpty())
        {
            System.out.println("popping: " + namesStack.pop());
        }

    }

}

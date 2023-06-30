import java.util.LinkedList;
import java.util.Queue;
public class queues {

    Queue<String> queue = new LinkedList<>();

    /**
   * adds s to the back of the queue
   */
    public void enqueue(String s)
    {        
        queue.add(s);
    }

  /**
   * removes and returns string from the front of the queue
   */
    public String dequeue()
    {
        String s = queue.remove();
        return s;
    }

  /**
   * returns true if the queue is empty
   */
    public boolean empty()
    {
        if(queue.isEmpty())
            return true;
        else
            return false;
    }

    private class Node 
    {
        public String data;
        public Node next;
        public Node(String d, Node n) {
            data = d;
            next = n;
    }
}
    
}

import java.util.*;

public class Main{
  public static void main(String[] args) {
    queues   Q  = new queues();
    Scanner sc = new Scanner(System.in);
    String  s  = sc.next();

    while(!s.equals("done") ) {
      Q.enqueue(s);
      s = sc.next();
    }

    while( !Q.empty() ) {
      System.out.println(Q.dequeue());
    }
  }
}
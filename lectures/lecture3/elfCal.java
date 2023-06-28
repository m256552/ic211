import java.util.*;

public class elfCal 
{
    public static void main(String [] args)
    {

    }
    public static elfNode addToFront(String s, elfNode head) 
    {
        elfNode nNew = new elfNode();
        nNew.next = head;
        nNew.data = s;
        return nNew;
    }



}

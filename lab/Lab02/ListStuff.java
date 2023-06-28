public class ListStuff 
{
    // addToFront(s,Nold) returns a StringNode reference representing the list obtained by adding s to the front of list Nold
    /**
     * takes a string s from 
     * @param s
     * @param head
     * @return
     */
    public static StringNode addToFront(String s, StringNode head) 
    {
        StringNode nNew = new StringNode();
        nNew.next = head;
        nNew.data = s;
        return nNew;
    }
    public static StringNode addToBack(String s, StringNode head)
    {
        StringNode nNew = new StringNode();
        nNew.data = s;
        nNew.next = null;
        StringNode tempNode = head;
        if(head == null)
        {
            return nNew;
        }
        while(tempNode.next != null)
        {
            tempNode = tempNode.next;
        }
        tempNode.next = nNew;
        return head;
    }
  
    // listToArray(N) returns a reference to an array containing the same strings
    //as in the list N (in the order they were received)
    public static String[] listToArray(StringNode N)
    {
        int counter = 0;
        StringNode tempNode = N; 
        while(tempNode != null)
        {
            tempNode = tempNode.next;                 
            counter++;
        }
        String[] A;
        A = new String[counter];
        tempNode = N;
        for(int i = 0; i<counter; i++)
        {
            A[i] = tempNode.data;
            tempNode = tempNode.next;
        }
        return A;
    }    
    public static void main(String [] args)
    {
        StringNode N = null;      // at this point N *is* an empty list
        N = addToFront("rat",N);  // at this point N *is* the list ("rat")
        N = addToFront("dog",N);  // at this point N *is* the list ("dog","rat")
        N = addToFront("pig",N);  // at this point N *is* the list ("pig","dog","rat")        
        String[] A = listToArray(N);
        for(int i = 0; i < A.length; i++)
        {
            System.out.println(A[i]);
        } 
    }
}

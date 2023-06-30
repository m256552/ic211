//LinkedList importnant when we don't know length of list
public class LinkedList
{   
    private Node head;  
    /**
     * Add an item to the list
     */
    public void add(String data)
    {
        Node newNode = new Node();
        newNode.setData(data);
        newNode.setNext(null);
        // Point the current tail to our new Node,
        // newNode becomes the new tail.
        tail().setNext(newNode);
    }
    private Node tail()ls
    {
        Node tempNode = head;
        
        
    }
    //Will tell user what string is in a specific part of the list
    public String at(int pos)
    {
        
    }
    //give us the length of the list
    public int length()
    {

    }
}
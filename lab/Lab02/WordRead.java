import java.io.*;
import java.util.Scanner;

public class WordRead 
{
    //Partner 1 You will create a class WordRead that defines a function
    public static String[] get(String fname)
    {
        Scanner sc = null;
        try 
        {
            sc = new Scanner(new FileReader(fname));
        }
        catch(IOException e)
        {
            e.printStackTrace(); System.exit(1);
        }
        String [] stringArray;
        StringNode N = new StringNode();
        N = null; // this is an empty linked list        
        int i = 0;
        while(sc.hasNext() == true)
        {
            String tempWord;
            tempWord = sc.next();
            N = ListStuff.addToBack(tempWord, N);            
        }
        stringArray = ListStuff.listToArray(N);
        return stringArray;
    }
    public static void main(String [] args)
    {
       String [] A = get("test.txt");
       for(int i = 0; i<A.length; i++)
       {
        System.out.println(A[i]);
       }

    }
    /* 
    that takes a filename fname and reads all the strings in that file, returning them (in order) in an array.
    Since you don't know how many strings are in the file, you're going to have to use a linked list (good thing you have one!) to read and store, 
    then copy into an array. Unfortunately, you really need to have things stored in order!
    Of course you'll have to thoroughly test this by writing a "main" for your WordRead class. 
    For input file nouns.txt your test program should simply call get("nouns.txt") and     print the resulting array, showing the words in nouns.txt one per line.
    One thing you'll need to be able to do is create a Scanner that reads from a file. 
    Without understanding what's going on, here's how to do that: 
    You'll need a "import java.io.*;" for that. I also suggest you take a look at the Scanner class's hasNext() (see the Scanner API documentation).
    The gist is that sc.hasNext() returns true if there's a "next" string to be read, and false otherwise.
    This will tell you when to stop reading from the input file.
    */
}

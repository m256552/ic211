import java.util.*;
public class Rotor {

    public Rotor()
    {
        String [] A = new String[27];
        A[0] = "#";


    }
    public String [] rotate(String [] A)
    {
        int counter = 0;
        for(int i = 0; i<A.length; i++)
        {
            if(Arrays.asList(A).contains("#"))
            {
                counter = A[i].length();
            }
        }

        for(int i = 0; i<A.length; i++)
        {
            String temp = A[A.length].length()- 1;
            temp = A[A.length];

        }

    }
    
}

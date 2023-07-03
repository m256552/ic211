import java.util.*;
public class Rotor {

    String [] A = new String[27];

    public Rotor(String key)
    {
        for(int i = 0; i<key.length(); i++)
        {
            A[i] = key[i];
        }
        A = key;
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
    public static void main(String [] args)
    {

        Rotor r = new Rotor();
        r = "#GNUAHOVBIPWCJQXDKRYELSZFMT";
        String key = "#GNUAHOVBIPWCJQXDKRYELSZFMT";



    }
    
}

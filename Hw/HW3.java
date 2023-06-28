import java.util.Scanner;

public class HW3
{
    /**
     * Method takes Scanner object. Will ask
     * How many mids, based off that number will ask the following
     * questions based off how many mids the user inputs. 
     * 
     * Alpha      
     * First name
     * Last name
     * Company
     *  
     * @param in
     */
    public static Mid createMid(Scanner in)
    {
        Mid m = new Mid();
        System.out.print("Alpha? ");
        m.alpha = in.next();
        System.out.print("First Name? ");
        m.firstName = in.next();
        System.out.print("Last Name? ");
        m.lastName = in.next();
        System.out.print("Company? ");
        m.company = in.nextInt();
            
        return m; 
    }
    public static void printMid(Mid m)
    {
        System.out.println
            (m.alpha 
            + " " 
            + m.lastName
            + " " 
            + m.firstName 
            + " " 
            + m.company);
    }
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("How many mids? ");
        int numMids = in.nextInt();
        Mid[] m = new Mid[numMids];
        for(int i = 0; i < numMids; i++)
        {
            m[i] = createMid(in);
        }
        System.out.print("What company would you like to print out? ");
        int company = in.nextInt();
        for(int i = 0; i<numMids; i++)
        {
            if(m[i].company == company)
            {
                printMid(m[i]);
            }
        }
    }
}
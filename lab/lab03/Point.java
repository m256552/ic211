import java.util.*;

public class Point 
{
    private double x;
    private double y;
    /**
     * the constructor that initializes
     *  the points x & y appropriately:
     * @param x
     * @param y
     */
    public Point(double newx, double newy)
    {
        //done
        x = newx;
        y = newy;
    }  
    /**
     * the method that reads an x 
     * and a y value from the scanner and 
     * returns the associated point:
     * @param sc // passing the scanner in so that the next doubles can be read
     * @return
     */ 
    public static Point read(Scanner sc)
    {
        //reads the x and y variables that the user puts in
        
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        
        Point newPoint = new Point(x, y);
        // We want A.x == 6 and A.y == 3
        return newPoint;
    }  
    /**
     * the method that returns a String 
     * consisting of the x-coordinate, a space,
     * and the y-coordinate:
     */
    public String toString()
    {
        // this.x, this.y

        String s = "(" + this.x + ", " + this.y + ")";
        return s;

    }    
    /**
     * You know you're going to want a class Point. 
     * Go ahead and write it. Think first of what operations
     * you're likely to need, and then start writing them 
     * one-by-one. Make sure to have a you can use to test as you go.
     * Keep adding new code that tests each new function as you add it,
     * but don't get rid of the old tests.
     * When you're done with the program, main() should be a complete
     * test suite you can run to verify that Point works the way it should!
     * @param args
     */
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        Point add;
        while (true)
        {
            String keyword = in.next();
            if(keyword.equals("done"))
            {
                System.out.println("Goodbye");
                break;
            }
            else
            {
                if(keyword.equals("add"))
                {
                    add = Point.read(in);
                    System.out.println(add.toString());
                }
            }
        }
    }
}
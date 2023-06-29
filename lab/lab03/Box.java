import java.util.*;

    public class Box 
    {
        private double minX = 0;
        private double minY = 0;
        private double maxX = 0;
        private double maxY = 0;
        //Point minSize = 0;
        //Point maxSize = 0;

        // constructor for Box that consists of a single point
        public Box(Point p)
        {
            minX = p.getX();
            maxX = p.getX();
            maxY = p.getY();
            minY = p.getY();

        }
      
        // constructor for the Box containing two initial points
        public Box(Point a, Point b) 
        {
            /*
            if(a.x<b.x)
            {
                maxX = b.x;
                minX = a.x;
            }
            else
            {
            maxX = a.x;
            min.X = b.x;
            }
            if(a.y<b.y)
            {
                maxY = b.y;
                minY= a.y;
            }
            else
            {
                maxy = a.y;
                minY = b.y;
            }
            */
        }
      
        public static void main(String [] args)
        {
            Point p = new Point(5, 8);
            Box B = new Box(p);
            String s = p.toString();
            //System.out.println(minX + " " + maxX);
            System.out.println(s);
            System.out.print("Test");
        }

        // growBy(p) expands the bounding box (if needed) to include point p
        public void growBy(Point p)
        {


        }
      
        // given point p in the bounding box, returns associated point in the
        // unit square (see notes); returns null if p is not inside the bounding box.
        public Point mapIntoUnitSquare(Point p)
        { 

            return p;
        }
      
        // returns string representation like: 2.0 < x < 9.0, 3.0 < y < 7.0
        public String toString() 
        {  

            String s = 
                        minX
                        + " < " 
                        + "x " 
                        + "< "
                        + maxX
                        + ", "
                        + minY
                        + " < " 
                        + "y" 
                        + " < "
                        + maxY;
            
                        return s;
        }    
    }

/*
 * 
 * 
 * Point p = new Point(3,5);
 * Box B = new Box(p);
 * String s = B.toString();
 * System.out.println(s);
 * 
 * ... would print out
 * 3.0 < x < 3.0, 5.0 < y < 5.0
 *
 */
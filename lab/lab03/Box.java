import java.util.*;

    public class Box 
    {
        double minX = 0;
        double minY = 0;
        double maxX = 0;
        double maxY = 0;
        //Point minSize = 0;
        //Point maxSize = 0;

        // constructor for Box that consists of a single point
        public Box(Point p)
        {
            p.x = minX
            p.x = maxX;
            p.y = minY;
            p.y = maxY;

        }
      
        // constructor for the Box containing two initial points
        public Box(Point a, Point b) {  }
      
        public static void main(String [] args)
        {
            System.out.print("Test");
        }

        // growBy(p) expands the bounding box (if needed) to include point p
        public void growBy(Point p) {  }
      
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
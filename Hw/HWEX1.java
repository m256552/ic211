import java.util.*;

public class HWEX1
{
    public class HWEX1
    {
        public static Rat read()
        {
            Scanner sc = new Scanner(System.in);
            String nm = sc.next();
            double wt = sc.nextDouble();
            double wtInGrams = wt*28.3495;
            Rat r = new Rat();
            r.name = nm;
            r.weight = wtInGrams;
            return r;
        }

        public static void main(String[] args) 
        {
            Rat subj1 = read();
        }
    }
    
}

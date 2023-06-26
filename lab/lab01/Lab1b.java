import java.util.*;
public class Lab1b {
    public static void main(String [] args){
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.nextLine();
        System.out.print("Please input an integer: ");
        int n = in.nextInt();
        System.out.print("Please input a second integer: ");
        int k = in.nextInt();
        System.out.println("The two ints were " + n + " and " + k);
        int numerator = numerator(n, k);
        int denominator = denominator(k);
        double odds = (double)1/(numerator/denominator);
        
        System.out.print("numerator = " + numerator + "\n");
        System.out.print("denominator = " + denominator + "\n");
        System.out.print("odds = 1 in " + numerator / denominator + " = " + odds + "\n");
        System.out.print(name + "\n");

    }
    public static int denominator(int num){
        int factorial = 1;
        for(int i = 1; i<=num; i++)
        {
            factorial *=i;
        }
        return factorial;        
    }
    public static int numerator(int n, int k) //n = first number, k = second number
    {
        int tempval = 1;
        for(int val = n; val >= n-(k-1); val--)
        {
            System.out.println(tempval);
            tempval = tempval*val;
        }
        return tempval;
    }

}
import java.util.*;
public class Lab1c {
    
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        Random rand = new Random(System.currentTimeMillis());
        int ranNum = 10;
        ranNum = rand.nextInt(ranNum);
        ranNum = ranNum % 10;
        System.out.print("Guess a number between 0 and 10: ");
        int n = in.nextInt();
        if(n == ranNum)
        {
            System.out.print("Right after 1 guess!");
        }
        else
        {
            keepGuessing(ranNum, in);
        }
    }
    public static void keepGuessing(int ranNum, Scanner in){
        System.out.print("You idiot. Guess again: ");
        int guess = in.nextInt();
        int counter = 1;
        while(ranNum != guess)
        {
          System.out.print("You idiot. Guess again: ");
          counter++;
          guess = in.nextInt();
        }
            System.out.print("Correct after " + counter + " guesses!");
    }
}
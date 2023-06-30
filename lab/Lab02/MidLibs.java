import java.util.*;

public class MidLibs {

    public static void main(String[] args) {

        if(args.length != 2)
        {
            System.out.println("usage: java MidLibs <filename> <columns>");
            return;
        }
        String filename;
        int cols;
        filename = args[0];
        cols = Integer.parseInt(args[1]);
        String [] A;
        A = WordRead.get(filename);
        /////// Start Part 4 //////////
        /* 
        // This is how to get a random noun.
        String [] nouns = WordRead.get("nouns.txt");
        Random rand = new Random(890);
        int randomInt = rand.nextInt(nouns.length);
        String randomNoun = nouns[randomInt];

        //This is how to get a random adjective
        String [] adjectives = WordRead.get("adjectives.txt");
        int randomInt = rand.nextInt(adjectives.length); 
        String randomAdj = adjectives[randomInt];

        //This is how we get a random verb
        String [] verbs = WordRead.get("verbs.txt");
        String randomVerb = rand.nextInt(verbs.length);

        // This is how to make a noun plural
        String singleNoun = "dog";
        String pluralNoun = singleNoun + "s";

        // for every word in A:
        //   if A[i].equals("@nonp"):
        //      A[i] = random plural noun

        //////// End Part 4 ///////////
        */
        // for every word in A:
        //   if A[i].equals("@nonp"):
        //      A[i] = random plural noun
        for(int i = 0; i<A.length; i++)
        {
            if(A[i].equals("@nounp"))
            {
                String randomPluralNoun = MidLibs.getPluralNoun();
                A[i] = randomPluralNoun;
            }
            else if(A[i].equals("@verb"))
            {
                String randomVerb = MidLibs.getVerb();
                A[i] = randomVerb;
            }
            else if(A[i].equals("@noun"))
            {
                String randomNoun = MidLibs.getNoun();
                A[i] = randomNoun;
            }
            else if(A[i].equals("@adjective"))
            {
                String randomAdj = MidLibs.getAdjective();
                A[i] = randomAdj;
            }
        }
        Formatter.writeInColumns(A, cols);        
 
    }
    public static String getNoun()
    {
        String [] nouns = WordRead.get("nouns.txt");
        Random rand = new Random();
        int myrand = Math.abs(rand.nextInt() % nouns.length);
        String randomNoun = nouns[myrand];
        return randomNoun;
    }
    public static String getVerb()
    {
        //This is how we get a random verb
        String [] verbs = WordRead.get("verbs.txt");
        Random rand = new Random();
        int myrand = Math.abs(rand.nextInt() % verbs.length);
        String randomVerb = verbs[myrand];
        return randomVerb;
    }
    public static String getAdjective()
    {
        //This is how to get a random adjective
        String [] adjectives = WordRead.get("adjectives.txt");
        Random rand = new Random();
        int myrand = Math.abs(rand.nextInt() % adjectives.length);
        String randomAdj = adjectives[myrand];
        return randomAdj;
    }
    public static String getPluralNoun()
    {
        String [] pluralNouns = WordRead.get("nouns.txt");
        Random rand = new Random();
        int myrand = Math.abs(rand.nextInt() % pluralNouns.length);
        String randomPluralNoun = pluralNouns[myrand] + "s";
        return randomPluralNoun;
    }
}

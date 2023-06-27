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

        // This is how to get a random noun.
        String[] nouns = WordRead.get("nouns.txt");
        Random rand = new Random(890);
        String randomNoun = rand.nextInt(nouns.length);

        // This is how to make a noun plural
        String singleNoun = "dog";
        String pluralNoun = singleNoun + "s";



        // for every word in A:
        //   if A[i].equals("@nonp"):
        //      A[i] = random plural noun

        //////// End Part 4 ///////////

        Formatter.writeInColumns(A, cols);        
 
    }

}

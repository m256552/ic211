public class Formatter {


    /**
      * takes an array A of strings and a positive int "cols" and prints the strings from A out,
      * in order, separated by spaces, but never using more than "cols" 
      * characters (including spaces!) in a line.
      * Limitations: If any single word is longer than `col`, this function will freeze.
      * @param A Array of strings to print
      * @param cols Number of columns to limit the output to.
      */
    public static void writeInColumns(String[] A, int cols) {
        int currentCol = 0;
        for(int i = 0; i< A.length; i++) {
            // If printing the current string will put us over the column limit,
            // print a newline.
            if( currentCol + A[i].length() + 1 > cols) {
                System.out.print("\n");
                currentCol = 0;
            } else {
                if (i>0) { // don't print a space for the first value
                    System.out.print(" ");
                    currentCol = currentCol + 1;
                }
            }

            System.out.print(A[i]);
            currentCol = currentCol + A[i].length();
        }
    }



    /**
      * A main function for testing purposes.
      */
    public static void main(String[] args) {
        String[] testString = {
            "Four", "score", "and", "seven", "years",
            "ago", "our", "fathers", "set", "forth", "upon",
            "this", "land", "a", "new", "nation", "conceived",
            "in", "liberty", "and", "dedicated", "to", "the"
        };

        writeInColumns(testString, 10);
    }
}

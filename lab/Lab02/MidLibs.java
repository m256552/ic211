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
        //new code here where we put the
        //
        //
        //
        //
        Formatter.writeInColumns(A, cols);        
 
    }
}

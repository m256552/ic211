public class TwoDprob1 {

    public static void main(String[] args){
        double[][] vals =
        {
            {3.0, 6.0, 5.0, 5.0},
            {4.0, 5.0, 5.0, 5.0, 1.0}
        };
        System.out.print(avg(vals) + "\n");

    }
    public static double avg(double[][] twoD){
        double sum = 0;
        for (int i = 0; i<twoD.length; i++){
            for(int k = 0; k<twoD[i].length; k++)
            {
              sum = sum + twoD[i][k];
              System.out.print(sum + "\n");
            }
        }
        int totalLength = twoD.length*twoD[0].length;
        sum = sum/totalLength;
        return sum;
    }
}

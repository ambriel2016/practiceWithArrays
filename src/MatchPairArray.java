public class MatchPairArray {
    public static void main(String[] args) {
        // declaring two arrays
        int[] inArray1 = new int[]{ 1,7,6,5,9 };
        int[] inArray2 = new int[]{ 2,7,6,3,4 };

        for(int i = 0; i < inArray1.length; i++){
            for( int j = 0; j < inArray2.length; j++){
                if(inArray1[i] == inArray2[j]){
                        System.out.print("(" + inArray1[i] + "," + inArray2[j]+ ")");
                }
            }
        }
    }
}

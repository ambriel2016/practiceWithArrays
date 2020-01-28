import java.util.Scanner;

public class BackArray {
    public static void main(String[] args) {
        // declaring an array
        int num = 0;
        int[] inArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };

        for (int a = inArray.length -1; a >=0; a--){
            System.out.println(inArray[a]);

        }

    }
}

